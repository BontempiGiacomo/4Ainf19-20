package it.itis.cuneo;

import java.util.Scanner;

public class Espressione {

    public static void main(String[] args) {
        Buffer dati= new Buffer();

        System.out.println("Inserire il numero da calcolarne il fattoriale");
        Scanner input = new Scanner(System.in);
        dati.setN(input.nextInt());
        dati.setFattorialeN(1);

        Numero numero1 = new Numero(dati);

        numero1.start();

        try {
            numero1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
