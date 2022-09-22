package Actividad9;
import java.util.*;

public class Estudiante extends persona{
    
    private String nivel;

    public Estudiante(){

        nivel = "";
    }

    public Estudiante(String nivel, String dni, String apellidos, String nombre, int edad, int peso){

        super();
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
}
