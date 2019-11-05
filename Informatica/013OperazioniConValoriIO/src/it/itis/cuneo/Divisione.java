package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisione {

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

    public static int divisione(int dividendo, int divisore) throws ArithmeticException{
        int quoto = dividendo / divisore;
        return quoto;
    }

    public static void main(String[] args) {

        int dividendo = 0;
        int divisore = 0;

        dividendo = leggiNumero("Inserire il dividendo");
        divisore = leggiNumero("Inserire il divisore");
        int risultato = 0;

        try {
            risultato = divisione(dividendo, divisore);
        }
        catch (ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("Non è possibile dividere per zero!!");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println(risultato);
    }
}