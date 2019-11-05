package it.itis.cuneo;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

public class Programma {
    private String denominazione;
    private String produttore;
    private String versione;
    private String sistemaOperativo;
    private String anno;

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public String getVersione() {
        return versione;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getAnno() {
        return anno;
    }

    public Programma(String denominazione, String produttore, String versione, String sistemaOperativo, String anno){
        setDenominazione(denominazione);
        setProduttore(produttore);
        setVersione(versione);
        setSistemaOperativo(sistemaOperativo);
        setAnno(anno);
    }

    public Programma(Programma programma){
        setDenominazione(programma.getDenominazione());
        setProduttore(programma.getProduttore());
        setVersione(programma.getVersione());
        setSistemaOperativo(programma.getSistemaOperativo());
        setAnno(programma.getAnno());
    }

    public String toString(){
        return "Programma {\"Nome del programma\": " + this.denominazione + " \"produttore\": " + this.produttore + " \"versione\": " + this.versione + " \"sistema operativo\": " +
                this.sistemaOperativo + " \"anno di rilascio\": " + this.anno + "}";
    }

    public String compareAnno(Programma programma){
        String output = "I due programmi sono stati rilasciti lo stesso anno";
        int annoInt = Integer.parseInt(this.anno);
        int annoInt2 = Integer.parseInt(programma.getAnno());
        try{
            annoInt = Integer.parseInt(this.anno);
            annoInt2 = Integer.parseInt(programma.getAnno());
        }catch (Exception ex){
            System.out.println("Il numero inserito non ha valori numerici");
            ex.printStackTrace();
        }

        if(annoInt < annoInt2){
            output = "Il programma " + this.denominazione + " è stato rilasciato prima rispetto al programma " + programma.getDenominazione();
        }
        else{
            if (annoInt > annoInt2){
                output = "Il programma " + this.denominazione + " è stato rilasciato dopo rispetto al programma " + programma.getDenominazione();
            }
        }
        return output;
    }

    public String toString2(ContenitoreDiProgrammi contenitoreDiProgrammi){

        return "Programma1 {\"Nome del programma\": " + contenitoreDiProgrammi.getProgramma1().getDenominazione() + " \"produttore\": " + contenitoreDiProgrammi.getProgramma1().getProduttore() +
                " \"versione\": " + contenitoreDiProgrammi.getProgramma1().getVersione() + " \"sistema operativo\": " + contenitoreDiProgrammi.getProgramma1().getSistemaOperativo() +
                " \"anno di rilascio\": " + contenitoreDiProgrammi.getProgramma1().getAnno() + "}" +

                "\nProgramma2 {\"Nome del programma\": " + contenitoreDiProgrammi.getProgramma2().getDenominazione() + " \"produttore\": " + contenitoreDiProgrammi.getProgramma2().getProduttore()
                + " \"versione\": " + contenitoreDiProgrammi.getProgramma2().getVersione() + " \"sistema operativo\": " + contenitoreDiProgrammi.getProgramma2().getSistemaOperativo() +
                " \"anno di rilascio\": " + contenitoreDiProgrammi.getProgramma2().getAnno() + "}" +

                "\nProgramma3 {\"Nome del programma\": " + contenitoreDiProgrammi.getProgramma3().getDenominazione() + " \"produttore\": " + contenitoreDiProgrammi.getProgramma3().getProduttore()
                + " \"versione\": " + contenitoreDiProgrammi.getProgramma3().getVersione() + " \"sistema operativo\": " + contenitoreDiProgrammi.getProgramma3().getSistemaOperativo() +
                " \"anno di rilascio\": " + contenitoreDiProgrammi.getProgramma3().getAnno() + "}";
    }

    public static void main(String[] args) {
        Programma programmaUno = new Programma("A", "M", "1.0.11", "5S", "2000");
        Programma programmaDue = new Programma("B", "J", "1.2.47", "2124E", "2000");
        System.out.println(programmaUno.toString());
        System.out.println(programmaUno.compareAnno(programmaDue));
    }

}
