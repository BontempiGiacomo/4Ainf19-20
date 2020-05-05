package it.itis.cuneo;

public class Semaforo {
    private int val;

    public Semaforo(){
        val=0;
    }

    public Semaforo(int v){
        val = v;
    }

    public synchronized void up(){
        val++;
        notify();
    }

    public synchronized void down(){
        while (val==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        val--;
    }
}
