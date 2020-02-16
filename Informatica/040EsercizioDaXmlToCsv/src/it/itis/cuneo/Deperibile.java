package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.bontempig3107 on 05/02/2020.
 */

public abstract class Deperibile {

    private Calendar dataScadenza;

    /*Differenza con la data attuale*/
    public abstract int giorniAllaScadenza();
}
