package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class GestionePlaylist {
    public static void main(String[] args) {
        try{
            Playlist playlist = new Playlist();

            Brano brano1 = new Brano();
            brano1.setNomeBrano("A.1");
            brano1.setNomeArtista("A");
            brano1.setDurataSec(150);

            Brano brano2 = new Brano();
            brano2.setNomeBrano("B.2");
            brano2.setNomeArtista("B");
            brano2.setDurataSec(123);

            Brano brano3 = new Brano();
            brano3.setNomeBrano("C.3");
            brano3.setNomeArtista("C");
            brano3.setDurataSec(64);

            playlist.add(brano1);
            playlist.add(brano2);
            playlist.add(brano3);

            File file = new File(".\\Playlist.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(playlist, file);
            jaxbMarshaller.marshal(playlist, System.out);
        }
        catch (JAXBException jaxb){
            jaxb.printStackTrace();
        }
    }
}
