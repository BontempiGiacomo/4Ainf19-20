import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Hotel {
    private List<Camera> cameraList;
    private int counter;
    public final static String PATHNAME_XML = ".\\Xml\\output.xml";

    public List<Camera> getCameraList() {
        return cameraList;
    }
    @XmlElement
    public void setCameraList(List<Camera> cameraList) {
        this.cameraList = cameraList;
        this.counter=1;
    }


    public Hotel(){
        cameraList = new ArrayList<Camera>();
    }
    public void riempiLista(){
        Camera camera1 = new Camera(4,true,"montagna",counter);
        counter++;
        Camera camera2 = new Camera(2,false,"mare",counter);
        counter++;
        Camera camera3 = new Camera();
        camera3.riempi(counter);
        counter++;
        cameraList.add(camera1);
        cameraList.add(camera2);
        cameraList.add(camera3);
    }
    public void Marshall(){
        try {
            File file = new File(PATHNAME_XML);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //this: è il riferimento alla classe attuale  è un istanza di Hotel.class
            jaxbMarshaller.marshal(this, file);

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    public void UnMarshall(){
        try {
            File file = new File(PATHNAME_XML);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Hotel hotel = (Hotel) jaxbUnmarshaller.unmarshal(file);
            System.out.println(hotel);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.riempiLista();
        hotel.Marshall();
        hotel.UnMarshall();
    }
}
