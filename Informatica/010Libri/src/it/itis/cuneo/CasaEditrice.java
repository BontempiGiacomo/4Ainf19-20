package it.itis.cuneo;

/**
 * Created by inf.bontempig3107 on 17/10/2019.
 */
public class CasaEditrice {
    private String regioneSociale;
    private String luogo;
    private int annoDiFondazione;

    public CasaEditrice(String regioneSociale, String luogo, int annoDiFondazione){
        setRegioneSociale(regioneSociale);
        setLuogo(luogo);
        setAnnoDiFondazione(annoDiFondazione);
    }

    public CasaEditrice(CasaEditrice casa){
        this.regioneSociale = casa.getRegioneSociale();
        this.luogo = casa.getLuogo();
        this.annoDiFondazione = casa.getAnnoDiFondazione();
    }

    public void setRegioneSociale(String regioneSociale){
        this.regioneSociale = regioneSociale;
    }

    public String getRegioneSociale(){
        return regioneSociale;
    }

    public void setLuogo(String luogo){
        this.luogo = luogo;
    }

    public String getLuogo(){
        return luogo;
    }

    public void setAnnoDiFondazione(int annoDiFondazione){
        this.annoDiFondazione = annoDiFondazione;
    }

    public int getAnnoDiFondazione(){
        return annoDiFondazione;
    }
}
