package it.itis.cuneo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ThreadDecrementatore extends Thread{

    private static int MAX = 20;
    private Semaforo semaforo;
    private int threadId;

    public ThreadDecrementatore(Semaforo sem, int id){
        semaforo = sem;
        threadId = id;
    }

    public void run(){
        int decr=0, conta=0;
        while (MAX != 0) {
            decr=0;
            semaforo.up();
            MAX--;
            decr++;
            conta++;
            semaforo.down();
            System.out.println(" ID thread  " + threadId + " decrementi " + decr );
        }
        System.out.println("Valore finale: " + MAX + " e decrementi:  " + conta + " ID thread " + threadId);
    }

}
