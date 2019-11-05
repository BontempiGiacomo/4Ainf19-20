package it.itis.cuneo;

public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y){
        setX(x);
        setY(y);
    }

    public Punto(Punto punto){
        this.x = punto.getX();
        this.y = punto.getY();
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "Punto: { \"x\": " + this.x + "\"y\":" + this.y + "}";
    }

    public static void main(String[] args){
        Punto punto1 = new Punto(5, 6);
        Punto punto2 = new Punto(3, 8);
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
    }

}
