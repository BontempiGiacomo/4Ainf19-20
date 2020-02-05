package it.itis.cuneo;

public class GestioneThread {

        public static void main(String[] args) {
            ThreadCl corridore1 = new ThreadCl("Aladin");
            ThreadCl corridore2 = new ThreadCl("Bernard");

            corridore1.start();
            corridore2.start();
        }
    }
