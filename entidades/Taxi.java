package Taxi.entidades;

public class Taxi {

    private Conductor Conductor;
    private int idTaxi;
    private String estadoTaxi;
    private int numeroServicios;
    private double ingresoTotal;

    public Taxi(Conductor conductor, int idTaxi, String estadoTaxi, int numeroServicios, double ingresoTotal) {
        this.Conductor = conductor;
        this.idTaxi = idTaxi;
        this.estadoTaxi = estadoTaxi;
        this.numeroServicios = numeroServicios;
        this.ingresoTotal = ingresoTotal;

    }
    public Taxi(Conductor conductor){
        this.Conductor=conductor;
    }
    public Taxi(int idTaxi,Conductor conductor) {
        this.idTaxi = idTaxi;
        this.Conductor=conductor;
    }
    
    public Taxi(int idTaxi, String estadoTaxi) {

        this.idTaxi = idTaxi;
        this.estadoTaxi = estadoTaxi;

    }
 
    public Taxi(int idTaxi) {

        this.idTaxi = idTaxi;
        

    }
    public Taxi(int idTaxi, String estadoTaxi, double ingresoTotal, int numeroServicios) {

        this.idTaxi = idTaxi;
        this.estadoTaxi = estadoTaxi;
        this.ingresoTotal = ingresoTotal;
        this.numeroServicios=numeroServicios;

    }

    public Conductor getConductor() {
        return Conductor;
    }

    public void setConductor(Conductor conductor) {
        Conductor = conductor;
    }

    public int getIdTaxi() {
        return idTaxi;
    }

    public void setIdTaxi(int idTaxi) {
        this.idTaxi = idTaxi;
    }

    public String getEstadoTaxi() {
        return estadoTaxi;
    }

    public void setEstadoTaxi(String estadoTaxi) {
        this.estadoTaxi = estadoTaxi;
    }

    public int getNumeroServicios() {
        return numeroServicios;
    }

    public void setNumeroServicios(int numeroServicios) {
        this.numeroServicios = numeroServicios;
    }

    public double getIngresoTotal() {
        return ingresoTotal;
    }

    public void setIngresoTotal(double ingresoTotal) {
        this.ingresoTotal = ingresoTotal;
    }
    public int aumentoServicio(){
       return this.numeroServicios+=1;
    }
    public String cambioEstado(){
        return this.estadoTaxi="Ocupado";
    }
    public double aumentoSueldo(double ingreso){
        return this.ingresoTotal+=ingreso;
    }
    @Override
    public String toString() {

        return "\nTaxi CON" + " ID : " + getIdTaxi()
              //  + "DNI CONDUCTOR: " + getConductor()
              + "\nEstado Taxi :" + getEstadoTaxi()
              + "\nNumero de Servicios:" + getNumeroServicios()
              + "\nIngreso Total: " + getIngresoTotal();

    }

    public String datosCortos(){
        return
        "\n Monto total Recaudado :"+getIngresoTotal();
    }
}