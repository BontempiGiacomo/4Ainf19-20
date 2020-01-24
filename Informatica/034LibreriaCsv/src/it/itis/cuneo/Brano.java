package it.itis.cuneo;

public class Brano {
    private String idBrani;
    private int durataSec;
    private String nomeArtista;
    private String nomeBrano;

    public Brano(){

    }

    public Brano(String idBrani, int durataSec, String nomeArtista, String nomeBrano) {
        this.idBrani = idBrani;
        this.durataSec = durataSec;
        this.nomeArtista = nomeArtista;
        this.nomeBrano = nomeBrano;
    }

    public Brano(Brano brano) {
        setIdBrani(brano.getIdBrani());
        setDurataSec(brano.getDurataSec());
        setNomeArtista(brano.getNomeArtista());
        setNomeBrano(brano.getNomeBrano());
    }

    public String getIdBrani() {
        return idBrani;
    }

    public void setIdBrani(String idBrani) {
        this.idBrani = idBrani;
    }

    public int getDurataSec() {
        return durataSec;
    }

    public void setDurataSec(int durataSec) {
        this.durataSec = durataSec;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getNomeBrano() {
        return nomeBrano;
    }

    public void setNomeBrano(String nomeBrano) {
        this.nomeBrano = nomeBrano;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "idBrani='" + idBrani + '\'' +
                ", durataSec=" + durataSec +
                ", nomeArtista='" + nomeArtista + '\'' +
                ", nomeBrano='" + nomeBrano + '\'' +
                '}';
    }

    public String toRowCsv() {
        return "Brano" + Libreria.SEPARATOR + idBrani + Libreria.SEPARATOR + durataSec + Libreria.SEPARATOR + nomeArtista + Libreria.SEPARATOR + nomeBrano + "\n";
    }
}
