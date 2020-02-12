package it.itis.cuneo;

public class CalcoloT extends Thread {
    Buffer valore;

    private double g = 2;
    private double j = 3;
    private double h = 4;
    private double a;

    public CalcoloT(Buffer data){ /*il parametro data fa riferimento al parametro passato nella classe <Equazione> ovvero <var> che poi sta a indicare le due variabili <a, b>*/
        this.valore = data;
        this.a = valore.a;
    }

    public void run(){
        /*
          double g = 4;
          double j = 2;
          double h = 5;
         */
        valore.t = g*(a - j) + h;
        System.out.println("Il valore di t è di: " + valore.t);
    }

}
