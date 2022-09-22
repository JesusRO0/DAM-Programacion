package Actividad9;
import java.util.*;

public class Empleado extends persona{
    
    private int sueldo;

    public Empleado(){

        sueldo = 0;
    }

    public Empleado(String dni, String apellidos, String nombre, int edad, int peso, int sueldo){

        super();
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    
}
