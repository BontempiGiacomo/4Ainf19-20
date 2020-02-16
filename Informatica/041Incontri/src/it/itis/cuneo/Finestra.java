package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends JFrame implements ActionListener {

    JLabel teamLabel;
    JLabel opponentTeamLabel;
    JTextField teamText;
    JTextField opponentTeamText;
    JButton button;
    JLabel riga;

    public Finestra(){

        setTitle("Incontri tennis");
        initComponents();
        setLocation(600, 300);
        JPanel jPanel = new JPanel();
        Container container = this.getContentPane();
        container.add(jPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void initComponents(){
        this.setLayout(new FlowLayout());
        teamLabel = new JLabel("Casa");
        this.add(teamLabel);
        teamText = new JTextField(20);
        this.add(teamText);

        opponentTeamLabel = new JLabel("Trasferta");
        this.add(opponentTeamLabel);
        opponentTeamText = new JTextField(20);
        this.add(opponentTeamText);

        button = new JButton("Conferma");
        this.add(button);

        riga = new JLabel("Inserire le squadre", SwingConstants.CENTER);
        this.add(riga);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            riga.setText(teamText.getText() + " vs " + opponentTeamText.getText());
            riga = new JLabel("Inserire le squadre", SwingConstants.CENTER);
            this.add(riga);
        }
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}
