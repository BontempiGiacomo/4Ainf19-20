package it.tiis.cuneo;

public class Segmento {

    public Segmento(){
    }

    public float getSegm(Punto punto1, Punto punto2){
        float lung;
        lung = (float) Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) +  Math.pow(punto1.getY() - punto2.getY(), 2));
        return lung;
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(5, 3);
        Punto punto2 = new Punto(5, 6);
        Punto punto3 = new Punto(1, 3);
        Punto punto4 = new Punto(1, 6);

        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);
        System.out.println(punto4);

        Segmento segmentoAB = new Segmento();
        float AB = segmentoAB.getSegm(punto1, punto2);

        Segmento segmentoBD = new Segmento();
        float BD = segmentoBD.getSegm(punto2, punto4);

        Segmento segmentoDC = new Segmento();
        float DC = segmentoDC.getSegm(punto3, punto4);

        Segmento segmentoCA = new Segmento();
        float CA = segmentoCA.getSegm(punto1, punto3);

        System.out.println("segmento AB: " + AB);
        System.out.println("segmento BD: " + BD);
        System.out.println("segmento DC: " + DC);
        System.out.println("segmento CA: " + CA);
    }
}
