package it.itis.cuneo;

import java.awt.image.renderable.RenderableImageProducer;

/**
 * Created by inf.bontempig3107 on 30/01/2020.
 */

public class Circuito {

    public static void main(String[] args) {
        Corridore corridore1 = new Corridore("Aladin");
        Corridore corridore2 = new Corridore("Bernard");

        /*From here on forward there is the interface made by the thread*/

        Runnable corridore3runnable = new CorridoreInterfaccia("Jason");
        Thread corridore3 = new Thread(corridore3runnable);

        Runnable corridore4runnable = new CorridoreInterfaccia("Jack");
        Thread corridore4 = new Thread(corridore4runnable);

        Runnable corridore5runnable = new CorridoreInterfaccia("John");
        Thread corridore5 = new Thread(corridore5runnable);

        corridore1.start();
        corridore2.start();
        corridore3.start();
        corridore4.start();
        corridore5.start();
    }
}
