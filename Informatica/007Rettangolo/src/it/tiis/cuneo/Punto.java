package it.tiis.cuneo;

public class Punto {
    private float x;
    private float y;

    public Punto(){

    }

    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public String toString(){
        return "Punto { X: " + this.x + ", Y: " + this.y + "}";
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(4, 8);
        System.out.println(punto1.toString());
    }
}
