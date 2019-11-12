package it.itis.cuneo;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.Period;
import java.util.Scanner;
import java.util.Vector;

public class ContenitoreDiProgrammi {

    public static final int NUMERO_MAX=3;
    private Programma[] vet;
    private Programma programma;

    public ContenitoreDiProgrammi(){
        vet = new Programma[NUMERO_MAX];
    }

    public void setProgramma(Programma programma){
        this.programma = new Programma(programma);
    }

    public Programma getProgramma() {
        return this.programma;
    }

    public ContenitoreDiProgrammi(ContenitoreDiProgrammi contenitoreDiProgrammi){
        int posizione;
        this.vet = new Programma[NUMERO_MAX];
        for(posizione=0; posizione<NUMERO_MAX;posizione++){
            if(contenitoreDiProgrammi.getVet(posizione)!=null){
                this.vet[posizione] = contenitoreDiProgrammi.getVet(posizione);
            }
        }
    }

    public int setVet(Programma programma, int posizione){
        if((posizione<0) || (posizione>=NUMERO_MAX)){
            return -1;
        }
        if(this.vet[posizione] != null){
            return -2;
        }
        this.vet[posizione] = programma;
        return posizione;
    }

    public Programma getVet(int posizione){
        if((posizione<0) || (posizione>=NUMERO_MAX)){
            return null;
        }
        return this.vet[posizione];
    }

    public int killProgramma(int posizione, Programma[] vet){
        if((posizione<0) || (posizione>NUMERO_MAX)){
            return -1;
        }
        if(vet[posizione] == null){
            return -2;
        }
        vet[posizione] = null;
        return posizione;
    }

    public int getN(Programma[] vet){
        int i=0, posizione=0;
        for(posizione=0; posizione<NUMERO_MAX; posizione++){
            if(vet[posizione] != null){
                i++;
            }
        }
        return i;
    }

    public int cercaProgrammaPerDenominazione(String nome, Programma[] vet){
        int posizione = 0;
        int save =0;
        boolean trovato = false;
        for(; posizione<NUMERO_MAX; posizione++){
            if(vet[posizione] != null) {
                if (vet[posizione].getDenominazione().equals(nome)) {
                    trovato = true;
                    save = posizione;
                }
            }
        }
        if(trovato) {
            String i;
            i = vet[save].getDenominazione();
            System.out.print("La denominazione del programma è: " + i + "\nSi trova nella posizione: ");
            return posizione;
        }
        else {
            System.out.println("Non Trovato");
            return -1;
        }
    }

    public String toString(int n, Programma[] vet){
        if(vet[n] != null) {
            return "ContenitoreDiProgrammi{ \"Denominazione programma:\" " + vet[n].getDenominazione() + "}";
        }
        return "\b";
    }

    public static void main(String[] args) {
        Programma[] vettore = new Programma[NUMERO_MAX];
        ContenitoreDiProgrammi contenitore = new ContenitoreDiProgrammi();

        int position;



        Programma programmaUno = new Programma("a", "a", "a", "a", "15/10/2014");
        Programma programmaDue = new Programma("b", "b", "b", "b", "31/07/2021");
        Programma programmaTre = new Programma("c", "c", "c", "c", "5/05/2000");

        vettore[0] = programmaUno;
        vettore[1] = programmaDue;
        vettore[2] = programmaTre;

        System.out.println("Inserire la posizione del programma da eliminare: ");
        position = InputOutputUtility.leggiNumero();
        contenitore.killProgramma(position, vettore);

        System.out.println("Il contenitore contiene: " + contenitore.getN(vettore));

        System.out.print("\nInserire il nome da cercare: ");
        String nome = InputOutputUtility.leggiNome();
        System.out.println(contenitore.cercaProgrammaPerDenominazione(nome, vettore));

        int n=0;
        for(n=0; n<NUMERO_MAX; n++){
            System.out.println(contenitore.toString(n, vettore));
        }

    }




}
