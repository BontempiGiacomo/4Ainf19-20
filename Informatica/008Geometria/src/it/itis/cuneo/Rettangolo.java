package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 07/10/2019.
 */
public class Rettangolo {

    //attributi
    private Segmento segmentoAlto;
    private Segmento segmentoBasso;
    private Segmento segmentoDestra;
    private Segmento segmentoSinistro;

    public Rettangolo(Segmento segmentoAlto, Segmento segmentoBasso, Segmento segmentoDestra, Segmento segmentoSinistro){
        this.segmentoAlto = new Segmento(segmentoAlto);
        this.segmentoBasso = new Segmento(segmentoBasso);
        this.segmentoDestra = new Segmento(segmentoDestra);
        this.segmentoSinistro = new Segmento(segmentoSinistro);
    }

    public Rettangolo(Rettangolo rettangolo){
        this.segmentoAlto = new Segmento(rettangolo.getSegmentoAlto());
        this.segmentoBasso = new Segmento(rettangolo.getSegmentoBasso());
        this.segmentoDestra = new Segmento(rettangolo.getSegmentoDestra());
        this.segmentoSinistro = new Segmento(rettangolo.getSegmentoSinistro());
    }

    public void setSegmentoAlto(Segmento segmentoAlto){
        this.segmentoAlto = segmentoAlto;
    }

    public Segmento getSegmentoAlto() {
        return segmentoAlto;
    }

    public void setSegmentoBasso(Segmento segmentoBasso) {
        this.segmentoBasso = segmentoBasso;
    }

    public Segmento getSegmentoBasso() {
        return segmentoBasso;
    }

    public void setSegmentoDestra(Segmento segmentoDestra) {
        this.segmentoDestra = segmentoDestra;
    }

    public Segmento getSegmentoDestra() {
        return segmentoDestra;
    }

    public void setSegmentoSinistro(Segmento segmentoSinistro) {
        this.segmentoSinistro = segmentoSinistro;
    }

    public Segmento getSegmentoSinistro() {
        return segmentoSinistro;
    }

    public String toString(){
        return "";
    }

}
