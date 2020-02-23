package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Finestra extends JFrame implements ActionListener {

    public static final int X = 5;
    public static final int O = 1;
    public static final int MAX_CELLE = 3;
    public static final String  PATH_FILE= ".\\src\\SalvaMatrice\\salvaMatrice.txt";
    public static final String SEPARATOR = "-";
    String valorePrecedente = "";

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JLabel risultato;
    private int[][] mat = new int[3][3];

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
        jPanel.setLayout(new GridLayout(4,3));

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


        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new FlowLayout());

        risultato = new JLabel("X: Giocatore1 - O: Giocatore2");
        risultato.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel1.add(risultato);
        container.add(jPanel1, BorderLayout.NORTH);

        JPanel jPanel2 = new JPanel();
        BoxLayout centerPanelButton = new BoxLayout(jPanel2, BoxLayout.Y_AXIS);
        jPanel2.setLayout(centerPanelButton);

        button10 = new JButton("Clear");
        button10.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel2.add(button10);

        container.add(jPanel2, BorderLayout.SOUTH);


        button10.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i ,j;
        if (e.getSource() == button1){
            i=0;
            j=0;
            button1.setText(toggle(button1.getText(), i, j));
            button1.setEnabled(false);
            valorePrecedente = button1.getText();
        }
        if (e.getSource() == button2){
            i=0;
            j=1;
            button2.setText(toggle(button2.getText(), i, j));
            button2.setEnabled(false);
            valorePrecedente = button2.getText();
        }
        if (e.getSource() == button3){
            i=0;
            j=2;
            button3.setText(toggle(button3.getText(), i, j));
            button3.setEnabled(false);
            valorePrecedente = button3.getText();
        }
        if (e.getSource() == button4){
            i=1;
            j=0;
            button4.setText(toggle(button4.getText(), i, j));
            button4.setEnabled(false);
            valorePrecedente = button4.getText();
        }
        if (e.getSource() == button5){
            i=1;
            j=1;
            button5.setText(toggle(button5.getText(), i, j));
            button5.setEnabled(false);
            valorePrecedente = button5.getText();
        }
        if (e.getSource() == button6){
            i=1;
            j=2;
            button6.setText(toggle(button6.getText(), i, j));
            button6.setEnabled(false);
            valorePrecedente = button6.getText();
        }
        if (e.getSource() == button7){
            i=2;
            j=0;
            button7.setText(toggle(button7.getText(), i, j));
            button7.setEnabled(false);
            valorePrecedente = button7.getText();
        }
        if (e.getSource() == button8){
            i=2;
            j=1;
            button8.setText(toggle(button8.getText(), i, j));
            button8.setEnabled(false);
            valorePrecedente = button8.getText();
        }
        if (e.getSource() == button9){
            i=2;
            j=2;
            button9.setText(toggle(button9.getText(), i, j));
            button9.setEnabled(false);
            valorePrecedente = button9.getText();
        }
        if (e.getSource() == button10){
            button1.setText(clear(button10.getText()));
            button2.setText(clear(button10.getText()));
            button3.setText(clear(button10.getText()));
            button4.setText(clear(button10.getText()));
            button5.setText(clear(button10.getText()));
            button6.setText(clear(button10.getText()));
            button7.setText(clear(button10.getText()));
            button8.setText(clear(button10.getText()));
            button9.setText(clear(button10.getText()));
            button10.setText("Clear");

            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            risultato.setText("X: Giocatore1 - O: Giocatore2");
        }
        conta();
    }

    public String toggle(String testo, int i, int j){
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
        finalStr = controlla(i ,j);
        return finalStr;
    }

    public String clear(String string){
        String end="";
        if (string.equals("")){
            end = "";
        }
        else if (string.equals("O")){
            end = "";
        }
        else if(string.equals("X")){
            end = "";
        }
        for(int i=0; i<MAX_CELLE; i++){
            System.out.print("\n");
            for (int j=0; j<MAX_CELLE; j++){
                mat[i][j]=0;
            }
        }
        valorePrecedente = "";
        return end;
    }

    public void conta(){
        int conta;
        int j=0;
        int i=0;

        for(i=0; i<MAX_CELLE; i++){
            System.out.print("\n");
            for (j=0; j<MAX_CELLE; j++){
                System.out.print(mat[i][j]);
            }
        }
        System.out.print("\n");

        /*Conta riga 1*/
        conta=0;
        i=0;
        for(j=0; j<MAX_CELLE; j++){
            conta = conta + mat[i][j];
        }
        vincita(conta);
        System.out.println("conta riga1 " + conta);

        /*Conta riga 2*/
        conta=0;
        i=1;
        for(j=0; j<MAX_CELLE; j++){
            conta = conta + mat[i][j];
        }
        vincita(conta);
        System.out.println("conta riga2 " + conta);

        /*Conta riga 3*/
        conta=0;
        i=2;
        for(j=0; j<MAX_CELLE; j++){
            conta = conta + mat[i][j];
        }
        vincita(conta);
        System.out.println("conta riga3 " + conta);

        /*Conta colonna 1*/
        conta=0;
        j=0;
        for(i=0; i<MAX_CELLE; i++){
            conta = conta + mat[i][j];
        }
        vincita(conta);
        System.out.println("conta colonna1 " + conta);

        /*Conta colonna 2*/
        conta=0;
        j=1;
        for(i=0; i<MAX_CELLE; i++){
            conta = conta + mat[i][j];
        }
        vincita(conta);
        System.out.println("conta colonna2 " + conta);

        /*Conta colonna 3*/
        conta=0;
        j=2;
        for(i=0; i<MAX_CELLE; i++){
            conta = conta + mat[i][j];
        }
        vincita(conta);
        System.out.println("conta colonna3 " + conta);

        /*Conta diagonale sx->dx*/
        conta=0;
        for(i=0; i<MAX_CELLE; i++){
            conta = conta + mat[i][i];
        }
        vincita(conta);
        System.out.println("conta diagonale sx->dx " + conta);

        /*Conta diagonale dx->sx*/
        conta=0;
        i=0;
        j=2;
        for(i=0; i<MAX_CELLE; i++, j--){
            conta = conta + mat[i][j];
        }
        vincita(conta);
        System.out.println("conta diagonale sx->dx " + conta);
    }

    public String controlla(int i, int j){
        String str="";
        if(valorePrecedente.equalsIgnoreCase("")){
            mat[i][j] = X;
            str = "X";
        }
        else {
            if (valorePrecedente.equalsIgnoreCase("X")) {
                mat[i][j] = O;
                str = "O";
            }
            else {
                if (valorePrecedente.equalsIgnoreCase("O")) {
                    mat[i][j] = X;
                    str = "X";
                }
            }
        }
        return str;
    }

    public void vincita(int conta){
        if(conta == (X*3)){
            risultato.setText("Ha vinto il giocatore 1");
        }
        else{
            if (conta == (O*3)){
                risultato.setText("Ha vinto il giocatore 2");
            }
        }
        if(conta == (X*3) || conta == (O*3)){
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setText("Nuova partita");
            salvaMatr();
        }
    }

    public void salvaMatr(){
        BufferedWriter writer = null;
        try {
            File file = new File(PATH_FILE);
            writer = new BufferedWriter(new FileWriter(file));
            for (int i=0; i<MAX_CELLE; i++){
                writer.write("\n");
                for (int j=0; j<MAX_CELLE; j++){
                    writer.write(this.toRowFile(i, j));
                }
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

    public String toRowFile(int i, int j) {
        return String.valueOf(mat[i][j]);
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}