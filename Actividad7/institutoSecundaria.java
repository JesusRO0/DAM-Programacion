package Actividad7;

public class institutoSecundaria extends centroEducativo{
    
    private int categoria_A;
    private int categoria_B;
    private int categoria_C;
    private int categoria_D;
    private int competiciones;
}

public institutoSecundaria(){

}

public institutoSecundaria(int categoria_A,int categoria_B,int categoria_C, int categoria_D,int competiciones){

    this.categoria_A = categoria_A;
    this.categoria_B = categoria_B;
    this.categoria_C = categoria_C;
    this.categoria_D = categoria_D;
    this.competiciones = competiciones;
}


    public int getCategoria_A() {
        return this.categoria_A;
    }

    public void setCategoria_A(int categoria_A) {
        this.categoria_A = categoria_A;
    }

    public int getCategoria_B() {
        return this.categoria_B;
    }

    public void setCategoria_B(int categoria_B) {
        this.categoria_B = categoria_B;
    }

    public int getCategoria_C() {
        return this.categoria_C;
    }

    public void setCategoria_C(int categoria_C) {
        this.categoria_C = categoria_C;
    }

    public int getCategoria_D() {
        return this.categoria_D;
    }

    public void setCategoria_D(int categoria_D) {
        this.categoria_D = categoria_D;
    }

    public int getCompeticiones() {
        return this.competiciones;
    }

    public void setCompeticiones(int competiciones) {
        this.competiciones = competiciones;
    }

    @Override
    public String toString() {
        return "{" +
            " categoria_A='" + getCategoria_A() + "'" +
            ", categoria_B='" + getCategoria_B() + "'" +
            ", categoria_C='" + getCategoria_C() + "'" +
            ", categoria_D='" + getCategoria_D() + "'" +
            ", competiciones='" + getCompeticiones() + "'" +
            "}";
    }
