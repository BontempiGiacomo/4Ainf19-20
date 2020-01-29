package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Brano {

    private String nomeBrano;
    private String nomeAutore;
    private int durata;

    public String getNomeBrano() {
        return this.nomeBrano;
    }
    @XmlAttribute
    public void setNomeBrano(String nomeBrano) {
        this.nomeBrano = nomeBrano;
    }

    public String getNomeAutore() {
        return this.nomeAutore;
    }
    @XmlElement
    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }

    public int getDurata() {
        return this.durata;
    }
    @XmlElement
    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Brano [nome del brano=" + nomeBrano + ", nome dell'autore=" + nomeAutore + ", durata=" + durata + "]\n";
    }

    public Brano(){

    }

    public Brano(String nomeBrano, String nomeAutore, int durata) {
        super();
        this.nomeBrano = nomeBrano;
        this.nomeAutore = nomeAutore;
        this.durata = durata;
    }

    public Brano(Brano brano){
        setNomeBrano(brano.getNomeBrano());
        setNomeAutore(brano.getNomeAutore());
        setDurata(brano.getDurata());
    }

    public String toXml() {
        return  "\t<Nome del brano=\""+ nomeBrano + "\">" +
                "\n\t\t<nome dell'autore>" + nomeAutore + "</nome autore>" +
                "\n\t\t<durata>" + durata + "</durata>\n"+
                "\t</playlist>\n\n";
    }
}
