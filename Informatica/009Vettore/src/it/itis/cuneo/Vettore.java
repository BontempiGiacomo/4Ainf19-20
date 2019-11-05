package it.itis.cuneo;

public class Vettore {

    private Punto puntoOrigine;
    private Punto puntoVertice;

    public Vettore(Punto puntoOrigine, Punto puntoVertice){
        setPuntoOrigine(puntoOrigine);
        setPuntoVertice(puntoVertice);
    }

    public Vettore(Vettore v){
        setPuntoOrigine(v.getPuntoOrigine());
        setPuntoVertice(v.getPuntoVertice());
    }

    public void setPuntoOrigine(Punto puntoOrigine) {
        this.puntoOrigine = new Punto(puntoOrigine);
    }

    public Punto getPuntoOrigine(){
        return puntoOrigine;
    }

    public void setPuntoVertice(Punto puntoVertice) {
        this.puntoVertice = new Punto(puntoVertice);
    }

    public Punto getPuntoVertice(){
        return puntoVertice;
    }

    public boolean equals(Vettore v){
        boolean uguali = false;
        if((this.puntoOrigine.getX() == v.getPuntoOrigine().getX()) && (this.puntoOrigine.getY() == v.puntoOrigine.getY())){
            if((this.puntoVertice.getX() == v.getPuntoVertice().getX()) && (this.puntoVertice.getY() == v.getPuntoVertice().getY())){
                uguali = true;
            }
        }
        return uguali;
    }

    public double length(){
        double ris = 0;
        ris = Math.sqrt(Math.pow(this.puntoOrigine.getX() - this.puntoVertice.getX(), 2) + Math.pow(this.puntoOrigine.getY() - this.puntoVertice.getY(), 2));
        return ris;
    }

    public String toString(){
        return "Vettore {Origine: \"x\": " + this.puntoOrigine.getX() + ", \"y\": " + this.puntoOrigine.getY() + "\n\t\t Vertice: \"x\": " + this.puntoVertice.getX() + ", \"y\": " +
                this.puntoVertice.getY() + "\n\t\t Lunghezza: " + length() + "}";

    }

    public static void main(String[] args){
        Punto punto1 = new Punto(1, 2);
        Punto punto2 = new Punto(3, 4);
        Punto punto3 = new Punto(1, 2);
        Punto punto4 = new Punto(3, 2);

        Vettore vettore1 = new Vettore(punto1, punto2);
        Vettore vettore2 = new Vettore(punto3, punto4);

        boolean corretto = vettore1.equals(vettore2);
        if(corretto == true){
            System.out.println("I due vettore sono uguali");
        }
        else{
            System.out.println("I due vettori sono diversi");
        }

        double risulatato = vettore1.length();

        System.out.println(risulatato);

        System.out.println(vettore1.toString());
    }
}
