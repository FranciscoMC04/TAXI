package Taxi.presentacion;

import java.util.ArrayList;
import java.util.Scanner;
import Taxi.datos.*;
import Taxi.entidades.*;

public class main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        do {
            System.out.println("MENU: ");
            System.out.println("1.REGISTRAR UNIDAD DE TAXI");
            System.out.println("2.REGISTRAR DATOS DE CONDUCTORES");
            System.out.println("3.REPORTAR CONDUCTORES POR CATEGORIA");
            System.out.println("4.MODIFICAR DATOS DE CONDUCTOR");
            System.out.println("5.MODIFICAR DATOS DE TAXI");
            System.out.println("6.ELIMINAR DATOS DE TAXI");
            System.out.println("7.ELIMINAR CONDUTOR");
            System.out.println("8.CONSULTA POR CONDUCTOR Y TAXI EN USO");
            System.out.println("9.CONSULTA POR ID DE TAXI Y SU CONDUCTOR");
            System.out.println("10.ASIGNAR SERVIVIO A UN TAXI");
            System.out.println("11.FINALIZAR SERVICIO");
            System.out.println("12.MOSTRAR SERVICIOS DE UN TAXI");
            System.out.println("13.Salir");

            option = in.nextInt();

            switch (option) {
                case 1:
                    registrarTaxi();
                    break;
                case 2:
                    registrarConductor();
                    break;
                case 3:
                    System.out.println(reportarConductoresCategoria());
                    break;
                case 4:
                    modificarDatosConductor();
                    break;
                case 5:
                    modificarTaxi();
                    break;
                case 6:
                    eliminarTaxi();
                    break;
                case 7:
                    eliminarConductor();
                    break;
                case 8:
                    System.out.println(consultaConductorTaxi());
                    break;
                case 9:
                    System.out.println(consultarTaxiConductor());
                    break;
                case 10:
                    System.out.println(asignacionServicio());
                    break;

                case 11:
                        finalizarServicio();;
                    break;
                case 12:
                System.out.println( mostrarCliente());     
               
                    break;
                default:
                    break;
            }
        } while (option != 13);
    }

    public static void registrarTaxi() {
        System.out.println("ID DEL TAXI");
        int idTaxi = in.nextInt();
        in.nextLine();
        System.out.println("ESTADO DEL TAXI");
        String estadoTaxi = in.nextLine();
        System.out.println("DNI CONDUCTOR");
        String numeroDni = in.nextLine();
        System.out.println("Numero de Servicios {OBLIGATRIO INICIALMENTE IGUAL CERO}");
        System.out.println("INGRESO TOTAL {OBLIGATRIO INICIALMENTE IGUAL CERO}");
        Conductor conductor = new Conductor(numeroDni);
        Taxi taxi = new Taxi(conductor, idTaxi, estadoTaxi, 0, 0);
        Taxis taxis = new Taxis();
        taxis.registrarTaxi(taxi);
    }

    public static void registrarConductor() {
        System.out.println("Numero de DNI");
        in.nextLine();
        String numeroDNI = in.nextLine();
        System.out.println("Nombre");
        String nombre = in.nextLine();
        System.out.println("Apellido");
        String apellido = in.nextLine();
        System.out.println("Direcciòn");
        String direccion = in.nextLine();
        System.out.println("Telefono");
        int telefono = in.nextInt();
        System.out.println("CATEGORIA [A,B,C...]");
        char categoria = in.next().charAt(0);
        System.out.println("Licencia de conducir");
        int licencia = in.nextInt();
        Conductor conductor = new Conductor(numeroDNI, nombre,
                apellido, direccion, telefono, categoria, licencia);
        Conductores conductores = new Conductores();
        conductores.registrarConductor(conductor);
    }

    public static String reportarConductoresCategoria() {
        System.out.println("CATEGORIA DE LOS CONDUCTORES ");
        char categoria = in.next().charAt(0);
        StringBuilder datos = new StringBuilder();
        Conductores conductores = new Conductores();
        ArrayList<Conductor> conductors = conductores.mostrarConductorCategoria(categoria);
        for (Conductor conductor : conductors) {
            datos.append(conductor.toString()).append("\n");
        }
        if (conductors.size() == 0) {
            return " no conductores";
        } else {
            return datos.toString();
        }
        // return conductors.size();
    }

    public static void modificarDatosConductor() {
        System.out.println("Numero de DNI");
        in.nextLine();
        String numeroDNI = in.nextLine();
        System.out.println("Nombre");
        String nombre = in.nextLine();
        System.out.println("Apellido");
        String apellido = in.nextLine();
        System.out.println("Direcciòn");
        String direccion = in.nextLine();
        System.out.println("Telefono");
        int telefono = in.nextInt();
        System.out.println("CATEGORIA [A,B,C...]");
        char categoria = in.next().charAt(0);
        System.out.println("Licencia de conducir");
        int licencia = in.nextInt();
        Conductor conductor = new Conductor(numeroDNI, nombre,
                apellido, direccion, telefono, categoria, licencia);
        Conductores conductores = new Conductores();
        conductores.modificarConductor(conductor);
    }

    public static void modificarTaxi() {
        System.out.println("ID DEL TAXI");
        int idTaxi = in.nextInt();
        in.nextLine();
        System.out.println("ESTADO DEL TAXI");
        String estadoTaxi = in.nextLine();
        System.out.println("DNI CONDUCTOR");
        String numeroDni = in.nextLine();
        System.out.println("Numero de Servicios {OBLIGATRIO INICIALMENTE IGUAL CERO}");
        System.out.println("INGRESO TOTAL {OBLIGATRIO INICIALMENTE IGUAL CERO}");
        Conductor conductor = new Conductor(numeroDni);
        Taxi tax = Taxis.retornaTaxi(new Taxi(idTaxi));
        ;
        Taxis taxis = new Taxis();
        Taxi taxi = new Taxi(conductor, idTaxi, estadoTaxi, tax.getNumeroServicios(), tax.getIngresoTotal());
        taxis.modificarTaxi(taxi);
    }

    public static void eliminarTaxi() {
        System.out.println("ID DEL TAXI");
        int idTaxi = in.nextInt();
        Taxi taxi = new Taxi(idTaxi);
        Taxis taxis = new Taxis();
        taxis.eliminarTaxi(taxi);
    }

    public static void eliminarConductor() {
        System.out.println("Numero de DNI");
        in.nextLine();
        String numeroDNI = in.nextLine();
        Conductor conductor = new Conductor(numeroDNI);
        Conductores conductores = new Conductores();
        conductores.eliminarConductor(conductor);
    }

    public static String consultaConductorTaxi() {
        System.out.println("DNI DEL CONDUCTOR");
        in.nextLine();
        String dniConductor = in.nextLine();
        Conductor conductor = new Conductor(dniConductor);
        Taxi taxi = new Taxi(conductor);
        Conductores conductores = new Conductores();
        return conductores.mostrarConductoresTaxi(taxi);
    }

    public static String consultarTaxiConductor() {
        System.out.println("ID del Taxi");
        int idTaxi = in.nextInt();
        Taxi taxi2 = new Taxi(idTaxi);
        Taxis taxi = new Taxis();

        return taxi.mostrarDatosTaxiConductorPorID(taxi2);
    }

    public static String asignacionServicio() {
        System.out.println("ID TAXI");
        int idTaxi = in.nextInt();
        Taxi taxi = new Taxi(idTaxi);
        if (Taxis.verificarEstadoTaxi(idTaxi)) {
            System.out.println("Nombre del cliente");
            in.nextLine();
            String nombreCliente = in.nextLine();
            System.out.println("Apellido del Cliente");
          
            String apellidoCliente = in.nextLine();
            System.out.println("Dirección de Origen");
           
            String direccionOrigen = in.nextLine();
            System.out.println("Direccion de destino");
           
            String direccionDestino = in.nextLine();
            System.out.println("Costo del servicio");
            double costoServicio = in.nextDouble();
            AsignaciónServicio asignaciónServicio = new AsignaciónServicio(taxi, nombreCliente, apellidoCliente,
                    direccionOrigen, direccionDestino, costoServicio);
            Asignaciones asignaciones = new Asignaciones();
            String mensaje = asignaciones.registrarAsignacion(asignaciónServicio);
            return mensaje;
        }else return "Taxi en servicio";


    }

    public static void finalizarServicio() {
        System.out.println("NOMBRE DEL CLIENTE");
        in.nextLine();
        String nombreCliente=in.nextLine();
        AsignaciónServicio asignaciónServicio= new AsignaciónServicio(nombreCliente);
        Asignaciones asignaciones = new Asignaciones();
        asignaciones.finalizarServicio(asignaciónServicio);;
    }

    public static String mostrarCliente(){
        System.out.println("ID TAXI");
        int idTaxi=in.nextInt();
        Taxi taxi= new Taxi(idTaxi);
      AsignaciónServicio asignaciónServicio = new AsignaciónServicio(taxi);
      Asignaciones asignaciones = new Asignaciones();
      String datos=asignaciones.serviosTaxi(asignaciónServicio);
      return datos;
    }
}