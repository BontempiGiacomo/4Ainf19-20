package it.itis.cuneo;

import java.util.Random;

public class CinqueEccezioni {

    public  float Eccezione(int numeroUno) throws Exception {
        float risultato = 0;
        int n = 0;
        risultato = numeroUno/n;
    return risultato;
    }

    public static void main(String[] args) {
        CinqueEccezioni cinqueEccezioni = new CinqueEccezioni();

        Random random = new Random();
        int numero1 = 0;
        int numeroCasuale = 0;

        int i=0;
        while (i<5){
            numeroCasuale = random.nextInt(2);
            if(numeroCasuale == 1){
                numero1 = random.nextInt(10);
                i++;
                try{
                    cinqueEccezioni.Eccezione(numero1);
                }
                catch (Exception ex){
                    System.out.println("Il numero è impossibile dividere per 0");
                    ex.printStackTrace();
                }
                finally {
                    System.out.println("Numero di eccezione: " + i);
                }
            }
        }
    }

}
