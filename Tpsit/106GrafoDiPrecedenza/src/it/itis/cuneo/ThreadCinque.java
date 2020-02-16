package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class ThreadCinque extends Thread {

    Buffer valori;

    public ThreadCinque(Buffer buffer){
        valori = buffer;
    }

    public void run(){
        valori.setY(valori.getX() + 4);
        System.out.println("Il valore di Y è di: " + valori.getY());
    }
}
