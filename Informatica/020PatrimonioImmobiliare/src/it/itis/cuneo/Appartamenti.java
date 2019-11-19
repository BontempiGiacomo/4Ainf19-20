package it.itis.cuneo;

public class Appartamenti extends Abitazioni{

    private int pianoSituato;
    private boolean raggiuntoAscensore;
    private int numeroTerrazzi;

    public int getPianoSituato() {
        return pianoSituato;
    }

    public void setPianoSituato(int pianoSituato) {
        this.pianoSituato = pianoSituato;
    }

    public boolean isRaggiuntoAscensore() {
        return raggiuntoAscensore;
    }

    public void setRaggiuntoAscensore(boolean raggiuntoAscensore) {
        this.raggiuntoAscensore = raggiuntoAscensore;
    }

    public int getNumeroTerrazzi() {
        return numeroTerrazzi;
    }

    public void setNumeroTerrazzi(int numeroTerrazzi) {
        this.numeroTerrazzi = numeroTerrazzi;
    }

    public Appartamenti(){
        super();
    }

    public Appartamenti(int numeroStanze, int superficie, String indirizzo, String citta, int pianoSituato, boolean raggiuntoAscensore, int numeroTerrazzi){
        super(numeroStanze, superficie, indirizzo, citta);
        this.pianoSituato = pianoSituato;
        this.raggiuntoAscensore = raggiuntoAscensore;
        this.numeroTerrazzi = numeroTerrazzi;
    }

    public Appartamenti(Abitazioni abitazioni, Appartamenti appartamenti){
        super(abitazioni);
        setPianoSituato(appartamenti.getPianoSituato());
        setRaggiuntoAscensore(appartamenti.isRaggiuntoAscensore());
        setNumeroTerrazzi(appartamenti.getNumeroTerrazzi());
    }

    @Override
    public String toString() {
        return "Appartamenti{" + super.toStringRich() +
                ", pianoSituato=" + pianoSituato +
                ", raggiuntoAscensore=" + raggiuntoAscensore +
                ", numeroTerrazzi=" + numeroTerrazzi +
                '}';
    }
}
