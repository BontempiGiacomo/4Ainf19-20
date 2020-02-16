package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 13/02/2020.
 */
public class GrafoPrecedenza {
    public static void main(String[] args) {
        Buffer c1 = new Buffer(2);
        Buffer c2 = new Buffer(2);

        /*sette istanza per sette classi*/
        ThreadUno thr1 = new ThreadUno(c1);
        ThreadDue thr2 = new ThreadDue(c1);
        ThreadTre thr3 = new ThreadTre(c1);
        ThreadQuattro thr4 = new ThreadQuattro(c2);
        ThreadCinque thr5 = new ThreadCinque(c2);
        ThreadSei thr6 = new ThreadSei(c2);
        ThreadSette thr7 = new ThreadSette(c1, c2);

        thr1.start();
        thr4.start();
        try {
            thr1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thr4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thr2.start();
        thr5.start();
        try {
            thr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thr5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thr3.start();
        thr6.start();
        try {
            thr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thr6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thr7.start();
        try {
            thr7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
