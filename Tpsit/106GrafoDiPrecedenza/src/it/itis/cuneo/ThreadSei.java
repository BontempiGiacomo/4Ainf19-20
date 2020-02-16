package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class ThreadSei extends Thread {

    Buffer valori;

    public ThreadSei(Buffer buffer){
        valori = buffer;
    }

    public void run(){
        valori.setZ(valori.getY() * 5);
        System.out.println("Il valore di Z è di: " + valori.getZ());
    }
}
