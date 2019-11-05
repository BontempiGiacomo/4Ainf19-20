package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 21/09/2019.
 */
public class Frazione {
    //attributi
    private float numeratore;
    private float denominatore;


    public Frazione(float numeratore, float denominatore){

    }

    public void setNumeratore(float numerartore){
        this.numeratore = numerartore;

    }

    public float getNumeratore() {
        return numeratore;
    }

    public void setDenominatore(float denominatore) {
        this.denominatore = denominatore;

    }

    public float getDenominatore() {
        return denominatore;
    }


    public Frazione getSomma(Frazione frazione){
        Frazione frazioneSom = new Frazione(4 , 2);
        frazioneSom.setDenominatore(this.denominatore * getDenominatore());
        frazioneSom.setNumeratore(this.numeratore * getDenominatore());
        return frazione;
    }


    public static void main(String[] args){
        Frazione frazione = new Frazione(4, 2);
        System.out.println(frazione.getSomma(frazione));
    }
}
