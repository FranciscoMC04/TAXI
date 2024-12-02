package Taxi.entidades;

import java.util.ArrayList;

public class AsignaciónServicio {


    private Taxi taxi;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionOrigenCliente;
    private String direccionDestinoCliente;
    private double costoServicio;  
    //ArrayList<AsignaciónServicio>asignacion=new ArrayList<>();
    public AsignaciónServicio(String nombreCliente, String apellidoCliente, String direccionOrigenCliente,
            String direccionDestinoCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccionOrigenCliente = direccionOrigenCliente;
        this.direccionDestinoCliente = direccionDestinoCliente;
    }
   /*  public AsignaciónServicio(ArrayList<AsignaciónServicio> asignacion) {
        this.asignacion = asignacion;
    }
    public AsignaciónServicio(Taxi taxi,ArrayList<AsignaciónServicio> asignacion, double costoServicio) {
        this.asignacion = asignacion;
        this.taxi = taxi;
        this.costoServicio=costoServicio;
    }
   
    public ArrayList<AsignaciónServicio> getAsignacion() {
        return asignacion;
    }
    public void setAsignacion(ArrayList<AsignaciónServicio> asignacion) {
        this.asignacion = asignacion;
    }*/
    public AsignaciónServicio(Taxi taxi) {
        this.taxi = taxi;
    }
    public AsignaciónServicio(Taxi taxi, String nombreCliente) {
        this.taxi = taxi;
        this.nombreCliente = nombreCliente;
    }

    public AsignaciónServicio(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public AsignaciónServicio(Taxi taxi, String nombreCliente, String apellidoCliente,
            String direccionOrigenCliente, String direccionDestinoCliente,double costoServicio) {
        this.taxi = taxi;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccionOrigenCliente = direccionOrigenCliente;
        this.direccionDestinoCliente = direccionDestinoCliente;
        this.costoServicio=costoServicio;

    }
    public Taxi getTaxi() {
        return taxi;
    }
    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getApellidoCliente() {
        return apellidoCliente;
    }
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    public String getDireccionOrigenCliente() {
        return direccionOrigenCliente;
    }
    public void setDireccionOrigenCliente(String direccionOrigenCliente) {
        this.direccionOrigenCliente = direccionOrigenCliente;
    }
    public String getDireccionDestinoCliente() {
        return direccionDestinoCliente;
    }
    public void setDireccionDestinoCliente(String direccionDestinoCliente) {
        this.direccionDestinoCliente = direccionDestinoCliente;
    }
    public double getCostoServicio() {
        return costoServicio;
    }
    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }
    @Override
    public String toString() {
       
        return "Asignacion :" + "ID TAXI: " + getTaxi().getIdTaxi()
        + "Nombre Cliente: "+ getNombreCliente()
        + "Dirección de origen: " +getDireccionOrigenCliente()
        +" Direccion destino: " +getDireccionDestinoCliente();
    }
    /*public void Cliente(ArrayList<AsignaciónServicio> as){
        asignacion.add(new AsignaciónServicio(as));
    }*/
  
    public String datosCortos(){
        return "\nID TAXI: " + getTaxi().getIdTaxi() 
        +"\nNombre Cliente: "+ getNombreCliente()
        +"\nDirección de origen: " +getDireccionOrigenCliente()
        +"\n Direccion destino: " +getDireccionDestinoCliente()
        +"\nMonto del servicio"+ getCostoServicio();
    }
}
