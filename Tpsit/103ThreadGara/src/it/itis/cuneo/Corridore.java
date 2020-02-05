package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 30/01/2020.
 */
public class Corridore extends Thread {

    public static final int MAX=2;
    public static final int MIN=0;
    public static final int ARRIVO=10;
    public static final int RITARDO_MIN=500;
    public static final int RITARDO_MAX=1000;
    private String nome;
    private int somma;

    public Corridore(String nome) {
        this.nome = nome;
        this.somma=0;
    }
    public Corridore(){
        this.somma=0;
    }

    public void run(){
        int r=0;
        int delay=0;
        while (this.somma<=ARRIVO) {
            delay = (int) Math.round(Math.random() * (RITARDO_MAX - RITARDO_MIN)+RITARDO_MIN);
            try {
                this.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r = (int) Math.round(Math.random() * (MAX - MIN) + MIN);
            this.somma += r;
            System.out.println(this.nome + ": " + r + " - " + this.somma + " con un ritardo di: " + delay + " ms");
        }
        System.out.println(this.nome + " Ha concluso");
    }
}
