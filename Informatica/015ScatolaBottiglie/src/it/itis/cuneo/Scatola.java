package it.itis.cuneo;

import java.util.Arrays;

public class Scatola {

    public static final int MAX_BOTTIGLIE = 8;
    private Bottiglie[] vetBottiglie;
    private int cntBot;

    public Scatola(){
        //costruttore di array
        vetBottiglie = new Bottiglie[MAX_BOTTIGLIE];
        cntBot = 0;
    }

    public void addBottiglia(Bottiglie bottiglie) throws ScatolaPienaException {

        //possibile perchè faccio la extends public class LibreriaPienaException extends Exception
        if(cntBot++ >MAX_BOTTIGLIE){
            throw new ScatolaPienaException("Troppe bottiglie");
        }
        vetBottiglie[cntBot] = bottiglie;
        cntBot++;
    }

    public static void main(String[] args) {
        // IMPORTANTE non da fare ma da vedere
        Bottiglie bottigliaUno = new Bottiglie("Dolcetto", "Piemonte", InputOutputUtility.convertiDataOraToCalendar("31/07/1600", InputOutputUtility.dfDay));
        Bottiglie bottigliaDue = new Bottiglie("Champagne", "Francia", InputOutputUtility.convertiDataOraToCalendar("15/01/2010", InputOutputUtility.dfDay));

        Scatola scatola = new Scatola();
        try {
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
            scatola.addBottiglia(bottigliaUno);
        } catch (ScatolaPienaException e) {
            e.printStackTrace();
            //System.out.println(e.toString());
            System.err.println(e.toString());
        }

        //System.out.println(libroUno.toString());
        System.out.println(bottigliaUno.toString());
    }
}

