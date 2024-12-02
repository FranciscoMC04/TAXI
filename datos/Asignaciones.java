package Taxi.datos;

import java.util.*;

import Taxi.entidades.AsignaciónServicio;
import Taxi.entidades.Taxi;
public class Asignaciones {
    private static ArrayList<AsignaciónServicio> asignaciones = new ArrayList<>();
    

    public static String registrarAsignacion(AsignaciónServicio asignacion) {

            Taxi tax=null;
            if (Taxis.buscarTaxi(asignacion.getTaxi())) {
                if (Taxis.verificarEstadoTaxi(asignacion.getTaxi().getIdTaxi())) {
                   /*Taxi taxi = new Taxi(asignacion.getTaxi().getIdTaxi(), "Ocupado", asignacion.getTaxi().getIngresoTotal(), asignacion.getTaxi().getNumeroServicios());
                    Taxis.modificarTaxiOp(taxi);  */ 
                    tax=Taxis.retornaTaxi(asignacion.getTaxi());
                    Taxis.modificarTaxiOp(tax,asignacion.getCostoServicio()); 
                    asignaciones.add(asignacion);
                   
                }else return "SE ENCUENTRA POR EL MOMENTO OCUPADO";
               
            }else return "NO ENCONTRADO EL TAXI";

        return "";
    
    }
    public static AsignaciónServicio retornarServicio(AsignaciónServicio as){
        for (AsignaciónServicio asignaciónServicio : asignaciones) {
            if (asignaciónServicio.getTaxi().getIdTaxi()==as.getTaxi().getIdTaxi()) {
                return asignaciónServicio;
            }
        }
        return null;
    }
    public static String serviosTaxi(AsignaciónServicio as){
    
        StringBuilder datos = new StringBuilder();
        Taxi tax = Taxis.retornaTaxi(as.getTaxi());
        for (AsignaciónServicio asignaciónServicio : asignaciones) {
                if (asignaciónServicio.getTaxi().getIdTaxi()==retornarServicio(as).getTaxi().getIdTaxi()) {
                    //datos.append( retornarServicio(as).datosCortos() + tax.datosCortos()).append("\n");
                    datos.append("ID TAXI: ").append(asignaciónServicio.getTaxi().getIdTaxi())
                    .append("\nNombre Cliente: ").append(asignaciónServicio.getNombreCliente())
                    .append("\nDirección de origen: ").append(asignaciónServicio.getDireccionOrigenCliente())
                    .append("\nDireccion destino: ").append(asignaciónServicio.getDireccionDestinoCliente())
                    .append("\nMonto del servicio: ").append(asignaciónServicio.getCostoServicio())
                    .append("\n").append(tax.datosCortos())
                    .append("\n-------------------------------\n");
                }else{
                    return " auto no encontrado";
                }
            
        }

        if (asignaciones.size()==0) {
            return " no asignaciones";
        }else{
            return datos.toString();
        }
      
    
    }

    public static void  finalizarServicio(AsignaciónServicio asignaciónServicio){
        Taxi tax=null;
        for (AsignaciónServicio asignación : asignaciones) {
            if (asignación.getNombreCliente().equals(asignaciónServicio.getNombreCliente())) {
                tax=Taxis.retornaTaxi(asignación.getTaxi());
                tax.setEstadoTaxi("Libre");
            }
        }
       
    }
    
}
