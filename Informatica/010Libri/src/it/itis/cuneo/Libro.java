package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 17/10/2019.
 */
public class Libro {
    private String titolo;
    private Autore autore;
    private CasaEditrice casaEditrice;
    private String dataDiPubblicazione;

    public Libro(String titolo, Autore autore, CasaEditrice casaEditrice, String dataDiPubblicazione){

    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setCasaEditrice(CasaEditrice casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public CasaEditrice getCasaEditrice() {
        return casaEditrice;
    }

    public void setDataDiPubblicazione(String dataDiPubblicazione) {
        this.dataDiPubblicazione = dataDiPubblicazione;
    }

    public String getDataDiPubblicazione() {
        return dataDiPubblicazione;
    }


}
