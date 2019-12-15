package it.itis.cuneo;

public class DinDonDan {
    public static void main(String[] args) throws InterruptedException {
        /*Prima modalita per definire un thread*/
       /* Runnable campana1 = new Campana("din", 5);
        Thread thread1 = new Thread(campana1);
        thread1.start();*/
        Thread thread1 = new Thread(new Campana("din", 3));
        /*Seconda modalita per definire un thread*/
        Thread thread2 = new Thread(new Campana("don", 3));
        /*Terza modalita per definire un thread*/
        /*new Thread(new Campana("dan", 5)).start();*/
        Thread thread3 = new Thread(new Campana("dan", 3));

        thread1.start();
        thread1.sleep(10);
        thread2.start();
        thread2.sleep(10);
        thread3.start();
        thread3.sleep(10);
    }
}