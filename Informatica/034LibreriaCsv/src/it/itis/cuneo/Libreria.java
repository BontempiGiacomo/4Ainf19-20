package it.itis.cuneo;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Libreria {
    public static final String FILE_NAME =
            "C:\\Users\\ASUS\\IdeaProjects\\034LibreriaCsv\\034libreriacsv.csv/";
//            "I:\\_quarta_Ainf\\_Informatica\\Java\\_JavaEs\\034LibreriaCsv\\034libreriacsv.csv";
//            "C:\\Users\\inf.bontempig3107\\Desktop\\workspaceEstivo\\Preventivo\\preventivo.csv";
    public static final String SEPARATOR = ";";

    private List<Album> albumList;

    public Libreria() {
        super();
        albumList= new ArrayList<>();
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    public void aggiungiAlbum(Album album){
        this.albumList.add(album);
    }

    public void rimuoviBrano(Brano brano){
        this.albumList.remove(brano);
    }

    public void simula() {
        Album album1= new Album("2551013", "Black");
        Brano brano1= new Brano("01801", 127, "Pexx", "Win");
        Brano brano2= new Brano("01802", 93, "Pexx", "Escape");
        album1.aggiungiBrano(brano1);
        album1.aggiungiBrano(brano2);
        this.aggiungiAlbum(album1);

        Album album2= new Album("5785231", "White");
        Brano brano3= new Brano("08501", 118,"Eir", "Dance");
        Brano brano4= new Brano("08502", 175, "Eir", "Run");
        album2.aggiungiBrano(brano3);
        album2.aggiungiBrano(brano4);
        this.aggiungiAlbum(album2);
    }

    public Album ricercaClienteByCognomeAndNome(String nome) {
        Album album=null;
        boolean trovato=false;

        for(int cntAlbum = 0; cntAlbum<this.albumList.size() && !trovato; cntAlbum++) {
            album=this.albumList.get(cntAlbum);
            if(album.getNomeAlbum().equalsIgnoreCase(nome)){
                trovato=true;
            }
            else {
                album=null;
            }
        }
        return album;
    }

    public void stampa() {
        System.out.println(this.toString());
    }

    public void apriCSV() {
        BufferedReader br;
        String rowLine;
        Album album= null;
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));

            while((rowLine = br.readLine()) != null) {
                String[] campo = rowLine.split(Libreria.SEPARATOR);
                if(campo[0].equalsIgnoreCase("Album")) {
                    album = new Album(campo[1], campo[2]);
                    this.aggiungiAlbum(album);
                }
                if(campo[0].equalsIgnoreCase("Articolo")) {
                    Brano brano = new Brano(campo[1], Integer.parseInt(campo[2]), campo[3], campo[4]);
                    album.aggiungiBrano(brano);
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void salvaCSV() {
        String str ="";
        BufferedWriter bw;
        try {
            bw= new BufferedWriter(new FileWriter(FILE_NAME));

            for(int cntAlbum=0; cntAlbum<this.albumList.size(); cntAlbum++)
            {
                Album album = this.albumList.get(cntAlbum);
                bw.write(album.toRowCSV());

                for(int cntBrano=0; cntBrano<album.getBranoList().size(); cntBrano++) {
                    Brano brano = album.getBranoList().get(cntBrano);
                    bw.write(brano.toRowCsv());
                }
            }
            //obbligatorio oppure il file rimane vuoto
            //forza lo svuotamento del buffer nel file, dopo di che lo chiude
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[]args) {
        Libreria esempioLibreria= new Libreria();
        esempioLibreria.simula();

        System.out.println("\nStampa libreria\n");
        esempioLibreria.stampa();

        System.out.println("Rimozione album");
        Album album = esempioLibreria.ricercaClienteByCognomeAndNome("White");
        Brano brano = new Brano("08501", 118,"Eir", "Dance");
        if(album!= null) {
            album.rimuoviBrano(brano);
        }
        esempioLibreria.stampa();

        esempioLibreria.salvaCSV();

        Libreria libreria = new Libreria();
        libreria.apriCSV();
        System.out.println("");
        libreria.stampa();
    }



}
