package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 20/02/2020.
 */
public class FibonacciThread extends Thread{

    private int p;
    private int fibonacci;

    public FibonacciThread(int p) {
        this.p = p;
    }

    public int getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(int fibonacci) {
        this.fibonacci = fibonacci;
    }

    public void run(){
        if(p >= 2) {
            FibonacciThread f1 = new FibonacciThread(p - 2);
            f1.start();
            FibonacciThread f2 = new FibonacciThread(p - 2);
            f2.start();
            try {
                f1.join();
                f2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fibonacci = f1.getFibonacci()+ f2.getFibonacci();
        }
        else
            fibonacci = 1;
    }

    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread(5);
        int num;
        System.out.println("Fibonacci (" + fibonacciThread.getFibonacci()+ ")");
    }
}
