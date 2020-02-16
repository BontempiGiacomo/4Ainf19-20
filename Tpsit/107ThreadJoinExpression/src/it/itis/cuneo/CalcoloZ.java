package it.itis.cuneo;

public class CalcoloZ extends Thread {

    Buffer valori1;
    Buffer valori2;

    public CalcoloZ(Buffer dati1, Buffer dati2){
        valori1 = dati1;
        valori2 = dati2;
    }

    public void run(){
        valori1.setZ(valori1.getX() * valori2.getY());
        System.out.println("Il risultato finale è di: " + valori1.getZ());
    }

}
