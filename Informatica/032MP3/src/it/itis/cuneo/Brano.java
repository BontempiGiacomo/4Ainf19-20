package it.itis.cuneo;

public class Brano {

    public static final String CHAR_SEPARATOR = ";";

    private String titolo;
    private int durataSec;

    public Brano(){

    }

    public Brano(String titolo, int durataSec){
        this.titolo = titolo;
        this.durataSec = durataSec;
    }

    public Brano(Brano brano){
        setTitolo(brano.getTitolo());
        setDurataSec(brano.getDurataSec());
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurataSec() {
        return durataSec;
    }

    public void setDurataSec(int durataSec) {
        this.durataSec = durataSec;
    }

    public void aggiungiBrano(){
        this.titolo = InputOutputUtility.leggiNome("Inserire il titolo del brano: ");
        do {
            this.durataSec = InputOutputUtility.leggiNumero("Inserire la durata del brano:");
            if(this.durataSec<1){
                System.out.println("Valore non valido");
            }
        }while(this.durataSec<1);
    }

    public String CsvLine() {
        return "\"" + this.titolo + "\"" + CHAR_SEPARATOR +
                "\"" + this.durataSec + "\"";
    }
}
