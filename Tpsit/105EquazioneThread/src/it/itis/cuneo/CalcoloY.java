package it.itis.cuneo;

public class CalcoloY extends Thread {
    Buffer risultato;

    public CalcoloY(Buffer dati){
        this.risultato = dati;
    }

    public void run(){
        risultato.y = risultato.x * risultato.t; /*il calcolo funziona solamente con la forma scritta e non cont risultato.y = x*t;*/
        System.out.println("Il risultato vale: " + risultato.y);
    }
}
