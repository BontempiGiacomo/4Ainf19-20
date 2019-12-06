package it.itis.cuneo;

import javafx.collections.ObservableArray;

import java.util.Arrays;

public class Porto {
    private Barca barca;
    private Barca[] vetBarca;
    public static final int MAX_BARCHE = 100;

    public Porto(Barca barca, Barca[] vetBarca) {
        this.barca = barca;
        this.vetBarca = vetBarca;
    }

    public Barca getBarca() {
        return barca;
    }

    public void setBarca(Barca barca) {
        this.barca = barca;
    }

    public int setVetBarca(Barca barca, int posizione){
        if(posizione<0 || posizione>MAX_BARCHE){
            return -1;
        }
        if(this.vetBarca[posizione] != null){
            return -2;
        }
        this.vetBarca[posizione] = barca;
        return posizione;
    }

    public Barca getVetBarca(int posizione){
        if(posizione<0 || posizione>MAX_BARCHE){
            return null;
        }
        return this.vetBarca[posizione];
    }

    public Porto(){
        this.vetBarca = new Barca[MAX_BARCHE];
    }

    public Porto(Porto porto){
        int posizione;
        this.vetBarca = new Barca[MAX_BARCHE];
        for(posizione = 0; posizione<MAX_BARCHE; posizione++){
            if(porto.getVetBarca(posizione) != null){
                this.vetBarca[posizione] = porto.getVetBarca(posizione);
            }
        }
    }

    public void barcaArrivo(){
        int numeroBarche = InputOutputUtility.leggiNumero("Quante barche vuoi inserire?: ");
        for(int cnt=0; cnt<numeroBarche; cnt++) {
            Barca barca = new Barca();
            barca.caricaBarca();
            this.setVetBarca(barca, cnt);
        }
    }

    public float togliBarca(int nGiorni){
        int barcaDaTogliere;
        do {
            barcaDaTogliere = InputOutputUtility.leggiNumero("Inserire la posizione della barca da togliere: ");
            if (barcaDaTogliere < 0 || barcaDaTogliere > MAX_BARCHE) {
                System.err.println("Non hai inserito la posizione corretta!! Reinserire");
            }
        }while (barcaDaTogliere < 0 || barcaDaTogliere > MAX_BARCHE);
        float importoAffitto = 0;
        if(this.vetBarca[barcaDaTogliere].getTipologia() == 0){
            importoAffitto = (20*this.vetBarca[barcaDaTogliere].getStazza())*nGiorni;
        }
        else {
            importoAffitto = (10*this.vetBarca[barcaDaTogliere].getLunghezza())*nGiorni;
        }
        this.vetBarca[barcaDaTogliere] = null;
        return importoAffitto;
    }

    public int ricercaBarca(){
        /*Ricerca tramite nome*/
        String nome;
        nome = InputOutputUtility.leggiNome("Inserire il nome della barca da ricercare: ");
        for(int i=0; i<MAX_BARCHE; i++){
            if(this.vetBarca[i].getNome().equals(nome)){
                return 1;
            }
        }
        return -1;
        /*
        **Ricerca tramite posizione
        int posizione;
        do {
            posizione = InputOutputUtility.leggiNumero("Inserire la posizione della barca da ricercare: ");
            if (posizione < 0 || posizione > MAX_BARCHE) {
                System.err.println("Non hai inserito la posizione corretta!! Reinserire");
            }
        }while (posizione < 0 || posizione > MAX_BARCHE);
        int i=0;
        while(posizione!=i) {
            i++;
        }
        return -1;
        */
    }

    @Override
    public String
    toString() {
        return "Porto{" +
                "vetBarca=" + Arrays.toString(vetBarca) +
                '}';
    }
}
