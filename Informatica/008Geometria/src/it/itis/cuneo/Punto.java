package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 07/10/2019.
 */
public class Punto {

    //attributi
    private int x;
    private int y;

    public Punto(){
        super();
    }

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "Punto { \"x\": " + this.x + ", " + "\"y\": " + this.y + "}";
    }

    public static void main(String[] args) {
        //puntoA e puntoB referenziano due aree di memoria diverse
        Punto puntoA = new Punto(4, 7);
        
        //puntoB è una copia di puntoA per il suo stato, ma fisicalmente sono in due aree di memoria diverse
        Punto puntoB = new Punto(puntoA); //costruttore di copia

        //in questo caso puntoC e puntoA come handler referenziano la stessa area di memoria
        Punto puntoC = puntoA;

        Punto puntoD = new Punto();

        Punto puntoE = null;
        //se il richiamo al costruttore non viene svolto richiamo ho un null pointer
        puntoE = new Punto();

        System.out.println("A: " + puntoA.toString());
        System.out.println("B: " + puntoB.toString());
        System.out.println("C: " + puntoC.toString());
        System.out.println("D: " + puntoD.toString());
        System.out.println("E: " + puntoE.toString());
    }
}
