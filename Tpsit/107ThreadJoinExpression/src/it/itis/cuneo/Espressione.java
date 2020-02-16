package it.itis.cuneo;

public class Espressione {

    public static void main(String[] args) {
        Buffer dati1 = new Buffer();
        Buffer dati2 = new Buffer();

        dati1.setA(2);
        dati1.setB(3);
        dati2.setA(-3);
        dati2.setB(7);

        CalcoloX threadX = new CalcoloX(dati1);
        CalcoloY threadY = new CalcoloY(dati2);
        CalcoloZ threadZ = new CalcoloZ(dati1, dati2);

        threadX.start();
        threadY.start();

        try {
            threadX.join();
            threadY.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadZ.start();
        try {
            threadZ.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
