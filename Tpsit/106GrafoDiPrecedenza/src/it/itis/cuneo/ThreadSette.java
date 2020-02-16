package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class ThreadSette extends Thread{

    Buffer valori1;
    Buffer valori2;

    public ThreadSette(Buffer buffer1, Buffer buffer2){
        valori1 = buffer1;
        valori2 = buffer2;
    }

    public void run(){
        valori1.setW(valori1.getZ() + valori2.getZ());
        System.out.println("Il valore di W è di: " + valori1.getW());
    }

}
