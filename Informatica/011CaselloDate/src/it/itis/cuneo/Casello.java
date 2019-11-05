package it.itis.cuneo;

import sun.awt.geom.AreaOp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;


/**
 * Created by inf.bontempig3107 on 21/10/2019.
 */
public class Casello {
    //calendar ha ore minuti e secondi rispetto alla Date (java.util.Date)
    private Calendar dataEntrata;
    private Calendar dataUscita;
    private String indentifier;


    public void setIndentifier(String indentifier) {
        this.indentifier = indentifier;
    }

    public String getIndentifier() {
        return this.indentifier;
    }

    public void setDataEntrata(Calendar dataEntrata) {
        this.dataEntrata = dataEntrata;
    }

    public Calendar getDataEntrata() {
        return this.dataEntrata;
    }

    public void setDataUscita(Calendar dataUscita) {
        this.dataUscita = dataUscita;
    }

    public Calendar getDataUscita() {
        return this.dataUscita;
    }

    public Casello(String indentifier, Calendar dataEntrata, Calendar dataUscita) {
        this.indentifier = indentifier;
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
    }

    public Casello() {

    }

    public Casello(Casello casello) {
        this.indentifier = new String(casello.getIndentifier()); //uso la new per dei tipi composti (se no avrei due oggetti di tipo under ????)

        //Calendar.getInstance(); method factory
        //l'istanza creata,  ha come default i secs di 01/01/1970
        //Calendar cData = new Calendar(); non è accettabile
        Calendar cDataIngresso = Calendar.getInstance();
        cDataIngresso.setTime(casello.getDataEntrata().getTime());
        this.dataEntrata = cDataIngresso;

        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime(casello.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

    public static void main(String[] args) {

        //cast Stringa (Alt+26)→ Data (SimpleDateFormat)
        //es. 23/10/2019 10:43:27
        //usa un pattern esso rappresenta il formato di come deve apparire la data di input che è rappresentato su una stringa (o descrizione di come gli oggetti vengono creati)
        //pattern  dd/MM/yyyy hh24:mi:ss
        final String FORMATO_DMY_HMS = "dd/MM/yyyy HH:mm:ss";

        String strDataPartenza = "31/07/2002 03:20:47";

        strDataPartenza = InputOutputUtility.leggiNome("Inserisci la data di partenza (dd/mm/yy hh:mi:ss): ");

        //Calendar non usa il costruttore, ma un metodo di generazione
        Calendar cDataEntrata = Calendar.getInstance();

        SimpleDateFormat dateIn = new SimpleDateFormat(FORMATO_DMY_HMS);
        //parsificare una stringa secondo un formato, permette di ottenere una variabile di un altro tipo
        //Eccezione: è un anomalia software che si verifica quando il codice genere un errore in tempo di esecuzione
        //ParseException: la stringa non rispetta il formato atteso
        Date dataPartenza = null;
        try {
            dataPartenza = dateIn.parse(strDataPartenza);
        } catch (ParseException e) {
            //Errore nel formato della stringa
            //viene stampato uno stackTrace: (una traccia dello stack) è l'elenco delle chiamate ai metodi
            e.printStackTrace();
        }
        //manca catch (Exception e)
        //Qui non intercetto l'Exception

        //Calendar mantiene il numero di secondi dal 01/01/1970
        cDataEntrata.setTime(dataPartenza);
        System.out.println(dataPartenza + "\n");
        System.out.println("cDataEntrata: " + cDataEntrata);

        //foramattare la data in output SimpleDateFormat.format(Date)
        String strData = dateIn.format(dataPartenza);
      //  System.out.println("\n\ndateIn.format(cDataEntrata): " + dateIn.format(cDataEntrata));
        /***/
        String strDataUscita = "31/07/2002 03:25:00";
        Calendar cDataUscita = Calendar.getInstance();

        SimpleDateFormat dateOut = new SimpleDateFormat(FORMATO_DMY_HMS);
        Date dataArrivo = null;
        try{
            dataArrivo = dateOut.parse(strDataUscita);
        } catch (ParseException u){
            u.printStackTrace();
        }

        cDataUscita.setTime(dataArrivo);
        System.out.println("\n" + dataArrivo + "\n");
        System.out.println("cDataUscita: " + cDataUscita);

        String strData2 = dateOut.format(dataArrivo);
       // System.out.println("\n\ndateOut.format(cDataUscita): " + dateOut.format(cDataUscita));

        //int differenzaDate = ;

    }
}


