package it.itis.cuneo;

public class ControlloT {

    public static void main(String[] args) {

        Buffer line = new Buffer();
        System.out.println("Inserire una frase: ");
        line.inputFrase();

        Stringa str1 = new Stringa(line);

        str1.start();

        try {
            str1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
