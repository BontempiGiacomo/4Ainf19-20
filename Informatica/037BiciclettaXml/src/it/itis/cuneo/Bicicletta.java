package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Bicicletta {

    private String telaio;
    private String cambio;
    private String freni;
    private String ruotaAnteriore;
    private String ruotaPosteriore;

    public Bicicletta() {

    }

    public Bicicletta(String telaio, String freni, String cambio, String ruotaAnteriore, String ruotaPosteriore) {
        this.telaio = telaio;
        this.cambio = cambio;
        this.freni = freni;
        this.ruotaAnteriore = ruotaAnteriore;
        this.ruotaPosteriore = ruotaPosteriore;
    }

    public String getTelaio() {
        return telaio;
    }

    @XmlElement
    public void setTelaio(String telaio) {
        this.telaio = telaio;
    }

    public String getCambio() {
        return cambio;
    }

    @XmlElement
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getFreni() {
        return freni;
    }

    @XmlElement
    public void setFreni(String freni) {
        this.freni = freni;
    }

    public String getRuotaAnteriore() {
        return ruotaAnteriore;
    }

    @XmlElement
    public void setRuotaAnteriore(String ruotaAnteriore) {
        this.ruotaAnteriore = ruotaAnteriore;
    }

    public String getRuotaPosteriore() {
        return ruotaPosteriore;
    }

    @XmlElement
    public void setRuotaPosteriore(String ruotaPosteriore) {
        this.ruotaPosteriore = ruotaPosteriore;
    }

    @Override
    public String toString() {
        return "Bicicletta{" +
                "telaio= " + telaio +
                ", cambio= " + cambio +
                ", freni= " + freni +
                ", ruotaAnteriore= " + ruotaAnteriore +
                ", ruotaPosteriore= " + ruotaPosteriore  +
                "}\n";
    }
}
