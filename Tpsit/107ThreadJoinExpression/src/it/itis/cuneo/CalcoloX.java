package it.itis.cuneo;

public class CalcoloX extends Thread {

    Buffer valori;

    public CalcoloX(Buffer dati){
        valori = dati;
    }

    public void run(){
        valori.setX(valori.getA() + 4 * valori.getB());
        System.out.println("Il valore di X è di: " + valori.getX());
    }
}
