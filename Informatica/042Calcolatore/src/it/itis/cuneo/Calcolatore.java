package it.itis.cuneo;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatore extends JFrame implements ActionListener{

    JLabel fattore1Label;
    JTextField fattore1Text;
    JLabel fattore2Label;
    JTextField fattore2Text;
    JLabel risultatoT;
    JLabel risultato;
    JButton addButton;
    JButton minusButton;
    JButton multiplyButton;
    JButton divideButton;

    public Calcolatore(){
        setTitle("Calcolatore");
        initComponents();
        setLocation(600, 300);
        JPanel jPanel = new JPanel();
        Container container = new Container();
        container.add(jPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void initComponents(){
        this.setLayout(new FlowLayout());

        fattore1Label = new JLabel("Fattore 1: ");
        this.add(fattore1Label);
        fattore1Text = new JTextField(10);
        this.add(fattore1Text);

        fattore2Label = new JLabel("Fattore 2: ");
        this.add(fattore2Label);
        fattore2Text = new JTextField(10);
        this.add(fattore2Text);

        addButton = new JButton("+");
        this.add(addButton);
        minusButton = new JButton("-");
        this.add(minusButton);
        multiplyButton = new JButton("*");
        this.add(multiplyButton);
        divideButton = new JButton("/");
        this.add(divideButton);

        risultatoT = new JLabel("risultato: ");
        this.add(risultatoT);

        risultato = new JLabel("");
        this.add(risultato);

        addButton.addActionListener(this);
        minusButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton){
            double num1Add = Double.parseDouble(fattore1Text.getText());
            double num2Add = Double.parseDouble(fattore2Text.getText());
            risultato.setText(String.valueOf(num1Add + num2Add) + " ; ");
            risultato = new JLabel("");
            this.add(risultato);
        }
        if (e.getSource() == minusButton){
            double num1Min = Double.parseDouble(fattore1Text.getText());
            double num2Min = Double.parseDouble(fattore2Text.getText());
            risultato.setText(String.valueOf(num1Min-num2Min) + " ; ");
            risultato = new JLabel("");
            this.add(risultato);
        }
        if (e.getSource() == multiplyButton){
            double num1Molt = Double.parseDouble(fattore1Text.getText());
            double num2Molt = Double.parseDouble(fattore2Text.getText());
            risultato.setText(String.valueOf(num1Molt*num2Molt) + " ; ");
            risultato = new JLabel("");
            this.add(risultato);
        }
        if (e.getSource() == divideButton){
            double num1Div = Double.parseDouble(fattore1Text.getText());
            double num2Div = Double.parseDouble(fattore2Text.getText());
            risultato.setText(String.valueOf(num1Div/num2Div) + " ; ");
            risultato = new JLabel("");
            this.add(risultato);
        }
    }

    public static void main(String[] args) {
        Calcolatore calcolatore = new Calcolatore();
    }
}
