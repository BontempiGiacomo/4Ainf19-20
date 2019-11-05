package it.itis.cuneo;

public class ScatolaPienaException extends Exception {

    private String descrizione;

    public ScatolaPienaException(String descrizione) {
        this.descrizione = descrizione;
    }

    public String toString() {
        return "ScatolaPienaException{ \"descrizione\": " + this.descrizione + "\"" + "}";
    }
}
