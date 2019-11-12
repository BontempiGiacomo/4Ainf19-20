package it.itis.cuneo;

import org.omg.CORBA.TRANSACTION_MODE;

public class Cd {

    private String titolo;
    private String autore;
    private int numeroBrani;
    private String durata;

    public Cd(String titolo, String autore, int numeroBrani, String durata){
        setTitolo(titolo);
        setAutore(autore);
        setNumeroBrani(numeroBrani);
        setDurata(durata);
    }

    public Cd (Cd cd){
        this.titolo = cd.getTitolo();
        this.autore = cd.getAutore();
        this.numeroBrani = cd.getNumeroBrani();
        this.durata = cd.getDurata();
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public String getTitolo(){
        return titolo;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public String getAutore(){
        return autore;
    }

    public void setNumeroBrani(int numeroBrani){
        this.numeroBrani = numeroBrani;
    }

    public int getNumeroBrani(){
        return numeroBrani;
    }

    public void setDurata(String durata){
        this.durata = durata;
    }

    public String getDurata(){
        return durata;
    }

    public String toString(){
        return "Cd {\"Titolo\": " + this.titolo + "\t\"Autore\": " + this.autore + "\t\"Numero di brani\": " + this.numeroBrani + "\t\"Durata\": " + this.durata + "}";
    }

    public boolean compareDurata(Cd cd){
        boolean correct = false;
        if(this.durata.equals(cd.getDurata())){
            correct = true;
        }
        return correct;
    }

    public static void main(String[] args){
        Cd cdUno = new Cd("Un tizio", "Tizio", 15, "3:20");
        Cd cdDue = new Cd("una tizia", "Tizia", 47, "1:12");
        Cd cdTre = new Cd("Un tasso", "Tazio", 32, "10:15");

        System.out.println(cdUno.toString());
        System.out.println(cdDue.toString());
        System.out.println(cdTre.toString());

        boolean equals = cdUno.compareDurata(cdDue);
        if(equals){
            System.out.println("Hanno la stessa durata");
        }
        else{
            System.out.println("Non hanno la stessa durata");
        }
    }

}

