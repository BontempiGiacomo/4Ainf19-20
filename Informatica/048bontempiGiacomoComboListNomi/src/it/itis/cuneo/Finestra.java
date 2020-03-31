package it.itis.cuneo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Finestra extends JFrame implements ActionListener {

    JLabel cognomeLabel;
    JLabel nomeLabel;

    JTextField cognomeText;
    JTextField nomeText;

    JButton inserisci;

    JList listaNomi;
    DefaultListModel listaModel;
    DefaultComboBoxModel comboBoxModel;
    JComboBox jBox;

    int start=1;

    public Finestra(){
        setTitle("ComboListNomi");
        initComponets();
        pack();
        setLocation(700,320);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void initComponets(){
        start=1;

        setLayout(new FlowLayout());

        cognomeLabel = new JLabel("Cognome");
        this.add(cognomeLabel);

        cognomeText = new JTextField(15);
        this.add(cognomeText);

        nomeLabel = new JLabel("Nome");
        this.add(nomeLabel);

        nomeText = new JTextField(15);
        this.add(nomeText);

        inserisci = new JButton("Aggiungi");
        this.add(inserisci);

        listaNomi = new JList();
        this.add(listaNomi);

        listaModel = new DefaultListModel();
        listaModel.addElement("     Cognome + Nome     ");
        listaNomi = new JList(listaModel);
        JScrollPane jScrollPane1 = new JScrollPane(listaNomi);
        this.add(jScrollPane1);

        comboBoxModel = new DefaultComboBoxModel();
        comboBoxModel.addElement("      Cognome + Nome      ");
        jBox = new JComboBox(comboBoxModel);
        JScrollPane jScrollPane2 = new JScrollPane(jBox);
        this.add(jScrollPane2);

        inserisci.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inserisci){
            if (start == 1){
                listaModel.removeAllElements();
                comboBoxModel.removeAllElements();
                start = 0;
            }
            listaModel.addElement(cognomeText.getText() + nomeText.getText());
            comboBoxModel.addElement(cognomeText.getText() + nomeText.getText());
        }
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}
