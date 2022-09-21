package Actividad9;

public class persona{

    private String dni;
    private String apellidos;
    private String nombre;
    private String sexo;
    private int edad;
    private double peso;

    public persona(){
        dni="";
        apellidos="";
        nombre="";
        sexo="";
        edad=0;
        peso=0.0;
    }

    public persona(String dni, String apellidos, String nombre, String sexo, int edad, double peso){

        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public persona(persona otro){

        this.dni = otro.dni;
        this.apellidos = otro.apellidos;
        this.nombre = otro.nombre;
        this.sexo = otro.sexo;
        this.edad = otro.edad;
        this.peso = otro.peso;
    }

    public void lista(){

        
    }
    
    @Override
    public String toString() {
        return "persona: apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + ", peso="
                + peso + ", sexo=" + sexo + ".";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    
}