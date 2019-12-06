package it.itis.cuneo;

public class Barca {
    private String nome;
    private String nazionalita;
    private float lunghezza;
    private float stazza;
    private int tipologia;

    public Barca() {
    }

    public Barca(String nome, String nazionalita, float lunghezza, float stazza, int tipologia) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipologia = tipologia;
    }

    public Barca(Barca barca) {
        setNome(barca.getNome());
        setNazionalita(barca.getNazionalita());
        setLunghezza(barca.getLunghezza());
        setStazza(barca.getStazza());
        setTipologia(barca.getTipologia());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }

    public float getStazza() {
        return stazza;
    }

    public void setStazza(float stazza) {
        this.stazza = stazza;
    }

    public int getTipologia() {
        return tipologia;
    }

    public void setTipologia(int tipologia) {
        this.tipologia = tipologia;
    }

    public void caricaBarca(){
        this.nome = InputOutputUtility.leggiNome("Inserire il nome della barca: ");
        this.nazionalita = InputOutputUtility.leggiNome("Inserire la nazionalità della barca: ");
        this.lunghezza = InputOutputUtility.leggiNumeroFloat("Inserire la lunghezza della barca: ");
        this.stazza = InputOutputUtility.leggiNumeroFloat("Inserire la stazza della barca: ");
        do {
            this.tipologia = InputOutputUtility.leggiNumero("Indicare con 1 o 0 se la barca è a vela o a motore: ");
            if(this.tipologia<0 || this.tipologia>1){
                System.err.println("Hai inserito il numero sbagliato. Reinserire: ");
            }
        }while(this.tipologia<0 || this.tipologia>1);
    }

}
