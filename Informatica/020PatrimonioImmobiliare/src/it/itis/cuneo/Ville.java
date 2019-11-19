package it.itis.cuneo;

public class Ville extends Abitazioni {

    private int numeroPiani;
    private int superficieGiardino;
    private boolean piscina;

    public int getNumeroPiani() {
        return numeroPiani;
    }

    public void setNumeroPiani(int numeroPiani) {
        this.numeroPiani = numeroPiani;
    }

    public int getSuperficieGiardino() {
        return superficieGiardino;
    }

    public void setSuperficieGiardino(int superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public Ville(){
        super();
    }

    public Ville(int numeroStanze, int superficie, String indirizzo, String citta, int numeroPiani, int superficieGiardino, boolean piscina){
        super(numeroStanze, superficie, indirizzo, citta);
        this.numeroPiani = numeroPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public Ville(Abitazioni abitazioni, Ville ville) {
        super(abitazioni);
        setNumeroPiani(ville.getNumeroPiani());
        setSuperficieGiardino(ville.getSuperficieGiardino());
        setPiscina(ville.isPiscina());
    }

    @Override
    public String toString() {
        return "Ville{" + super.toStringRich() +
                ", numeroPiani=" + numeroPiani +
                ", superficieGiardino=" + superficieGiardino +
                ", piscina=" + piscina +
                '}';
    }
}
