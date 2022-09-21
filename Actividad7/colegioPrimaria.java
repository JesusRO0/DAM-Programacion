package Actividad7;

public class colegioPrimaria extends centroEducativo{

    private int alumnos;
    private int profesores;
    private int evento_mensual;
    private int evento_complementario;
}

public colegioPrimaria(){

}

public colegioPrimaria(int alumnos,int profesores, int evento_mensual, int evento_complementario){

    this.alumnos= alumnos;
    this.profesores= profesores;
    this.evento_mensual = evento_mensual;
    this.evento_complemetario = evento_complementario;
}

    public int getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public int getProfesores() {
        return this.profesores;
    }

    public void setProfesores(int profesores) {
        this.profesores = profesores;
    }

    public int getEvento_mensual() {
        return this.evento_mensual;
    }

    public void setEvento_mensual(int evento_mensual) {
        this.evento_mensual = evento_mensual;
    }

    public int getEvento_complementario() {
        return this.evento_complementario;
    }

    public void setEvento_complementario(int evento_complementario) {
        this.evento_complementario = evento_complementario;
    }

    public void clone(this.colegioPrimaria){

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
