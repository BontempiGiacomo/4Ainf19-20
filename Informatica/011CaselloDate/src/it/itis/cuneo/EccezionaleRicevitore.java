package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 24/10/2019.
 */
public class EccezionaleRicevitore {

    public float divisione(int num, int den) throws ArithmeticException{
        float quoto = 0;
        quoto = num/den;
        return quoto;
    }

    public static void main(String[] args) {

        EccezionaleRicevitore eccezionaleRicevitore = new EccezionaleRicevitore();
        try {
            eccezionaleRicevitore.divisione(5, 0);
        }
        catch (ArithmeticException aEx){
            System.out.println("catch (ArithmeticException aEx)");
            aEx.printStackTrace();  //? quest'istruzione stampa la linea dove c'è l'errore[maybe] ?

        }
        catch (Exception ex){
            System.out.println("catch (Exception ex)");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Non esco bene!!!");
        }
    }
}
