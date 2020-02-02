import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Scanner;

public class Camera {
    private int letto;
    private boolean bagno;
    private String vista;
    private int numero;


    public int getNumero(){
        return numero;
    }
    @XmlAttribute(name="nome")
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLetto() {
        return letto;
    }
    @XmlElement
    public void setLetto(int letto) {
        this.letto = letto;
    }

    public boolean isBagno() {
        return bagno;
    }
    @XmlElement
    public void setBagno(boolean bagno) {
        this.bagno = bagno;
    }

    public String getVista() {
        return vista;
    }
    @XmlElement
    public void setVista(String vista) {
        this.vista = vista;
    }

    public Camera(int letto, boolean bagno, String vista,int numero) {
        this.letto = letto;
        this.bagno = bagno;
        this.vista = vista;
        this.numero = numero;
    }
    public Camera() {

    }
    public void riempi(int numero){
        this.numero = numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero di letti: ");
        this.letto = scan.nextInt();
        System.out.println("C'è il bagno [Y/N]: ");
        if(scan.next().equalsIgnoreCase("y"))
            this.bagno = true;
        else
            this.bagno = false;
        System.out.println("Cosa vedi dalla camera?");
        this.vista = scan.next();
    }
    @Override
    public String toString() {
        return "Camera{" +
                "letto=" + letto +
                ", bagno=" + bagno +
                ", vista='" + vista +
                ", numero=" + numero+ '\'' +
                '}';
    }
}
