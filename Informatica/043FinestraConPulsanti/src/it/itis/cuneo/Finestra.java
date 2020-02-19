package it.itis.cuneo;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Finestra extends JFrame {

    public Finestra() {
        setTitle("FinestraConPulsanti");
        setLocation(500, 300);
        setSize(600, 600);
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void initComponents(){
        JPanel jPanel = new JPanel();
        Container container = this.getContentPane();
        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);

        JButton normalButton = new JButton("button");
        normalButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton shortButton = new JButton("short");
        shortButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton longButton = new JButton("long-long - long button");
        longButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        jPanel.add(normalButton);
        jPanel.add(shortButton);
        jPanel.add(longButton);

        JPanel jPanel2 = new JPanel();

        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");

        jPanel2.add(ok);
        jPanel2.add(cancel);
        container.add(jPanel);
        container.add(jPanel2, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}
