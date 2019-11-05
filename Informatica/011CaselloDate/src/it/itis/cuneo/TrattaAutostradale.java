package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.bontempig3107 on 21/10/2019.
 */
public class TrattaAutostradale {

    private Casello caselloIngresso;
    private Casello caselloUscita;
    private int distanza;

    public void setCaselloIngresso(Casello caselloIngresso){
        this.caselloIngresso = new Casello(caselloIngresso);
    }

    public Casello getCaselloIngresso(){
        return this.caselloIngresso;
    }

    public void setCaselloUscita(Casello caselloUscita){
        this.caselloUscita = new Casello(caselloUscita);
    }

    public Casello getCaselloUscita(){
        return this.caselloUscita;
    }

    public void setDistanza(int distanza){
        this.distanza = distanza;
    }

    public int getDistanza(){
        return this.distanza;
    }
/*
    public TrattaAutostradale(Casello caselloIngresso, Casello caselloUscita, int distanza){
        setCaselloIngresso(caselloIngresso);
        setCaselloUscita(caselloUscita);
        setDistanza(distanza);
    }

    public TrattaAutostradale(TrattaAutostradale tratta){
        setCaselloIngresso(tratta.getCaselloIngresso());
        setCaselloUscita(tratta.getCaselloUscita());
        setDistanza(tratta.getDistanza());
    }

   public String toString() {
        return  "fs" + this.caselloIngresso.getIndentifier() ;
    }

    public static void main(String[] args) {
        Casello casello0 = new Casello();
        Casello casello01 = new Casello();
        Calendar cDataIngresso = Calendar.getInstance();
        cDataIngresso.setTime(casello0.getDataEntrata().getTime());
        Calendar cDataUscita = Calendar.getInstance();
        cDataIngresso.setTime(casello01.getDataUscita().getTime());
        Casello casello = new Casello("15D1", cDataIngresso, cDataUscita);
        Casello casello2 = new Casello("15D2", cDataIngresso, cDataUscita);
        TrattaAutostradale tratta = new TrattaAutostradale(casello, casello2, 154);
        System.out.println(tratta.toString());

    }

*/
}
