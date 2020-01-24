package it.itis.cuneo;

import java.util.List;
import java.util.ArrayList;


public class Album {
    private String idAlbum;
    private String nomeAlbum;

    private List<Brano> branoList;

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public List<Brano> getBranoList() {
        return branoList;
    }

    public void setBranoList(List<Brano> branoList) {
        this.branoList = branoList;
    }

    public Album(String idAlbum, String nomeAlbum){
        super();
        this.idAlbum = idAlbum;
        this.nomeAlbum = nomeAlbum;
        branoList = new ArrayList<Brano>();
    }

    public void aggiungiBrano(Brano brano){
        this.branoList.add(brano);
    }

    public void rimuoviBrano(Brano brano){
        this.branoList.remove(brano);
    }

    @Override
    public String toString() {
        return "Album [id album=" + idAlbum  + ", nome album=" + nomeAlbum + "]";
    }

    public String toRowCSV() {
        return "Album" + Libreria.SEPARATOR + idAlbum + Libreria.SEPARATOR + nomeAlbum + "\n";
    }
}
