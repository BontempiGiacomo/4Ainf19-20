package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 21/09/2019.
 */
public class Numero {
    //Attributo
    private int valore;

    //metodi
    public Numero(int valore){
        this.valore = valore;
    }

    public void setValore(int valore)
    {
        this.valore = valore;
    }

    public int getValore(){
        return this.valore;
    }

    //metodo fuori dalla classe (static) come se fuori
    public static void main(String args[]){
        int x;
        //i modificatori di visibilita' non devono essere inseriti deentro i metodi va messo solo ai metodi e agli attributi
        Numero numero = new Numero(5); //il valore contenuto nell'oggetto
        x = numero.getValore();
        System.out.println(x);
    }
}
