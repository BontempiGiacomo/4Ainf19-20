package it.itis.cuneo;

public class Buffer {

    public int n, fattorialeN;

    public Buffer() {
    }

    public Buffer(int n, int fattorialeN) {
        this.n = n;
        this.fattorialeN = fattorialeN;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getFattorialeN() {
        return fattorialeN;
    }

    public void setFattorialeN(int fattorialeN) {
        this.fattorialeN = fattorialeN;
    }

    @Override
    public String toString() {
        return "Buffer{" +
                "n=" + n +
                ", fattorialeN=" + fattorialeN +
                '}';
    }
}
