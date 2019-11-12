package it.itis.cuneo;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.Period;
import java.util.Scanner;
import java.util.Vector;

public class PortaCD {

    public static final int CD_MAX=3;
    private Cd[] vet;
    private Cd CD;

    public PortaCD(){
        vet = new Cd[CD_MAX];
    }

    public void setCD(Cd cd){
        this.CD = new Cd(cd);
    }

    public Cd getCD() {
        return this.CD;
    }

    public PortaCD(PortaCD portaCD){
        int posizione;
        this.vet = new Cd[CD_MAX];
        for(posizione=0; posizione<CD_MAX;posizione++){
            if(portaCD.getVet(posizione)!=null){
                    this.vet[posizione] = portaCD.getVet(posizione);
            }
        }
    }

    public int setVet(Cd cd, int posizione){
        if((posizione<0) || (posizione>=CD_MAX)){
            return -1;
        }
        if(this.vet[posizione] != null){
            return -2;
        }
        this.vet[posizione] = cd;
        return posizione;
    }

    public Cd getVet(int posizione){
        if((posizione<0) || (posizione>=CD_MAX)){
            return null;
        }
        return this.vet[posizione];
    }

    public int killCD(int posizione, Cd[] vet){
        if((posizione<0) || (posizione>CD_MAX)){
            return -1;
        }
        if(vet[posizione] == null){
            return -2;
        }
        vet[posizione] = null;
        return posizione;
    }

    public int getN(Cd[] vet){
        int i=0, posizione=0;
        for(posizione=0; posizione<CD_MAX; posizione++){
            if(vet[posizione] != null){
                i++;
            }
        }
        return i;
    }

    public int cercaCDperTitolo(String nome, Cd[] vet){
        int posizione = 0;
        int salva=0;
        boolean trovato = false;
        for(; posizione<CD_MAX; posizione++){
            if(vet[posizione] != null) {
                if (vet[posizione].getTitolo().equals(nome)) {
                    trovato = true;
                    salva = posizione;
                }
            }
        }
        if(trovato) {
            System.out.println("Il titolo che i due CD hanno in comune è: " + vet[salva].getTitolo());
            return posizione;
        }
        else {
            System.out.println("Non trovato");
            return -1;
        }
    }

    public String toString(int n){
        return "PortaCD{ \"Titolo CD:\" " + vet[n].getTitolo()+ "}";
    }

    public int confrontaCollezione(Cd[] vet, Cd vet2[]){
        int conta=0;
        for(int i=0; i<CD_MAX; i++){
            if(vet[i].getTitolo().equals(vet2[i].getTitolo()) && (vet[i].getAutore().equals(vet2[i].getAutore()))){
                conta++;
            }
        }
        return conta;
    }

    public static void main(String[] args) {
        Cd[] vettore = new Cd[CD_MAX];
        Cd[] vettore2 = new Cd[CD_MAX];
        PortaCD portaCD= new PortaCD();

        int position;



        Cd cdUno = new Cd("a", "a", 15, "01:30:01");
        Cd cdDue = new Cd("g", "b", 10, "01:05:21");
        Cd cdTre = new Cd("d", "c", 145,"02:30:20");

        vettore[0] = cdUno;
        vettore[1] = cdDue;
        vettore[2] = cdTre;

        System.out.println("Inserire la posizione del CD da eliminare: ");
        position = InputOutputUtility.leggiNumero();
        portaCD.killCD(position, vettore);

        System.out.println("Il porta CD contiene: " + portaCD.getN(vettore));

        System.out.print("\nInserire il titolo da cercare: ");
        String nome = InputOutputUtility.leggiNome();
        portaCD.cercaCDperTitolo(nome, vettore);

        int n=0;
        for(n=0; n<CD_MAX; n++){
            System.out.println(vettore[n].toString());
        }
        Cd primoCD = new Cd("a", "a", 1415, "24:30:01");
        Cd secondoCD = new Cd("g", "b", 20, "01:59:59");
        Cd terzoCD = new Cd("df", "c", 2,"06:12");

        vettore2[0] = primoCD;
        vettore2[1] = secondoCD;
        vettore2[2] = terzoCD;
        System.out.println(portaCD.confrontaCollezione(vettore, vettore2));

    }




}
