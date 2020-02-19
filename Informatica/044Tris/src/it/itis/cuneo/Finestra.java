package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    public Finestra(){
        setTitle("Tris");
        initComponets();
        setLocation(500, 300);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void initComponets(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,3));
        Container container = this.getContentPane();
        container.add(jPanel);

        button1 = new JButton("");
        button2 = new JButton("");
        button3 = new JButton("");
        button4 = new JButton("");
        button5 = new JButton("");
        button6 = new JButton("");
        button7 = new JButton("");
        button8 = new JButton("");
        button9 = new JButton("");

        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);
        jPanel.add(button5);
        jPanel.add(button6);
        jPanel.add(button7);
        jPanel.add(button8);
        jPanel.add(button9);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            button1.setText(toggle(button1.getText()));
        }
        if (e.getSource() == button2){
            button2.setText(toggle(button2.getText()));
        }
        if (e.getSource() == button3){
            button3.setText(toggle(button3.getText()));
        }
        if (e.getSource() == button4){
            button4.setText(toggle(button4.getText()));
        }
        if (e.getSource() == button5){
            button5.setText(toggle(button5.getText()));
        }
        if (e.getSource() == button6){
            button6.setText(toggle(button6.getText()));
        }
        if (e.getSource() == button7){
            button7.setText(toggle(button7.getText()));
        }
        if (e.getSource() == button8){
            button8.setText(toggle(button8.getText()));
        }
        if (e.getSource() == button9){
            button9.setText(toggle(button9.getText()));
        }
    }

    public String toggle(String testo){
        String finalStr = "";

        if (testo.equals("")){
            finalStr = "X";
        }
        else if (testo.equals("O")){
            finalStr = "X";
        }
        else if(testo.equals("X")){
            finalStr = "O";
        }
        return finalStr;
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}
