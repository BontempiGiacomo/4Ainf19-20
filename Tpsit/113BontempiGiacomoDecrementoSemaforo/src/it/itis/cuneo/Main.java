package it.itis.cuneo;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo(0);
        int MAX = 20;

        ThreadDecrementatore thread1 = new ThreadDecrementatore(semaforo, 1);
        ThreadDecrementatore thread2 = new ThreadDecrementatore(semaforo, 2);
        ThreadDecrementatore thread3 = new ThreadDecrementatore(semaforo, 3);

        System.out.println("Valore iniziale: " + MAX);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
