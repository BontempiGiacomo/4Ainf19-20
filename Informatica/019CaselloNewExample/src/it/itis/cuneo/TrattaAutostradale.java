package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.bontempig3107 on 21/10/2019.
 */
public class TrattaAutostradale {

    private Casello caselloIngresso;
    private Casello caselloUscita;
    private int distanza;


    public void setCaselloIngresso(Casello caselloIngresso) {
        this.caselloIngresso = new Casello(caselloIngresso);
    }

    public Casello getCaselloIngresso() {
        return this.caselloIngresso;
    }

    public void setCaselloUscita(Casello caselloUscita) {
        this.caselloUscita = new Casello(caselloUscita);
    }

    public Casello getCaselloUscita() {
        return this.caselloUscita;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    public int getDistanza() {
        return this.distanza;
    }

    public TrattaAutostradale() {

    }

    public TrattaAutostradale(Casello caselloIngresso, Casello caselloUscita, int distanza) {
        this.caselloIngresso = caselloIngresso;
        this.caselloUscita = caselloUscita;
        this.distanza = distanza;
    }

    public TrattaAutostradale(TrattaAutostradale trattaAutostradale) {
        setCaselloIngresso(trattaAutostradale.getCaselloIngresso());
        setCaselloUscita(trattaAutostradale.getCaselloUscita());
        setDistanza(trattaAutostradale.getDistanza());
    }

    public double velocitaMedia() {
        double velocitaMedia = 0;
        long nMilliSecUscita1970 = caselloUscita.getDataUscita().getTimeInMillis();
        long nMilliSecIngresso1970 = caselloIngresso.getDataEntrata().getTimeInMillis();
        velocitaMedia = (nMilliSecUscita1970 - nMilliSecIngresso1970) / distanza * 1000;

        return velocitaMedia;
    }

    @Override
    public String toString() {
        return "TrattaAutostradale{" +
                "caselloIngresso=" + caselloIngresso +
                ", caselloUscita=" + caselloUscita +
                ", distanza=" + distanza +
                '}';
    }

    public static void main(String[] args) {
        Casello caselloIngresso = new Casello();
        Casello caselloUscita = new Casello();
        Calendar cDataIngresso = InputOutputUtility.leggiDataOraCalendar("Inserisci la data ingresso (dd/MM/yyyy HH:mm:ss): ",
                InputOutputUtility.dfDayHour);
        caselloIngresso.setDataEntrata(cDataIngresso);

        Calendar cDataUscita = InputOutputUtility.leggiDataOraCalendar("Inserire la data di uscita (dd/MM/yyyy HH:mm:ss): ",
                InputOutputUtility.dfDayHour);
        caselloUscita.setDataUscita(cDataUscita);

        TrattaAutostradale trattaAutostradale = new TrattaAutostradale(caselloIngresso, caselloUscita, 10);
        double velocitaMedia = trattaAutostradale.velocitaMedia();
        System.out.println("velocitàMedia: " + velocitaMedia);
    }
}