package it.itis.cuneo;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by inf.bontempig3107 on 23/09/2019.
 */
public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(){
        super();
    }

    public Frazione(int numeratore, int denominatore){
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public void setNumeratore(int numeratore){
        this.numeratore = numeratore;
    }

    public int getNumeratore(){
        return numeratore;
    }

    public void setDenominatore(int denominatore){
        this.denominatore = denominatore;
    }

    public int getDenominatore(){
        return denominatore;
    }

    //resrtituisce una stringa con lo stato dell'oggetto
    public  String toString(){
        return "Frazione {numeratore: "+
                 numeratore + " , denominatore: " + denominatore + "}";
    }

    public boolean equals(Frazione frazione){
        boolean sonoUguali = false;

        //this == frazione
        //serve per confrontare se due oggetti sono nella stessa area di memoria

        if (
            (this.numeratore == frazione.getNumeratore())
            &&
            (this.denominatore == getDenominatore()) )
        {
            sonoUguali = true;
        }
        return sonoUguali;
    }

    public static void main(String[] args){
        Frazione frazioneUnknownState = new Frazione();
        System.out.println( frazioneUnknownState.toString() );

        Frazione frazione = new Frazione(2, 5);
        System.out.println( frazione.toString() );

        boolean confrontoUguali = frazione.equals(frazioneUnknownState);
        System.out.println();


    }

}
