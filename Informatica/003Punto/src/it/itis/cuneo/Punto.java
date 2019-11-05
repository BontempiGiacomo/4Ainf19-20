package it.itis.cuneo;

public class Punto {
    //attributi
    private int ascissa;
    private int ordinata;

    public Punto(){

    }

    public Punto(int ascissa, int ordinata){
        this.ascissa = ascissa;
        this.ordinata = ordinata;
    }

    public void setAscissa(int ascissa) {
        this.ascissa = ascissa;
    }

    public int getAscissa() {
        return ascissa;
    }

    public void setOrdinata(int ordinata) {
        this.ordinata = ordinata;
    }

    public int getOrdinata() {
        return ordinata;
    }

    public int getQuadrante(){
        int quadrante = 0;
        if(this.ascissa>0 && this.ordinata>0){
            quadrante = 1;
        }
        else {
            if(this.ascissa<0 && this.ordinata<0){
                quadrante = 3;
            }
            else{
                if(this.ascissa>0 && this.ordinata<0){
                    quadrante = 4;
                }
                else{
                    if(this.ascissa<0 && this.ordinata>0){
                        quadrante = 2;
                    }
                    else{
                        if(this.ascissa == 0 && this.ordinata == 0){
                            quadrante = 0;
                        }
                    }
                }
            }
        }
        return quadrante;
    }

    public float getDistanza(Punto punto){
        float risulato=0;
        risulato = (float) Math.sqrt(Math.pow(this.ascissa - punto.getAscissa(), 2) + Math.pow(this.ordinata - punto.getOrdinata(), 2));
        return risulato;
    }

    public boolean getEquals(Punto punto) {
        boolean equals = false;
        if(this.ascissa == punto.getAscissa() && this.ordinata == punto.getOrdinata()){
            equals = true;
        }
    return equals;
    }

    public String toString(){
        return "Punto { ascissa: " + this.ascissa + ", ordinata: " + this.ordinata + "}";
    }

    public static void main(String[] args) {
        int x;
        //Quadrante
        Punto punto1 = new Punto(-2, 1);
        x = punto1.getQuadrante();
        //stampa dei quadranti
        if(x==1){
            System.out.println("Il punto 1 si trova nel primo quadrante");
        }
        //same
        else{
            if(x==2) {
                System.out.println("Il punto 1 si trova nel secondo quadrante");
            }
            else{
                if(x==3){
                    System.out.println("Il punto 1 si trova nel terzo quadrante");
                }
                else{
                    if(x==4){
                        System.out.println("Il punto 1 si trova nel quarto quadrante ");
                    }
                    else {
                        if(x==0){
                            System.out.println("Il punto 1 conicide con l'origine degli assi");
                        }
                    }
                }
            }
        }
        float a;
        Punto punto2 = new Punto(10, 1);
        Punto punto3 = new Punto(5, 1);
        a = punto2.getDistanza(punto3);
        System.out.println("La distanza tra i punti 2 e 3 vale: " + a);

        boolean uguali;
        Punto punto4 = new Punto(4, 2);
        Punto punto5 = new Punto(4, 2);
        uguali = punto4.getEquals(punto5);
        if(uguali == true){
            System.out.println("I punti 4 e 5 sono uguali");
        }
        else{
            if(uguali ==false){
                System.out.println("I punti 4 e 5 non sono uguali");
            }
        }
        Punto punto0 = new Punto(2 , 5);
        System.out.println( punto0.toString() );
    }
}
