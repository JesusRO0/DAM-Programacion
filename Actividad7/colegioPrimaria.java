package Actividad7;

public class colegioPrimaria extends centroEducativo{

    private String evento;

}

public colegioPrimaria(){

    super();
    evento="";
}

public colegioPrimaria(String evento_mensual,String nombre_centro, int numero_profesores, int numero_alumnos, String postal){

    super(nombre_centro, numero etc)
    this.evento = evento;
}


    public int getEvento() {
        return this.evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public colegioPrimaria(colegioPrimaria otro){

        super(otro);
        this.evento = evento;
    }

    public void setNumero_estudiante(int numero_estudiante){

        if(numero_estudiante>0 && numero_estudiante<=600){

            super.setNumero_estudiante(numero_estudiante);

        }else super.setNumero_estudiante(0);
    }

    public void setNumero_profesores(int setNumero_profesores){

        if(setNumero_profesores>0 && setNumero_profesores<=600){

            super.setNumero_profesores(setNumero_profesores);

        }else super.setNumero_profesores(0);
    }

    public void anunciaEvento(){

        System.out.println("Este mes el evento que tendra lugar en "+ getNombre_Centro()+ " es "+ evento + ".");
    }

    public void anunciaEvento(String evento_complementario){
        anunciaevento();
        System.out.println("Ademas tambien este evento:"+ evento_complementario+ ".");
    }
    @Override
    public String toString() {
        return "{" +
            " alumnos='" + getAlumnos() + "'" +
            ", profesores='" + getProfesores() + "'" +
            ", evento_mensual='" + getEvento_mensual() + "'" +
            ", evento_complementario='" + getEvento_complementario() + "'" +
            "}";
    }
