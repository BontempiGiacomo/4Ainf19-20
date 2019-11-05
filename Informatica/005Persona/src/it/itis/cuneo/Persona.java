package it.itis.cuneo;

public class Persona {
    private int eta;
    private String nome;
    private String sesso;
    private String professione;

    public Persona(){

    }

    public Persona(int eta, String nome, String sesso, String professione){
        this.eta = eta;
        this.nome = nome;
        this.sesso = sesso;
        this.professione = professione;

    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getSesso() {
        return sesso;
    }

    public void setProfessione(String professione){
        this.professione = professione;
    }

    public String getProfessione(){
        return professione;
    }

    public String chiSei(){
        return "<< Sono una persona di nome: " + this.nome + ", sesso: " + this.sesso + ", età: " + this.eta + ", professione: " + this.professione + " >>" ;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(24, "Giorgia", "femmina", "Informatica");
        System.out.println(persona1.chiSei());
    }
}
