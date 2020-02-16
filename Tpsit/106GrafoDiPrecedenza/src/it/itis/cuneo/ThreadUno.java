package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class ThreadUno extends Thread {

    Buffer valori;

    private int a;
    private int c = 6;

    public ThreadUno(Buffer buffer) {
        valori = buffer;
    }

    public void run(){
        valori.setX(valori.getA()*6);
        System.out.println("IL valore di X è di: " + valori.getX());
    }
}
