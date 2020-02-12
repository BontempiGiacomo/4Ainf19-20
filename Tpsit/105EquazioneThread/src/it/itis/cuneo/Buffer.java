package it.itis.cuneo;

public class Buffer {

    public double a, b, t, x, y;
    public Buffer(){
        this.a=0; this.b=0; this.t=0; this.x=0; this.y=0;
    }

    public Buffer(double aa, double bb){
        this.t=0; this.x=0; this.y=0;
        a=aa;
        b=bb;
        System.out.println("{a = " + a + ", b = " + b + "}");
    }

}
