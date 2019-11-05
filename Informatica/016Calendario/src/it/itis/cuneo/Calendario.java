package it.itis.cuneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.bontempig3107 on 04/11/2019.
 */
public class Calendario {

    public Calendario() {

    }

    public static void main(String[] args) {
        System.out.println("oggiUno:" + new Date()); /*da la data del giorno che è oggi*/

        Date diOggi = new Date();/*da la data del giorno che è oggi*/
        System.out.println("oggiDue: " + diOggi);

        String strData = InputOutputUtility.leggiNome("Inserisci la data (dd/MM/yyyy): ");

       /* Calendar cData = Calendar.getInstance();
        cData.setTime(cData.getTime());*/

        /*strData -> calendar (String -> Date in che formato)
        Date dataTastiera = InputOutputUtility.convertiDataOraToCalendar(strData, InputOutputUtility.dfDay );*/

        Date dataTastiera = null;

        try {
            InputOutputUtility.dfDay.parse(strData);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cData = Calendar.getInstance();
        cData.setTime(dataTastiera);

                /*strData -> calendar (String -> Date in che formato)*/
        Calendar cData2 = InputOutputUtility.convertiDataOraToCalendar(strData, InputOutputUtility.dfDay );


    }
}
