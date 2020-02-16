package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class Buffer {
    private int x, y, z, a, w;

    public Buffer(){
        x=0; y=0; z=0; w=0;
        a=0;
    }

    public Buffer(int x, int y, int z, int a, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.w = w;
    }

    public Buffer(int a){
        this.a=a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Buffer{" +
                "x = " + x +
                "y = " + y +
                "z = " + z +
                "a = " + a +
                "w = " + w + "}";
    }
}
