package it.itis.cuneo;

import javax.annotation.processing.FilerException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.bontempig3107 on 05/02/2020.
 */
@XmlRootElement(name = "magazzino")
public class Magazzino {
    public static final String FILE_PATH_XML= ".\\Xml\\prodotti.xml";
    public static final String FILE_PATH_XML2= ".\\Xml\\prodotti2.xml";
    public static final String FILE_PATH_CSV= ".\\Csv\\prodotti.csv";
    public static final String SEPARATOR= ";";
    public static final String NOME_CLASSE= "Magazzino";

    private String name;
    private List<Prodotto> prodottoList;

    public Magazzino() {
        prodottoList = new ArrayList<Prodotto>();
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public List<Prodotto> getProdottoList() {
        return prodottoList;
    }

    @XmlElement(name = "prodotto")
    public void setProdottoList(List<Prodotto> prodottoList) {
        this.prodottoList = prodottoList;
    }

    @Override
    public String toString() {
        return "Magazzino{" +
                "name='" + name +
                ", prodottoList=" + prodottoList + "}\n";
    }

    public void marshall(){
        try {
            File file = new File(FILE_PATH_XML2);
            JAXBContext jaxbContext = JAXBContext.newInstance(Magazzino.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(this, file);
            marshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public Magazzino unMarshall(){
        Magazzino magazzino = null;
        try {
            File file = new File(FILE_PATH_XML);
            JAXBContext jaxbContext = JAXBContext.newInstance(Magazzino.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            magazzino = (Magazzino) unmarshaller.unmarshal(file);

            System.out.println(magazzino.getProdottoList());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return magazzino;
    }

    public void simulaMagazzino(){
        Prodotto prodotto1 = new Prodotto("p1", "pasta");
        this.prodottoList.add(prodotto1);
        Prodotto prodotto2 = new Prodotto("p2", "riso");
        this.prodottoList.add(prodotto2);
        Prodotto prodotto3 = new Prodotto("p3", "latte");
        this.prodottoList.add(prodotto3);
        Prodotto prodotto4 = new Prodotto("p4", "carne");
        this.prodottoList.add(prodotto4);

    }

    public void salvaCSV(Magazzino magazzino){
        BufferedWriter writer = null;
        try {
            File file = new File(FILE_PATH_CSV);
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(this.toRowCsv());
            for(Prodotto prodotto : magazzino.getProdottoList()){
                writer.write(prodotto.toRowCsv());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String toRowCsv() {
        return NOME_CLASSE + SEPARATOR + name + SEPARATOR + "\n";
    }

    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino();

        //magazzino.marshall();
        magazzino = magazzino.unMarshall();
        magazzino.salvaCSV(magazzino);

    }
}


