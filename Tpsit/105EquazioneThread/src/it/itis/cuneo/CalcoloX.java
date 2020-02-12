package it.itis.cuneo;

public class CalcoloX extends Thread {
    Buffer valore;

    private double s = 4;
    private double d = 2;
    private double f = 5;
    private double b;

    public CalcoloX(Buffer dati){
        this.valore = dati;
        this.b = valore.b;
    }

    public void run(){
        valore.x = s*(b - d) + f;
        System.out.println("Il valore di x è di: " + valore.x);
    }
}
