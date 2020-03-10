package it.itis.cuneo;

import java.util.Scanner;

public class Buffer {

    private String frase;

    public Buffer(String frase) {
        this.frase = frase;
    }

    public Buffer() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void inputFrase(){
        Scanner scannerIn = new Scanner(System.in);
        frase = scannerIn.nextLine();
    }

    @Override
    public String toString() {
        return "Buffer{" +
                "frase='" + frase + '\'' +
                '}';
    }
}
