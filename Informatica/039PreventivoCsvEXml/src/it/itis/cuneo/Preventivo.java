package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "preventivo")
public class Preventivo {
    public static final String FILE_NAME = ".\\Csv\\preventivo.csv";
    public static final String FILE_NAME_MARSH = ".\\XML\\preventivo.xml";
    public static final String FILE_NAME_UNMARSH = ".\\XML\\preventivo.xml";
    public static final String SEPARATOR = ",";

    private List<Cliente> clienteList;
    public static final int IVA= 22;

    public Preventivo() {
        super();
        clienteList= new ArrayList<>();
    }

    public Preventivo(List<Cliente> clienteList) {
        super();
        this.clienteList = clienteList;
    }

    public void aggiungiCliente(Cliente cliente) {

        this.clienteList.add(cliente);
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    @XmlElement(name = "cliente")
    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public void simula() {
        Cliente c= new Cliente("MARIO", "ROSSI", "VIA SOLE");
        Articolo a= new Articolo("sz1", "domestico", 100, 20, 2);
        Articolo b= new Articolo("sz2", "domestica", 15, 10, 1);
        c.aggiungiArticolo(a);
        c.aggiungiArticolo(b);
        this.aggiungiCliente(c);

        Cliente c2= new Cliente("LUCA", "MASI", "VIA LUNA");
        Articolo a2= new Articolo("sz3", "informatico", 200, 15, 3);
        Articolo b2= new Articolo("sz4", "domotico", 23, 10,8);
        c2.aggiungiArticolo(a2);
        c2.aggiungiArticolo(b2);
        this.aggiungiCliente(c2);
    }

    public void caricaClienti(Preventivo preventivo) {
        int numeroClienti=Tastiera.leggiNumero("Inserisci la quantita di clienti: ");

        Cliente c= new Cliente();
        for(int cntClienti=0;cntClienti<numeroClienti;cntClienti++) {
            c.caricaCliente(preventivo);
        }
    }

    @Override
    public String toString() {
        return "Preventivo [clienteList=" + clienteList + "]";
    }

    public void stampa() {
        System.out.println( this.toString() );
    }

    public void stampConFor() {
        float sumPreventivo=0;
        for(int cntCliente = 0; cntCliente<this.clienteList.size(); cntCliente++) {
            Cliente cliente = this.getClienteList().get(cntCliente);
            System.out.println("Cliente: " + cliente.toString());
            double totaleIvato = cliente.calcolaPrezzoTotale();
            System.out.println("Totale ivato: " + totaleIvato);

            sumPreventivo += totaleIvato;
        }
        System.out.println("Totale Preventivo: " + sumPreventivo);

    }

    public void ordinaPreventivoByCognomeCliente() {
        Collections.sort( this.clienteList );
    }

    public Cliente ricercaClienteByCognomeAndNome(String cognome, String nome) {
        Cliente cliente=null;
        boolean foundCliente=false;

        for(int cntCliente = 0; cntCliente<this.clienteList.size() && !foundCliente; cntCliente++) {
            cliente=this.clienteList.get(cntCliente);
            if(cliente.getCognome().equalsIgnoreCase(cognome)
                    && cliente.getNome().equalsIgnoreCase(nome)) {
                foundCliente=true;
            }
            else {
                cliente=null;
            }
        }

        return cliente;
    }

    public void salvaCSV() {
        String str ="";
        BufferedWriter bw;
        try {
            bw= new BufferedWriter(new FileWriter(FILE_NAME));

            for(int cntCliente=0; cntCliente<this.clienteList.size(); cntCliente++)
            {
                Cliente cliente = this.clienteList.get(cntCliente);
                bw.write(cliente.toRowCSV());

                for(int cntArticolo=0; cntArticolo<cliente.getaArticolo().size(); cntArticolo++) {
                    Articolo articolo = cliente.getaArticolo().get(cntArticolo);
                    bw.write(articolo.toRowCsv());
                }
            }
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void apriCSV() {
        BufferedReader br;
        String rowLine;
        Cliente cliente= null;

        try {
            br = new BufferedReader(new FileReader(FILE_NAME));

            while((rowLine = br.readLine()) != null) {
                String[] campi = rowLine.split(Preventivo.SEPARATOR);
                if(campi[0].equalsIgnoreCase("Cliente")) {
                    cliente = new Cliente(campi[1], campi[2], campi[3]);
                    this.aggiungiCliente(cliente);
                }
                if(campi[0].equalsIgnoreCase("Articolo")) {
                    Articolo articolo = new Articolo(campi[1], campi[2], Double.parseDouble(campi[3]),
                            Integer.parseInt(campi[4]), Integer.parseInt(campi[5]));
                    cliente.aggiungiArticolo(articolo);
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

    public void marshalling(){
        try {
            File file = new File(FILE_NAME_MARSH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Preventivo.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void unMarshalling(){
        try {
            File file = new File(FILE_NAME_UNMARSH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Preventivo.class);
            Unmarshaller jaxbUnMarshalling = jaxbContext.createUnmarshaller();

            Preventivo preventivo = (Preventivo) jaxbUnMarshalling.unmarshal(file);
            System.out.println(preventivo.getClienteList());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[]args) {
        Preventivo p= new Preventivo();
        p.simula();

//		Cliente cliente = p.getClienteList().get(0);
//		double totaleIvato = cliente.calcolaPrezzoTotale();
//		System.out.println("totaleIvato: " + totaleIvato);
//        p.caricaClienti(p);

        System.out.println("\n\n\n*********<stampa preventivo..");
        p.stampa();

        System.out.println("\n\n\n*********stampa preventivo con for..");
        p.stampConFor();

        System.out.println("\n\n\n*********stampa preventivo ordinato..");
        p.ordinaPreventivoByCognomeCliente();
        p.stampa();

        System.out.println("\n\n\n*********stampa preventivo dopo rimuovi..");
        Cliente cliente = p.ricercaClienteByCognomeAndNome("Rossi", "Mario");
        if(cliente!= null) {
            cliente.eliminaArticolo("A1");
        }
        p.stampa();

        p.salvaCSV();

        Preventivo preventivo2 = new Preventivo();
        preventivo2.apriCSV();
        System.out.println("\n\n\n*********stampa preventivo dopo caricamento da CSV..");
        preventivo2.stampa();

        System.out.println("\n\n==================================\nXML");

        Preventivo preventivo = new Preventivo();
        preventivo.simula();
        preventivo.marshalling();
        preventivo.unMarshalling();

    }
}
