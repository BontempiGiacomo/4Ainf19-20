package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 07/10/2019.
 */


public class Segmento {

    //attributi
    private Punto punto1;
    private Punto punto2;

    //metodi
        //costruttore di copia
    /* public Segmento(Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }*/
//--------------------------------------------------------------------------------------
    //creo due costruttori
    public Segmento(Punto punto1, Punto punto2){
        this.punto1 = new Punto(punto1.getX(), punto1.getY());
        this.punto2 = new Punto(punto2.getX(), punto2.getY());
    }

    //questo metodo è uguale a quello di sopra invoca il costruttore di copia; questo metodo è meglio
    /**
     * public Segmento(Punto puntoUno, Punto puntoDue){
     * this.punto1 = new Punto(puntoUno);
     * this.punto2 = new Punto(puntoDue);
     }*/

    public void setPunto1(Punto punto1) {
        this.punto1 = new Punto(punto1);
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = new Punto(punto2);
        //this.punto2 = punto2; //se deferenzio il parametro perdo il contenuto
    }

    public Punto getPunto2() {
        return punto2;
    }


    //questo deve essere fatto per quando faccio
    public Segmento(Segmento segmento){
        this.punto1 = new Punto(segmento.getPunto1());
        this.punto2 = new Punto(segmento.getPunto2());
    }



    /*public String toString(){
        return "Segmento: punto1 x: " + this.punto1.getX() + ", y: " + this.punto1.getY() +
                 " punto2 x: " + this.punto2.getX() + ", y : " + this.punto2.getY();
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(5, 6);
        Punto punto2 = new Punto(3, 2);
         Segmento segm = new Segmento(punto1, punto2);
        System.out.println(segm.toString());
    }
*/
}

//il costruttore di copia lo si usa quando si hanno  dei wrapper
