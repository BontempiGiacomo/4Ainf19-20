package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moltiplicazione {

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

    public static int moltiplicazioneNumeri(int moltiplicando, int moltiplicatore){
        int moltiplicazione = moltiplicando * moltiplicatore;
        return moltiplicazione;
    }

    public static void main(String[] args) {

        int moltiplicando = 0;
        int moltiplicatore = 0;

        moltiplicando = leggiNumero("Inserire il moltiplicando");
        moltiplicatore = leggiNumero("Inserire il moltiplicatore");
        int risultato = moltiplicazioneNumeri(moltiplicando, moltiplicatore);
        System.out.println(risultato);
    }
}