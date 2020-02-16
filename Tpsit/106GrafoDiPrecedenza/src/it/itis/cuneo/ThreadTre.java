package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class ThreadTre extends Thread {

    Buffer valori;

    public ThreadTre(Buffer buffer){
        valori = buffer;
    }

    public void run(){
        valori.setZ(valori.getY()*2);
        System.out.println("Il valore di Z è di: " + valori.getZ());
    }
}
