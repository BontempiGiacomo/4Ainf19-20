package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 17/10/2019.
 */
public class Autore {

    private String cognomeENome;
    private String cognome;
    private String nome;
    private int annoDiNascita;

    public Autore(String cognomeENome, String cognome, String nome, int annoDiNascita){
        setCognomeENome(cognomeENome);
        setCognome(cognome);
        setNome(nome);
        setAnnoDiNascita(annoDiNascita);
    }

    public Autore(Autore auto){
        this.cognomeENome = auto.getCognomeENome();
        this.cognome = auto.getCognome();
        this.nome = auto.getNome();
        this.annoDiNascita = auto.getAnnoDiNascita();
    }

    public void setAnnoDiNascita(int annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    public void setCognomeENome(String cognomeENome) {
        this.cognomeENome = cognomeENome;
    }

    public String getCognomeENome() {
        return cognomeENome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}
