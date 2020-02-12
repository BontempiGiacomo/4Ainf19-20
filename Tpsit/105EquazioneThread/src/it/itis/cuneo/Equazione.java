package it.itis.cuneo;

public class Equazione {
    public static void main(String[] args) {
        double a, b;
        a = -2;
        b = 5;

        System.out.println("Calcolo di: [4*(a-2)+5] * [2*(b-3)+4] ");
        Buffer var = new Buffer(a, b);
        CalcoloX thr1 = new CalcoloX(var);
        CalcoloT thr2 = new CalcoloT(var);
        CalcoloY thr3 = new CalcoloY(var);

        thr1.start();
        thr2.start();


        try {
            thr1.join();
        } catch (InterruptedException e) {
            System.err.println("Errore thread 1");
        }


        try {
            thr2.join();
        } catch (InterruptedException e) {
            System.err.println("Errore thread 2");
        }

        thr3.start();

        try {
            thr3.join();
        } catch (InterruptedException e) {
            System.err.println("Errore thread 3");
        }

    }

}
