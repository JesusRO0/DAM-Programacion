package Actividad7;

public class institutoSecundaria extends centroEducativo{

    public class competicion{

        private int participacion;
        private String nombre_competicion;

        public competicion(){
            participacion=0;
            nombre_competicion="";
        }
        public competicion(){

        }
    }
    
    private char categorias;
    private competicionCentro = new competicionCentro();

public institutoSecundaria(){

    super();
    categorias=" ";
    compteticionCentro = new competicion(otro.competicion);
}

public institutoSecundaria(char categorias){

    super(todo lo demas);
    this.categorias = categorias;
}

public institutoSecundaria(institutoSecundaria otro){
    super(otro);
    this.categorias = otro.categorias;
}

    public int getCategorias() {
        return this.categorias;
    }

    public void setCategorias(char categorias) {
        this.categorias = categorias;
    }
    public int getCompeticiones() {
        return this.competiciones;
    }

    public void setCompeticiones(int competiciones) {
        this.competiciones = competiciones;
    }

    public void setCategorias(){
        if(getnumero_estudiante()>600){
            categorias="A";
        }
        if(getnumero_estudiante()>600 && getnumero_estudiante()<700){
            categorias="B";
        }
        if(getnumero_estudiante()>600 && getnumero_estudiante()<1000){
            categorias="C";
        }
        if(getnumero_estudiante()>600 && getnumero_estudiante()<1200){
            categorias="D";
        }
    }

    @Override
    public String toString() {
        return "{" +
            " categoria_A='" + getCategorias() + "'" +
            ", competiciones='" + getCompeticiones() + "'" +
            "}";
    }
}