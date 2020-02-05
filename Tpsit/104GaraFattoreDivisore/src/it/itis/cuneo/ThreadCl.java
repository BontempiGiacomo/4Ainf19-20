package it.itis.cuneo;

public class ThreadCl extends Thread{

        public static final int MAX=10;
        public static final int MIN=2;
        public static final int NUMERO=100;
        public static final int RITARDO_MIN=500;
        public static final int RITARDO_MAX=1000;
        private String nome;

        public ThreadCl(String nome) {
            this.nome = nome;
        }

        public void run(){
            int r=0;
            int delay=0;
            int num = NUMERO;
            while (num != 1) {
                delay = (int) Math.round(Math.random() * (RITARDO_MAX - RITARDO_MIN)+RITARDO_MIN);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                r = (int) Math.round(Math.random() * (MAX - MIN) + MIN);
                if(num % r == 0){
                    num = num / r;
                    System.out.println(this.nome + ": " + r + " - " + num + " con un ritardo di: " + delay + " ms");
                }
            }
            System.out.println(this.nome + " Ha concluso");
        }
    }


