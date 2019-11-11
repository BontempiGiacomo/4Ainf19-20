package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Vector;

public class ContenitoreDiProgrammi {

    public static final int NUMERO_MAX=1;
    public static final int PROGRAMMA_NON_PRESENTE = -1;
    private Programma[] vet;
    private Programma programma;
    private static int cntProgr;


    public void setProgramma(Programma programma){
        this.programma = new Programma(programma);
    }

    public Programma getProgramma() {
        return this.programma;
    }

    public static void caricaVettoreDenominazione(Programma[] vet, int cntProgr) throws Exception{
            System.out.println("Inserire la denominazione: ");
            vet[cntProgr].setDenominazione(Input.readLine());
    }
    public static void caricaVettoreProduttore(Programma[] vet, int cntProgr) throws Exception{
          System.out.println("Inserire il nome del produttore: ");
            vet[cntProgr].setProduttore(Input.readLine());
    }
    public static void caricaVettoreVersione(Programma[] vet, int cntProgr) throws Exception{
            System.out.println("Inserire la versione: ");
            vet[cntProgr].setVersione(Input.readLine());
    }
    public static void caricaVettoreSO(Programma[] vet, int cntProgr) throws Exception{
            System.out.println("Inserire il sistema operativo supportato dal programma: ");
            vet[cntProgr].setSistemaOperativo(Input.readLine());
    }
    public static void caricaVettoreAnno(Programma[] vet, int cntProgr) throws Exception{
            System.out.println("Inserire l'anno di pubblicazione: ");
            vet[cntProgr].setAnno(Input.readLine());
    }

    public static void killProgramma(Programma[] vet){
        System.out.println("Inserire la posizione del programma da eliminare: ");
        int numero = Input.readInt();
        vet[numero] = null;
    }

    public int getN(){
        int i=0, conta=0;
        for(; i<NUMERO_MAX; i++){
            if(vet[i] != null){
                conta++;
            }
        }
        return conta;
    }

    public int cercaProgrammaPerDenominazione(Programma[] vet, String nome){
        int posizione = 0;
        boolean trovato = false;
        for(; (posizione<NUMERO_MAX) && (trovato == false); posizione++){
            if(vet[posizione].getDenominazione().equals(nome)){
                trovato = true;
            }
        }
        if(trovato) {

            return posizione;
        }
        else {
            return -1;
        }
    }

    public String toString(int n){

        return "ContenitoreDiProgrammi{ \"Denominazione programma:\" " + n + this.vet[n].getDenominazione();

    }

    public static void main(String[] args) {
        Programma vet[] = new Programma[NUMERO_MAX];
        for(cntProgr = 0; cntProgr<NUMERO_MAX; cntProgr++){
            try {
                caricaVettoreDenominazione(vet, cntProgr);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                caricaVettoreProduttore(vet, cntProgr);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                caricaVettoreVersione(vet, cntProgr);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                caricaVettoreSO(vet, cntProgr);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                caricaVettoreAnno(vet, cntProgr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        killProgramma(vet);

        ContenitoreDiProgrammi contenitore = new ContenitoreDiProgrammi();
        System.out.println("Il contenitore contiene: " + contenitore.getN());

        System.out.print("\nInserire il nome da cercare: ");
        String nome = Input.readLine();
        contenitore.cercaProgrammaPerDenominazione(vet, nome);

        int n=0;
        for(; n<NUMERO_MAX; n++){
            contenitore.toString(n);
        }

    }




}
