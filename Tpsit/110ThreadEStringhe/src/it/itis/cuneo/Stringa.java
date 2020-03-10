package it.itis.cuneo;

public class Stringa extends Thread{

    private static final int MIN = 1000;
    private static final int MAX = 3000;

    Buffer valore;

    public Stringa(Buffer frase){
        valore = frase;
    }

    public void run(){
        int random=0;
        int range = (MAX-MIN) + 1;
        random = (int) (Math.random() * range) + MIN;
        Stringa stringa= new Stringa(valore);
        System.out.println("La frase al contrario è: ");
        for (int i = valore.getFrase().length()-1; i>=0; i--) {

            synchronized (stringa){
                try {
                    stringa.wait(random);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print(valore.getFrase().charAt(i));
        }
        System.out.println("\n");
    }
}
