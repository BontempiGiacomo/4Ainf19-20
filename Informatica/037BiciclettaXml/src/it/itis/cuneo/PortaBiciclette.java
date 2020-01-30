package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;

@XmlRootElement(name = "portabicicletta")
public class PortaBiciclette {

    public static final String PATH_NAME = ".\\Xml\\037bicicletta.xml";
    public static final String PATH_NAME2 = ".\\Xml\\037bicicletta1.0.xml";

    private List<Bicicletta> biciclettaList;

    public PortaBiciclette(){
        this.biciclettaList = new ArrayList<Bicicletta>();
    }

    public List<Bicicletta> getBiciclettaList() {
        return biciclettaList;
    }

    @XmlElement
    public void setBiciclettaList(List<Bicicletta> biciclettaList) {
        this.biciclettaList = biciclettaList;
    }

    @Override
    public String toString() {
        return "portabiciclette {" + "listabicicletta=" + biciclettaList + '}';
    }

    public void addBici(Bicicletta bicicletta){
        biciclettaList.add(bicicletta);
    }

    private void prova() {
        Bicicletta bicicletta1 = new Bicicletta("Ritchey", "Shimano", "SRAM", "Schwalbe", "Schwalbe");
        this.addBici(bicicletta1);
        Bicicletta bicicletta2 = new Bicicletta("Surly", "Avid ", "ROTOR", "Continental", "Continental");
        this.addBici(bicicletta2);
        Bicicletta bicicletta3 = new Bicicletta("Saracen", "Campagnolo", "Campagnolo", "Kenda", "Kenda");
        this.addBici(bicicletta3);

    }

    public void marshalling() {
        try {
            File file = new File(PATH_NAME2);
            JAXBContext jaxbContext = JAXBContext.newInstance(PortaBiciclette.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void unMarshalling(){
        try{
            File file = new File(PATH_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(PortaBiciclette.class);

            Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
            PortaBiciclette portaBiciclette = (PortaBiciclette) jaxbUnMarshaller.unmarshal(file);
            System.out.println(portaBiciclette.getBiciclettaList());

        }catch (JAXBException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PortaBiciclette portaBiciclette = new PortaBiciclette();
        portaBiciclette.prova();
        portaBiciclette.marshalling();
        portaBiciclette.unMarshalling();
    }
}
