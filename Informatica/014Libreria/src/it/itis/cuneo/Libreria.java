package it.itis.cuneo;

import java.util.Arrays;

/**
 * Created by inf.bontempig3107 on 30/10/2019.
 */
public class Libreria {

    public static final int MAX_LIBRI = 3; //costante
    private Libro[] vlLbri;
    private int cntLibro; //cntLibro <= MAX_LIBRI

    public Libreria(){
        //costruttore di array
        vlLbri = new Libro[MAX_LIBRI];
        cntLibro = 0;
    }

    public void addLibro(Libro libro) throws LibreriaPienaException {

        //possibile perchè faccio la extends public class LibreriaPienaException extends Exception
        if(cntLibro+1 >MAX_LIBRI){
            throw new LibreriaPienaException(1, "Troppi libri!!!");
        }
        vlLbri[cntLibro] = libro;
        cntLibro++;
    }

    public static void main(String[] args) {
        // IMPORTANTE non da fare ma da vedere
        Libro libroUno = new Libro("Libro", "J", "1SV",
                InputOutputUtility.convertiDataOraToCalendar("12/10/2019", InputOutputUtility.dfDay));
        Libro libroDue = new Libro("Picchio", "S", "12e1456462",
                InputOutputUtility.convertiDataOraToCalendar("30/10/2019", InputOutputUtility.dfDay));

        Libreria libreria = new Libreria();
        try {
            libreria.addLibro(libroUno);
            libreria.addLibro(libroUno);
            libreria.addLibro(libroUno);
            libreria.addLibro(libroUno);
        } catch (LibreriaPienaException e) {
            e.printStackTrace();
            //System.out.println(e.toString());
            System.err.println(e.toString());
        }

        //System.out.println(libroUno.toString());
        System.err.println(libroUno.toString());

    }





}
