package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class ThreadQuattro extends Thread {
    Buffer valori;

    public ThreadQuattro(Buffer buffer){
        valori = buffer;
    }

    public void run(){
        valori.setX(valori.getA() * 3);
        System.out.println("Il valore di X è di: " + valori.getX());
    }
}
