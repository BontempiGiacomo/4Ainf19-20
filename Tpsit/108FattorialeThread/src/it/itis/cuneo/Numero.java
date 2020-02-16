package it.itis.cuneo;

public class Numero extends Thread {

    Buffer valore;

    public Numero(Buffer dati){
        valore = dati;
    }

    public void run(){
        for(int i=1; i<=valore.getN(); i++){
            valore.setFattorialeN(i * valore.getFattorialeN());
        }
        System.out.println("Il fattoriale del numero " + valore.getN() + " è: " + valore.getFattorialeN());
    }
}
