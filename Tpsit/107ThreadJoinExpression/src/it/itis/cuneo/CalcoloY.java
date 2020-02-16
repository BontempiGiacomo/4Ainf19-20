package it.itis.cuneo;

public class CalcoloY extends Thread {

    Buffer valori;

    public CalcoloY(Buffer dati){
        valori = dati;
    }

    public void run(){
        valori.setY(valori.getA() + 5 * valori.getB());
        System.out.println("Il valore di Y è di: " + valori.getY());
    }
}
