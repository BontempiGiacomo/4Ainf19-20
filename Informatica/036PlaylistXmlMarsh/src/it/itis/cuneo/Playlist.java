package it.itis.cuneo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Playlist{

    public static final String FILE_NAME = ".\\src\\playlistXML.xml";
    private List<Brano> branoList;

    public Playlist() {
        super();
        branoList = new ArrayList<Brano>();
    }

    public void addBrano(Brano brano){
        branoList.add(brano);
    }

    public List<Brano> getBranoList() {
        return this.branoList;
    }

    @XmlElement
    public void setBranoList(List<Brano> branoList) {
        this.branoList = branoList;
    }

    @Override
    public String toString() {
        return "Playlist {playlist=\n" + branoList + "}";
    }

    public String transfAXml() {
        String fileXml = "";
        for(Brano brano : this.branoList){
            fileXml = fileXml + brano.toXml();
        }
        fileXml = "<percorso>\n" + fileXml + "</percorso>";
        return fileXml;
    }

    public void writeOnXml(){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(FILE_NAME));
            writer.write(this.transfAXml());
            System.out.println(this.transfAXml());
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void marshalling(){
        try {
            File file = new File(Playlist.FILE_NAME);

            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException exJaxb) {
            exJaxb.printStackTrace();
        }
    }

    public void unmarshalling() {
        try {
            File file = new File(Playlist.FILE_NAME);

            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Playlist playlist = (Playlist) jaxbUnmarshaller.unmarshal(file);

            System.out.println(playlist);

        } catch (JAXBException exJaxb) {
            exJaxb.printStackTrace();
        }
    }

    private void simulaPlaylist() {
        Brano brano1 = new Brano("Ful", "AA", 100);
        this.addBrano(brano1);
        Brano brano2 = new Brano("Gre", "BB", 400);
        this.addBrano(brano2);
        Brano brano3 = new Brano("Vio", "CC", 800);
        this.addBrano(brano3);
        Brano brano4 = new Brano("Yel", "DD", 1400);
        this.addBrano(brano4);
        Brano brano5 = new Brano("Red", "JJ", 85);
        this.addBrano(brano5);

    }

    public void menu(){
        System.out.println("" +
                "1) Visualizza menù\n" +
                "2) Simula playlist\n" +
                "3) Scrivi su Xml\n" +
                "4) Fai il marshalling\n" +
                "5) Fai l'unmarshalling\n" +
                "47) Esci\n");
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.menu();
        System.out.println("Scegli una categoria");
        Scanner scanner = new Scanner(System.in);
        int scelta = scanner.nextInt();
        do {
            System.out.println("Scegli una categoria");
            scelta = scanner.nextInt();
            switch (scelta){
                case 1:
                    playlist.menu();
                    break;
                case 2:
                    playlist.simulaPlaylist();
                    break;
                case 3:
                    playlist.writeOnXml();
                    break;
                case 4:
                    playlist.marshalling();
                    break;
                case 5:
                    playlist.unmarshalling();
                    break;
                default:
                    System.out.println("Errore reinserire");
                    break;
            }
        }while(scelta != 47);
    }

}

