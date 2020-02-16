package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class ThreadDue extends Thread {

    Buffer valori;

    public ThreadDue(Buffer buffer){
        valori = buffer;
    }

    public void run(){
        valori.setY(valori.getX() + 3);
        System.out.println("Il valore di Y è di: " + valori.getY());
    }

}
