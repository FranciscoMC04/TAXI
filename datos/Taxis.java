package Taxi.datos;

import Taxi.entidades.*;
import java.util.*;

public class Taxis {
    private static ArrayList<Taxi> taxis = new ArrayList<>();

    public static void registrarTaxi(Taxi taxi) {
        taxis.add(taxi);
    }

    public static void eliminarTaxi(Taxi taxi) {
        Taxi taxiEliminar=null;
        for (Taxi lisTaxi : taxis) {
            if (lisTaxi.getIdTaxi() == taxi.getIdTaxi()) {
                if (lisTaxi.getEstadoTaxi().equals("Libre") ||
                        lisTaxi.getEstadoTaxi().equals("L")){
                            taxiEliminar=lisTaxi;
                            break;
                    
                } 
            } 
        }
        if (taxiEliminar!=null) {
            taxis.remove(taxiEliminar);
        }
        

    }

    public static boolean buscarTaxi(Taxi taxi) {
        for (Taxi lisTaxi : taxis) {
            if (lisTaxi.getIdTaxi() == taxi.getIdTaxi()) {
                return true;
            }

        }

        return false;

    }
    public static Taxi retornaTaxi(Taxi taxi) {
       Taxi tax=null;
        for (Taxi lisTaxi : taxis) {
            if (lisTaxi.getIdTaxi() == taxi.getIdTaxi()) {
                return tax=lisTaxi;
            }

        }

        return tax;

    }

    public static void modificarTaxiOp(Taxi taxi,double costo) {
        for (Taxi lisTaxi : taxis) {
            if (lisTaxi.getIdTaxi() == taxi.getIdTaxi()) {
                lisTaxi.setIdTaxi(taxi.getIdTaxi());
                lisTaxi.setEstadoTaxi(taxi.cambioEstado());
                lisTaxi.setNumeroServicios(taxi.aumentoServicio());
                lisTaxi.setIngresoTotal(taxi.aumentoSueldo(costo));
                

            }

        }

      
    }
    public static void modificarTaxi(Taxi taxi) {
        for (Taxi lisTaxi : taxis) {
            if (lisTaxi.getIdTaxi() == taxi.getIdTaxi()) {
                lisTaxi.setConductor(new Conductor(taxi.getConductor().getNumeroDni()));
                lisTaxi.setIdTaxi(taxi.getIdTaxi());
                lisTaxi.setEstadoTaxi(taxi.getEstadoTaxi());
                lisTaxi.setNumeroServicios(taxi.getNumeroServicios());
                lisTaxi.setIngresoTotal(taxi.getIngresoTotal());
               

            }

        }

       
    }
    public static void modificarServicioEstado(Taxi tax){
        for (Taxi taxi : taxis) {
            if (taxi.getIdTaxi()==tax.getIdTaxi()) {
                taxi.setEstadoTaxi("Libre");
            }
        }
    }
    public static boolean verificarEstadoTaxi(int id){
        for (Taxi taxi : taxis) {
            if (taxi.getIdTaxi()==id) {
              if (taxi.getEstadoTaxi().equals("Libre")) {
                return true;
              }
            }
        }
        return false;
    }
    public static String mostrarDatosTaxiConductorPorID(Taxi taxi) {
        Taxi tax=retornaTaxi(taxi);
        for (Taxi taxi2 : taxis) {
            if (taxi2.getIdTaxi() == taxi.getIdTaxi()) {
                if (taxi2.getConductor().getNumeroDni().equals(tax.getConductor().getNumeroDni())) {
                    return taxi2.toString() + Conductores.mostrarDatos(tax.getConductor().getNumeroDni());
                } else {
                    return "No maneja este taxi";
                }
            } else {
                return "No existe";
            }
        }
        return "";
    }
    public static String datosTaxi(Taxi taxiE ){
        for (Taxi taxi : taxis) {
            if (taxi.getConductor().getNumeroDni().equals(taxiE.getConductor().getNumeroDni())) {
                return taxi.toString();
            }
        }
        return null;
    }
}
