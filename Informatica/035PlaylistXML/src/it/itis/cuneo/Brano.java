package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;

public class Brano {
    private String nomeBrano;
    private String nomeArtista;
    private int durataSec;

    public String getNomeBrano(){
        return this.nomeBrano;
    }

    @XmlAttribute
    public void setNomeBrano(String nomeBrano){
        this.nomeBrano = nomeBrano;
    }

    public String getNomeArtista(){
        return this.nomeArtista;
    }

    @XmlAttribute
    public void setNomeArtista(String nomeArtista){
        this.nomeArtista = nomeArtista;
    }

    public int getDurataSec(){
        return this.durataSec;
    }

    @XmlAttribute
    public void setDurataSec(int durataSec){
        this.durataSec = durataSec;
    }

}
