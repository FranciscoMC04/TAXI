package Taxi.datos;

import Taxi.entidades.Conductor;
import Taxi.entidades.Taxi;

import java.util.*;

public class Conductores {
    private static ArrayList<Conductor> conductores = new ArrayList<>();
    // private static ArrayList<Taxis> taxis = new ArrayList<>();

    public static void registrarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public static void eliminarConductor(Conductor conductor) {
        Conductor conductorAEliminar = null;
        for (Conductor listaConducto : conductores) {
            if (listaConducto.getNumeroDni().equals(conductor.getNumeroDni())) {
                conductorAEliminar = listaConducto;
                break;
            }
        }
        if (conductorAEliminar != null) {
            conductores.remove(conductorAEliminar);
        }
    }

    public static String modificarConductor(Conductor conductor) {
        for (Conductor listConductor : conductores) {
            if (listConductor.getNumeroDni().equals(conductor.getNumeroDni())) {
                listConductor.setNombre(conductor.getNombre());
                listConductor.setApellidos(conductor.getApellidos());
                listConductor.setDireccion(conductor.getDireccion());
                listConductor.setTelefono(conductor.getTelefono());
                listConductor.setCategoria(conductor.getCategoria());
                listConductor.setNumeroLicencia(conductor.getNumeroLicencia());
                return "Modificación exitosa";

            }

        }

        return "No existe";
    }

    public static ArrayList<Conductor> mostrarConductorCategoria(char categoria) {
        ArrayList<Conductor> conductoreCategoria = new ArrayList<>();

        for (Conductor conductor : conductores) {
            if (conductor.getCategoria() == categoria) {
                conductoreCategoria.add(conductor);
            }
        }

        return conductoreCategoria;
    }

    public static String mostrarConductoresTaxi(Taxi taxi) {
        String c = null;
        String t1 = null;
        for (Conductor conductores : conductores) {
            if (taxi.getConductor().getNumeroDni().equals(conductores.getNumeroDni())) {
                c = conductores.toString();
                t1 = Taxis.datosTaxi(taxi);

            }

        }

        return c +"\n"+ t1;
    }
    public static String mostrarDatos(String dni){
       for (Conductor conductor : conductores) {
            if (conductor.getNumeroDni().equals(dni)) {
                return conductor.toString();
            }
       }
       
        return ""; 
    }
}
