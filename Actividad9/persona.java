package Actividad9;
import java.util.*;

public class persona{

    public static int length;
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

    public void mostrar(){

        persona[] persona = new persona[4];
        persona persona1 = new persona("45159890A","Pérez López","Juan","Hombre",25,75.9);
        persona persona2 = new persona("45159890C","Rodriguez","Pedro","Hombre",29,60.2);
        persona persona3 = new persona("45159890D","Guitierrez","Laura","Mujer",18,80.5);
        persona persona4 = new persona("45159890F","Ramirez","Cristina","Mujer",20,72.1);

        persona[0] = persona1;
        persona[1] = persona2;
        persona[2] = persona3;
        persona[3] = persona4;

        for(int i=0;i<persona.length;i++){

            System.out.println(persona[i]);
        }
        
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