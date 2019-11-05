package it.itis.cuneo;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Angolo {

    private int gradi;
    private int primi;
    private int secondi;

    public Angolo(){

    }

    public Angolo(int gradi, int primi, int secondi){
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    public void setGradi(int gradi){
        this.gradi = gradi;
    }

    public int getGradi(){
        return gradi;
    }

    public void setPrimi(int primi) {
        this.primi = primi;
    }

    public int getPrimi() {
        return primi;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    public int getSecondi() {
        return secondi;
    }

    public boolean controllo(){
        boolean grad = true, prim = true, sec = true, tot = true;
        if(this.gradi<0  || this.gradi>360){
            //emissione errore
            System.out.print("I gradi inseriti non sono corretti");
            grad = false;
        }
        if(this.primi<0 || this.primi>60){
            System.out.print("I primi inseriti non sono corretti");
            prim = false;
        }
        if(this.secondi<0 || this.secondi>60){
            System.out.println("I secondi inseriti non sono corretti");
            sec = false;
        }
        if(!grad && !prim && !sec){
            tot = false;
        }
        return  tot;
    }

    public String visualizzaAngolo(){
        return "Angolo: " + this.gradi + "° " + this.primi + "' " + this.secondi + "\"" ;
    }

    public void aggiungiGradi(int n){
        this.gradi = this.gradi + n;
    }

    public void aggiungiPrimi(int n){
        this.primi = this.primi + n;
    }

    public void aggiungiSecondi(int n){
        this.secondi = this.secondi + n;
    }

    public int angoloSecondi(){
        int sGradi, sPrimi, somma;
        sGradi = this.gradi * 3600;
        sPrimi = this.primi * 60;
        somma = sGradi + sPrimi + this.secondi;
        return somma;
    }

    public String secondiAngolo(int n){
        int tGradi, tPrimi, tSecondi, tGradi2, tPrimi2;
        tGradi = n /3600;
        tGradi2 = tGradi*3600;
        n = n - tGradi2;
        tPrimi = n /60;
        tPrimi2 = tPrimi*60;
        n = n - tPrimi2;
        tSecondi = n;
        return "Angolo: " + tGradi + "°" + tPrimi + "'" + tSecondi + "\"";
    }

    public int  differenzaSecondi(Angolo angolo){
        int sGradi1, sPrimi1, somma1, sGradi2, sPrimi2, somma2, differenza;
        sGradi1 = this.gradi * 3600;
        sPrimi1 = this.primi * 60;
        somma1 = sGradi1 + sPrimi1 + this.secondi;
        sGradi2 = angolo.getGradi() * 3600;
        sPrimi2 = angolo.getPrimi() *60;
        somma2 = sGradi2 + sPrimi2 + angolo.getSecondi();
        differenza = somma1 - somma2;
        return differenza;
    }

    public String sommaAngolo(Angolo angolo){

        return "Angolo: " + (angolo.getGradi() + this.gradi) + "° " + (angolo.getPrimi() + this.primi) + "' " + (angolo.getSecondi() + this.secondi)  + "\"";
    }

    public static void main(String[] args) {
        Angolo angolo1 = new Angolo(58, 32, 19);
        Angolo angolo2 = new Angolo(28, 35,14);
        boolean giusto = true, giusto2 = true;
        giusto = angolo1.controllo();
        giusto2 = angolo2.controllo();
        if(giusto == true && giusto2 == true){
            System.out.println(angolo1.visualizzaAngolo());
            angolo1.aggiungiGradi(82);
            angolo1.aggiungiPrimi(10);
            angolo1.aggiungiSecondi(1);
            angolo1.controllo();
            System.out.println("getGradi " + angolo1.getGradi());
            System.out.println("getPrimi " + angolo1.getPrimi());
            System.out.println("getSecondi: "+ angolo1.getSecondi());
            System.out.println("angoloSecondi: " + angolo1.angoloSecondi());
            System.out.println("secondiAngolo: " + angolo1.secondiAngolo(506540));
            System.out.println("differenzaSecondi: " + angolo1.differenzaSecondi(angolo2));
            System.out.println("sommaAngolo: " + angolo1.sommaAngolo(angolo2));
        }
    }
}
