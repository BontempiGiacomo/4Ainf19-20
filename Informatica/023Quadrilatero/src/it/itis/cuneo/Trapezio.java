package it.itis.cuneo;

public class Trapezio implements Quadrilatero{
    public double calcoloArea() {
        double a=5, b=2, h=14;
        double risultato;
        risultato = (a+b)*h/2;
        return risultato;
    }
}
