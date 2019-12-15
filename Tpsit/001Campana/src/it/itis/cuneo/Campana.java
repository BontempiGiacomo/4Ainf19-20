package it.itis.cuneo;

 public class Campana implements Runnable {
     private String suono;
     private int volte;

    public Campana(String suono, int volte){
        this.suono = suono;
        this.volte = volte;
    }

    public void run() {
        for (int k = 0; k < volte; k++) {
            System.out.println((k + 1) + suono + "");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

}
