package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sottrazione {

    private static InputStreamReader reader = new InputStreamReader(System.in);
    private static BufferedReader buf = new BufferedReader(reader);

    public static int leggiNumero(String str){
        int n = 0;

        System.out.println(str);
        try{
            n = Integer.parseInt(buf.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return n;
    }

    public static int differenzaNumeri(int num1, int num2){
        int differenza = num1 - num2;
        return differenza;
    }

    public static void main(String[] args) {

        int numeroUno = 0;
        int numeroDue = 0;

        numeroUno = leggiNumero("Inserire il primo numero");
        numeroDue = leggiNumero("Inserire il secondo numero");
        int risultato = differenzaNumeri(numeroUno, numeroDue);
        System.out.println(risultato);
    }
}