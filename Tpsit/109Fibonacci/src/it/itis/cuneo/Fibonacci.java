package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 20/02/2020.
 */
public class Fibonacci {

    public int fib(int p){
        int fibonacci;

        if(p >= 2)
            fibonacci = fib(p - 1) + fib(p - 2);
        else /*Caso per n pari a 0 e 1*/
            fibonacci = 1;

//        System.out.println("Fibonacci(" + p + "): " + fibonacci);
        return fibonacci;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fib(3);
        int valAtt=0;
        int valPrec=1;
        double rapporto;

        for(int i = 1; i<=45; i++){
            valAtt = fibonacci.fib(i);
            rapporto = (double) valAtt/valPrec;
//            System.out.println("Chiamata di fibonacci con " + (i+1) + "\n" + fibonacci.fib(i));
            System.out.println("Rapporto(" + i + "): " + rapporto);
            valPrec = valAtt;
        }
    }
}
