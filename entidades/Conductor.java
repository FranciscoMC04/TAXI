package Taxi.entidades;

public class Conductor {
    private String numeroDni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    private char categoria;
    private int numeroLicencia;

    public Conductor(String numeroDni) {
        this.numeroDni = numeroDni;
    }
   
    public Conductor(String numeroDni, String nombre, String apellidos,
            String direccion, int telefono, char categoria, int numeroLicencia) {
        this.numeroDni = numeroDni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.categoria = categoria;
        this.numeroLicencia = numeroLicencia;
    }
    public String getNumeroDni() {
        return numeroDni;
    }
    public void setNumeroDni(String numeroDni) {
        this.numeroDni = numeroDni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public char getCategoria() {
        return categoria;
    } 
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    public int getNumeroLicencia() {
        return numeroLicencia;
    }
    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public String toString() {
        
        return "\nConductor : " + "DNI: "+getNumeroDni()
        + "\nNombre :" + getNombre()
        + "\nApellidos: "+getApellidos()
        + "\nDireccion :"+getDireccion()
        + "\nTelefono: "+ getTelefono()
        + "\nCategoria: "+ getCategoria()
        + "\nNúmero Licencia: "+getNumeroLicencia();
    }
}
