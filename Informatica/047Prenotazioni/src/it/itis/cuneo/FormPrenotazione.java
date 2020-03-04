package it.itis.cuneo;

import javax.sound.sampled.BooleanControl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPrenotazione extends JFrame implements ActionListener {

    private static final int MAX_PRENOTAZIONI = 10;
    private Prenotazione[] prenotazioneVet;
    private int conta;

    JButton conferma;
    JButton annulla;
    JButton stampa;
    JButton salva;
    JButton clear;

    JLabel cognomeLabel;
    JLabel nomeLabel;
    JLabel telefonoLabel;
    JLabel cittaPartenzaLabel;
    JLabel cittaDestinazioneLabel;
    JLabel dataLabel;

    JTextField cognomeField;
    JTextField nomeField;
    JTextField telefonoField;
    JTextField cittaPartenzaField;
    JTextField cittaDestinazioneField;
    JTextField dataField;


    public FormPrenotazione(){
        setTitle("Prenotazione");
        setLocation(800, 400);
        initComponents();
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void initComponents(){
        conta = 0;
        Container container = this.getContentPane();
        JPanel panelDati = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelDati, BoxLayout.Y_AXIS);
        panelDati.setLayout(boxLayout);

        cognomeLabel = new JLabel("Cognome");
        cognomeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        cognomeField = new JTextField(20);
        cognomeField.setAlignmentX(Component.CENTER_ALIGNMENT);

        nomeLabel = new JLabel("Nome");
        nomeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        nomeField = new JTextField(20);
        nomeField.setAlignmentX(Component.CENTER_ALIGNMENT);

        telefonoLabel = new JLabel("Telefono");
        telefonoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        telefonoField = new JTextField(20);
        telefonoField.setAlignmentX(Component.CENTER_ALIGNMENT);

        cittaPartenzaLabel = new JLabel("Città di partenza");
        cittaPartenzaLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        cittaPartenzaField = new JTextField(20);
        cittaPartenzaField.setAlignmentX(Component.CENTER_ALIGNMENT);

        cittaDestinazioneLabel = new JLabel("Città di destinazione");
        cittaDestinazioneLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        cittaDestinazioneField = new JTextField(20);
        cittaDestinazioneField.setAlignmentX(Component.CENTER_ALIGNMENT);

        dataLabel = new JLabel("Data");
        dataLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        dataField = new JTextField(20);
        dataField.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelDati.add(cognomeLabel);
        panelDati.add(cognomeField);
        panelDati.add(nomeLabel);
        panelDati.add(nomeField);
        panelDati.add(telefonoLabel);
        panelDati.add(telefonoField);
        panelDati.add(cittaPartenzaLabel);
        panelDati.add(cittaPartenzaField);
        panelDati.add(cittaDestinazioneLabel);
        panelDati.add(cittaDestinazioneField);
        panelDati.add(dataLabel);
        panelDati.add(dataField);

        JPanel panelPulsanti = new JPanel();

        conferma = new JButton("Conferma");
        conferma.setAlignmentX(Component.CENTER_ALIGNMENT);

        annulla = new JButton("Annulla");
        annulla.setAlignmentX(Component.CENTER_ALIGNMENT);

        stampa = new JButton("Stampa");
        stampa.setAlignmentX(Component.CENTER_ALIGNMENT);

        salva = new JButton("Salva");
        salva.setAlignmentX(Component.CENTER_ALIGNMENT);

        clear = new JButton("Azzera");
        clear.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelPulsanti.add(conferma);
        panelPulsanti.add(annulla);
        panelPulsanti.add(stampa);
        panelPulsanti.add(salva);
        panelPulsanti.add(clear);

        container.add(panelDati, BorderLayout.CENTER);
        container.add(panelPulsanti, BorderLayout.SOUTH);

        prenotazioneVet = new Prenotazione[MAX_PRENOTAZIONI];

        conferma.addActionListener(this);
        annulla.addActionListener(this);
        stampa.addActionListener(this);
        salva.addActionListener(this);
        clear.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == conferma){
            String cognome = cognomeField.getText();
            String nome = nomeField.getText();
            String telefono = telefonoField.getText();
            String cittaPartenza = cittaPartenzaField.getText();
            String cittaDestinazione = cittaDestinazioneField.getText();
            String data = dataField.getText();

            cognomeField.setText("");
            nomeField.setText("");
            telefonoField.setText("");
            cittaPartenzaField.setText("");
            cittaDestinazioneField.setText("");
            dataField.setText("");

            if(conta == MAX_PRENOTAZIONI){
                JOptionPane.showMessageDialog(null, "Hai raggiunto il massimo numero di prenotazioni");
            }else {
                Prenotazione prenotazione = new Prenotazione(cognome, nome, telefono, cittaPartenza, cittaDestinazione, data);
                prenotazioneVet[conta] = prenotazione;
                conta++;
                JOptionPane.showMessageDialog(null, "Congratulazioni. La tua prenotazione è stata effettuata! ");
            }
        }
        if (e.getSource() == annulla){
            cognomeField.setText("");
            nomeField.setText("");
            telefonoField.setText("");
            cittaPartenzaField.setText("");
            cittaDestinazioneField.setText("");
            dataField.setText("");
            JOptionPane.showMessageDialog(null, "La prenotazione è stata annullata!");
        }
        if(e.getSource() == stampa){
            for (int i=0; i<MAX_PRENOTAZIONI; i++) {
                if(prenotazioneVet[i] == null){
                    i = MAX_PRENOTAZIONI;
                }
                else {
                    Prenotazione prenotazione = prenotazioneVet[i];
                    System.out.println(prenotazione.toString());
                }
            }
        }

        if(e.getSource() == salva){
            for(int i=0; i<MAX_PRENOTAZIONI; i++){
                if(prenotazioneVet[i] == null){
                    i = MAX_PRENOTAZIONI;
                }
                else {
                    Prenotazione prenotazioneCsv = prenotazioneVet[i];
                    prenotazioneCsv.salvaCsv();
                }
            }
        }

        if(e.getSource() == clear){
            prenotazioneVet = null;
            conta = 0;
        }
    }

    public static void main(String[] args) {
        FormPrenotazione formPrenotazione = new FormPrenotazione();
    }
}
