package it.itis.cuneo;

import java.util.Calendar;

public class Bottiglie {

    private String nomeBottiglia;
    private String luogo;
    private Calendar dataImobttigliamento;


    public String getNomeBottiglia() {
        return nomeBottiglia;
    }

    public void setNomeBottiglia(String nomeBottiglia) {
        this.nomeBottiglia = nomeBottiglia;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public Calendar getDataImobttigliamento() {
        return dataImobttigliamento;
    }

    public void setDataImobttigliamento(Calendar dataImobttigliamento) {
        this.dataImobttigliamento = dataImobttigliamento;
    }

    public Bottiglie() {

    }

    public Bottiglie(String nomeBottiglia, String luogo, Calendar dataImobttigliamento) {
        this.nomeBottiglia = nomeBottiglia;
        this.luogo = luogo;
        this.dataImobttigliamento = dataImobttigliamento;
    }

    public Bottiglie(Bottiglie bottiglie) {
        this.nomeBottiglia = bottiglie.getNomeBottiglia();
        this.luogo = bottiglie.getLuogo();
        this.dataImobttigliamento = bottiglie.getDataImobttigliamento();
    }

    public boolean equals(Bottiglie bottiglie) {
        boolean sEquals = false;
        if (nomeBottiglia != null && nomeBottiglia.equals(bottiglie.getNomeBottiglia())
                && (luogo != null && luogo.equals(bottiglie.getLuogo()))
                && dataImobttigliamento != null && dataImobttigliamento.equals(bottiglie.getDataImobttigliamento())) {
            sEquals = true;
        }
        return sEquals;
    }

    public String toString() {
        return "Bottiglia {" + "\"Nome della bottiglia\": " + this.nomeBottiglia + " \"Luogo di produzione\": " + this.luogo + " \"dataPubblicazione\": " + this.dataImobttigliamento + '}';
    }
}