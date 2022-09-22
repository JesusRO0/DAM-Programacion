package Actividad9;

public class Main {

    public static void main(String[] args) {

        persona[] persona = new persona[4];
        persona persona1 = new persona("45159890A","Pérez López","Juan","Hombre",25,75.9);
        persona persona2 = new persona("45159890C","Rodriguez","Pedro","Hombre",29,60.2);
        persona persona3 = new persona("45159890D","Guitierrez","Laura","Mujer",18,80.5);
        persona persona4 = new persona("45159890F","Ramirez","Cristina","Mujer",20,72.1);

        persona[0] = persona1;
        persona[1] = persona2;
        persona[2] = persona3;
        persona[3] = persona4;

    }
    

    public void listarDni(){

        
    }
}
