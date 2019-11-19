package it.itis.cuneo;

import java.util.Objects;

public class Abitazioni {

    private int numeroStanze;
    private int superficie;
    private String indirizzo;
    private String citta;

    public Abitazioni() {
    }

    public Abitazioni(int numeroStanze, int superficie, String indirizzo, String citta) {
        this.numeroStanze = numeroStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public Abitazioni(Abitazioni abitazioni){
        setNumeroStanze(abitazioni.getNumeroStanze());
        setSuperficie(abitazioni.getSuperficie());
        setIndirizzo(abitazioni.getIndirizzo());
        setCitta(abitazioni.getCitta());
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public void setNumeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Abitazioni{" +
                "numeroStanze=" + numeroStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }

    public String toStringRich(){
        return  "numeroStanze=" + numeroStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'';
    }
}
