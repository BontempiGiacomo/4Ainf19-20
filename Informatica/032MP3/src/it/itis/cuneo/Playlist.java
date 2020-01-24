package it.itis.cuneo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Playlist {

    private ArrayList<Brano> playlist;
    public static final String FILE_NAME = "playlist.csv";
    public static final String FILE_NBRANI = "nBrani.csv";
    public static final String FILE_TBRANI = "tBrani.csv";

    public Playlist() {
        playlist = new ArrayList<Brano>();
    }

    public Playlist(ArrayList<Brano> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Brano> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Brano> playlist) {
        this.playlist = playlist;
    }

    public void aggiungiBranoPlaylist(Brano brano) {
        playlist.add(playlist.size(), brano);
    }

    public void eliminaBrano(String titolo) {
        int cnt=0;
        while (cnt<playlist.size() && !titolo.equalsIgnoreCase(playlist.get(cnt).getTitolo())){
            cnt++;
        }
        if (titolo.equalsIgnoreCase(playlist.get(cnt).getTitolo())) {
            playlist.remove(cnt);
        }
    }

    public int durata() {
        int durataTotale=-1;
        for (Brano brano : playlist) {
            durataTotale = durataTotale + brano.getDurataSec();
        }
        return durataTotale;
    }

    public void esportaNBrani(int n) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NBRANI));
        writer.write("Esportazione n brani:\n\n");
        for (int cnt=0; cnt<n; cnt++) writer.write(playlist.get(cnt).CsvLine() + "\n");
        writer.close();
    }

    public void esportaTBrani(int t) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_TBRANI));
        writer.write("Esportazione brani entro un tempo di riproduzione massimo:\n\n");
        int cnt=0;
        int deltaT = 0;
        while (cnt<playlist.size() && deltaT<t) {
            deltaT += playlist.get(cnt).getDurataSec();
            if (deltaT<t) {
                writer.write(playlist.get(cnt).CsvLine() + "\n");
            }
            cnt++;
        }
        writer.close();
    }

    public void spostaBranoPrecedente(int pos) {
        playlist.set(pos-1, playlist.get(pos));
        playlist.remove(pos);
    }

    public void spostaBranoSuccessiva(int pos) {
        playlist.set(pos+1, playlist.get(pos));
        playlist.remove(pos);
    }

    public void salvaLista() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Brano brano : playlist){
            writer.write(brano.CsvLine() + "\n");
        }
        writer.close();
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i=playlist.size()-1; i>0; i--) {
            Brano brano = new Brano(playlist.get(i));
            int c = rand.nextInt(i);
            playlist.set(i, playlist.get(c));
            playlist.set(c, brano);
        }
    }

    public static int menu() {
        System.out.println(
                "1)Caricamento del brano\n" +
                "2)Rimozione del brano\n" +
                "3)Determinazione della durata totale dei brani presenti nella playlist\n" +
                "4)Esportazione su csv dei primi \"n\" brani\n" +
                "5)Esportazione su csv dei brani fino ad un tempo complessivo di: \"t\" secondi\n" +
                "6)Spostamento di un brano alla posizione precedente\n" +
                "7)Spostamento di un brano alla posizione successiva\n" +
                "8)Salvataggio e ripristino della lista\n" +
                "9)Riordino casuale dei brani della lista\n" +
                "99)Uscita dal programma\n");

        return InputOutputUtility.leggiNumero("Inserire l'opzione desiderata: ");
    }

    public static void main(String[] args) {

        int scelta, variabileTemp;
        String titolo;
        Brano brano = new Brano();
        it.itis.cuneo.Playlist playlist = new it.itis.cuneo.Playlist();
        do {
            scelta = menu();
            System.out.println();
            switch (scelta) {

                case 1:
                    brano.aggiungiBrano();
                    playlist.aggiungiBranoPlaylist(brano);
                    System.out.println("Brano aggiunto correttamente\n");
                    break;
                case 2:
                    titolo = InputOutputUtility.leggiNome("Inserire il titolo del brano da rimuovere dalla playlist: ");
                    playlist.eliminaBrano(titolo);
                    System.out.println("Brano rimosso correttamente\n");
                    break;
                case 3:
                    System.out.println("La durata totale della playlist e' di: " + playlist.durata() + "\n");
                    break;
                case 4:
                    variabileTemp = InputOutputUtility.leggiNumero("Inserire il numero dei primi brani da visualizzare: ");
                    if (variabileTemp<0 || variabileTemp>playlist.playlist.size()){
                        System.out.println("\tPosizione non valida\n");
                    }
                    else {
                        try {
                            playlist.esportaNBrani(variabileTemp);
                            System.out.println("I brani sono stati esportati correttamente\n");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    break;
                case 5:
                    variabileTemp = InputOutputUtility.leggiNumero("Inserire il tempo complessivo dei brani da esportare: ");
                    if (variabileTemp<0) {
                        System.out.println("\tTempo non valido\n");
                    }
                    else {
                        try {
                            playlist.esportaTBrani(variabileTemp);
                            System.out.println("I brani sono stati esportati correttamente\n");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    break;
                case 6:
                    variabileTemp = InputOutputUtility.leggiNumero("Inserire la posizione del brano da spostare nella posizione precedente: ");
                    if (variabileTemp<2 || variabileTemp>playlist.playlist.size()){
                        System.out.println("\tPosizione non valida\n");
                    }
                    else {
                        playlist.spostaBranoPrecedente(variabileTemp-1);
                        System.out.println("Il brano è stato spostato nella posizione precedente\n");
                    }
                    break;
                case 7:
                    variabileTemp = InputOutputUtility.leggiNumero("Inserire la posizione del brano da spostare nella posizione successiva: ");
                    if (variabileTemp<1 || variabileTemp>playlist.playlist.size()-1) {
                        System.out.println("\tPosizione non valida\n");
                    }
                    else {
                        playlist.spostaBranoSuccessiva(variabileTemp-1);
                        System.out.println("Il brano è stato spostato nella posizione successiva\n");
                    }
                    break;
                case 8:
                    try {
                        playlist.salvaLista();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("Playlist salvata correttamente\n");
                    break;
                case 9:
                    playlist.shuffle();
                    System.out.println("I brani sono stati ordinati in modo casuale\n");
                    break;
                case 99:
                    System.out.println("Uscita dal programma\n☺");
                    break;
                default:
                    System.out.println("La scelta effettuata non è prevista nel programma");
            }
        } while (scelta!=99);
    }
}
