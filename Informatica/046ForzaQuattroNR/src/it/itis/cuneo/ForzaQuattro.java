package it.itis.cuneo;

import sun.awt.image.GifImageDecoder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForzaQuattro extends JFrame implements ActionListener {

    private static final int ROSSO = 5;
    private static final int GIALLO = 1;
    private static final int MAX_CELLE= 6;
    private static final int MIN_CELLE= 0;
    private static int GIOCO= 0;
    int precedente = 0;
    private int[][] mat = new int[6][6];

    JButton pushButton1;
    JButton pushButton2;
    JButton pushButton3;
    JButton pushButton4;
    JButton pushButton5;
    JButton pushButton6;
    JButton computer;
    JButton player;
    JButton clear;

    JButton casellaBut1;
    JButton casellaBut2;
    JButton casellaBut3;
    JButton casellaBut4;
    JButton casellaBut5;
    JButton casellaBut6;
    JButton casellaBut7;
    JButton casellaBut8;
    JButton casellaBut9;
    JButton casellaBut10;
    JButton casellaBut11;
    JButton casellaBut12;
    JButton casellaBut13;
    JButton casellaBut14;
    JButton casellaBut15;
    JButton casellaBut16;
    JButton casellaBut17;
    JButton casellaBut18;
    JButton casellaBut19;
    JButton casellaBut20;
    JButton casellaBut21;
    JButton casellaBut22;
    JButton casellaBut23;
    JButton casellaBut24;
    JButton casellaBut25;
    JButton casellaBut26;
    JButton casellaBut27;
    JButton casellaBut28;
    JButton casellaBut29;
    JButton casellaBut30;
    JButton casellaBut31;
    JButton casellaBut32;
    JButton casellaBut33;
    JButton casellaBut34;
    JButton casellaBut35;
    JButton casellaBut36;

    JLabel risultato;


    public ForzaQuattro(){
        setTitle("Forza 4");
        initComponents();
        setLocation(500, 300);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void initComponents(){
        Container container = this.getContentPane();

        JPanel titoloPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(titoloPanel, BoxLayout.Y_AXIS);
        titoloPanel.setLayout(boxLayout);
        risultato = new JLabel("Scegliere la modalità di gioco");
        risultato.setAlignmentX(Component.CENTER_ALIGNMENT);
        player = new JButton("player vs player");
        player.setAlignmentX(Component.CENTER_ALIGNMENT);
        computer = new JButton("   player vs PC   ");
        computer.setAlignmentX(Component.CENTER_ALIGNMENT);

        titoloPanel.add(risultato);
        titoloPanel.add(player);
        titoloPanel.add(computer);


        container.add(titoloPanel, BorderLayout.NORTH);

        JPanel griglia = new JPanel();
        griglia.setLayout(new GridLayout(7,6));

        pushButton1 = new JButton(" ↓ ");
        pushButton2 = new JButton(" ↓ ");
        pushButton3 = new JButton(" ↓ ");
        pushButton4 = new JButton(" ↓ ");
        pushButton5 = new JButton(" ↓ ");
        pushButton6 = new JButton(" ↓ ");

        casellaBut1 = new JButton("1");
        casellaBut2 = new JButton("2");
        casellaBut3 = new JButton("3");
        casellaBut4 = new JButton("4");
        casellaBut5 = new JButton("5");
        casellaBut6 = new JButton("6");
        casellaBut7 = new JButton("7");
        casellaBut8 = new JButton("8");
        casellaBut9 = new JButton("9");
        casellaBut10 = new JButton("10");
        casellaBut11 = new JButton("11");
        casellaBut12 = new JButton("12");
        casellaBut13 = new JButton("13");
        casellaBut14 = new JButton("14");
        casellaBut15 = new JButton("15");
        casellaBut16 = new JButton("16");
        casellaBut17 = new JButton("17");
        casellaBut18 = new JButton("18");
        casellaBut19 = new JButton("19");
        casellaBut20 = new JButton("20");
        casellaBut21 = new JButton("21");
        casellaBut22 = new JButton("22");
        casellaBut23 = new JButton("23");
        casellaBut24 = new JButton("24");
        casellaBut25 = new JButton("25");
        casellaBut26 = new JButton("26");
        casellaBut27 = new JButton("27");
        casellaBut28 = new JButton("28");
        casellaBut29 = new JButton("29");
        casellaBut30 = new JButton("30");
        casellaBut31 = new JButton("31");
        casellaBut32 = new JButton("32");
        casellaBut33 = new JButton("33");
        casellaBut34 = new JButton("34");
        casellaBut35 = new JButton("35");
        casellaBut36 = new JButton("36");

        casellaBut1.setBackground(Color.WHITE);
        casellaBut2.setBackground(Color.WHITE);
        casellaBut3.setBackground(Color.WHITE);
        casellaBut4.setBackground(Color.WHITE);
        casellaBut5.setBackground(Color.WHITE);
        casellaBut6.setBackground(Color.WHITE);
        casellaBut7.setBackground(Color.WHITE);
        casellaBut8.setBackground(Color.WHITE);
        casellaBut9.setBackground(Color.WHITE);
        casellaBut10.setBackground(Color.WHITE);
        casellaBut11.setBackground(Color.WHITE);
        casellaBut12.setBackground(Color.WHITE);
        casellaBut13.setBackground(Color.WHITE);
        casellaBut14.setBackground(Color.WHITE);
        casellaBut15.setBackground(Color.WHITE);
        casellaBut16.setBackground(Color.WHITE);
        casellaBut17.setBackground(Color.WHITE);
        casellaBut18.setBackground(Color.WHITE);
        casellaBut19.setBackground(Color.WHITE);
        casellaBut20.setBackground(Color.WHITE);
        casellaBut21.setBackground(Color.WHITE);
        casellaBut22.setBackground(Color.WHITE);
        casellaBut23.setBackground(Color.WHITE);
        casellaBut24.setBackground(Color.WHITE);
        casellaBut25.setBackground(Color.WHITE);
        casellaBut26.setBackground(Color.WHITE);
        casellaBut27.setBackground(Color.WHITE);
        casellaBut28.setBackground(Color.WHITE);
        casellaBut29.setBackground(Color.WHITE);
        casellaBut30.setBackground(Color.WHITE);
        casellaBut31.setBackground(Color.WHITE);
        casellaBut32.setBackground(Color.WHITE);
        casellaBut33.setBackground(Color.WHITE);
        casellaBut34.setBackground(Color.WHITE);
        casellaBut35.setBackground(Color.WHITE);
        casellaBut36.setBackground(Color.WHITE);

        inizio();

        griglia.add(pushButton1);
        griglia.add(pushButton2);
        griglia.add(pushButton3);
        griglia.add(pushButton4);
        griglia.add(pushButton5);
        griglia.add(pushButton6);

        griglia.add(casellaBut1);
        griglia.add(casellaBut2);
        griglia.add(casellaBut3);
        griglia.add(casellaBut4);
        griglia.add(casellaBut5);
        griglia.add(casellaBut6);
        griglia.add(casellaBut7);
        griglia.add(casellaBut8);
        griglia.add(casellaBut9);
        griglia.add(casellaBut10);
        griglia.add(casellaBut11);
        griglia.add(casellaBut12);
        griglia.add(casellaBut13);
        griglia.add(casellaBut14);
        griglia.add(casellaBut15);
        griglia.add(casellaBut16);
        griglia.add(casellaBut17);
        griglia.add(casellaBut18);
        griglia.add(casellaBut19);
        griglia.add(casellaBut20);
        griglia.add(casellaBut21);
        griglia.add(casellaBut22);
        griglia.add(casellaBut23);
        griglia.add(casellaBut24);
        griglia.add(casellaBut25);
        griglia.add(casellaBut26);
        griglia.add(casellaBut27);
        griglia.add(casellaBut28);
        griglia.add(casellaBut29);
        griglia.add(casellaBut30);
        griglia.add(casellaBut31);
        griglia.add(casellaBut32);
        griglia.add(casellaBut33);
        griglia.add(casellaBut34);
        griglia.add(casellaBut35);
        griglia.add(casellaBut36);

        container.add(griglia, BorderLayout.CENTER);


        JPanel fondo = new JPanel();
        fondo.setLayout(new FlowLayout());

        clear = new JButton("Clear");
        clear.setAlignmentX(Component.CENTER_ALIGNMENT);
        fondo.add(clear);

        container.add(fondo, BorderLayout.AFTER_LAST_LINE);

        pushButton1.addActionListener(this);
        pushButton2.addActionListener(this);
        pushButton3.addActionListener(this);
        pushButton4.addActionListener(this);
        pushButton5.addActionListener(this);
        pushButton6.addActionListener(this);

        pushButton1.setEnabled(false);
        pushButton2.setEnabled(false);
        pushButton3.setEnabled(false);
        pushButton4.setEnabled(false);
        pushButton5.setEnabled(false);
        pushButton6.setEnabled(false);


        player.addActionListener(this);
        computer.addActionListener(this);

        clear.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*giocatore contro giocatore*/
        int k = 0;
        if (e.getSource() == player) {
            k=0;
            risultato.setText("Giocatore1: ROSSO - Giocatore2: GIALLO");
            player.setEnabled(false);
            computer.setEnabled(false);

            pushButton1.setEnabled(true);
            pushButton2.setEnabled(true);
            pushButton3.setEnabled(true);
            pushButton4.setEnabled(true);
            pushButton5.setEnabled(true);
            pushButton6.setEnabled(true);

            GIOCO = 1;
        }

        /*Computer contro giocatore*/
        if (e.getSource() == computer){
            k=0;
            risultato.setText("Giocatore1: ROSSO - PC: GIALLO");
            player.setEnabled(false);
            computer.setEnabled(false);

            pushButton1.setEnabled(true);
            pushButton2.setEnabled(true);
            pushButton3.setEnabled(true);
            pushButton4.setEnabled(true);
            pushButton5.setEnabled(true);
            pushButton6.setEnabled(true);

            GIOCO = -1;
        }

        if (e.getSource() == pushButton1) {
            k=1;
            int i = 5, j = 0;
            if(GIOCO == 1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut1, casellaBut7, casellaBut13, casellaBut19, casellaBut25, casellaBut31);
                }
                fineColonna(j, pushButton1);
                turno();
            }
            if(GIOCO == -1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut1, casellaBut7, casellaBut13, casellaBut19, casellaBut25, casellaBut31);
                }
                fineColonna(j, pushButton1);
                turno();
            }
        }
        if (e.getSource() == pushButton2) {
            k=1;
            int i = 5, j = 1;
            if(GIOCO == 1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut2, casellaBut8, casellaBut14, casellaBut20, casellaBut26, casellaBut32);
                }
                fineColonna(j, pushButton2);
                turno();
            }if(GIOCO == -1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut2, casellaBut8, casellaBut14, casellaBut20, casellaBut26, casellaBut32);
                }
                fineColonna(j, pushButton2);
                turno();
            }
        }
        if (e.getSource() == pushButton3) {
            k=1;
            int i = 5, j = 2;
            if(GIOCO == 1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut3, casellaBut9, casellaBut15, casellaBut21, casellaBut27, casellaBut33);
                }
                fineColonna(j, pushButton3);
                turno();
            }
            if(GIOCO == -1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut3, casellaBut9, casellaBut15, casellaBut21, casellaBut27, casellaBut33);
                }
                fineColonna(j, pushButton3);
                turno();
            }
        }
        if (e.getSource() == pushButton4) {
            k=1;
            int i = 5, j = 3;
            if(GIOCO == 1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut4, casellaBut10, casellaBut16, casellaBut22, casellaBut28, casellaBut34);
                }
                fineColonna(j, pushButton4);
                turno();
            }
            if(GIOCO == -1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut4, casellaBut10, casellaBut16, casellaBut22, casellaBut28, casellaBut34);
                }
                fineColonna(j, pushButton4);
                turno();
            }
        }
        if (e.getSource() == pushButton5) {
            k=1;
            int i = 5, j = 4;
            if (GIOCO == 1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut5, casellaBut11, casellaBut17, casellaBut23, casellaBut29, casellaBut35);
                }
                fineColonna(j, pushButton5);
                turno();
            }
            if (GIOCO == -1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut5, casellaBut11, casellaBut17, casellaBut23, casellaBut29, casellaBut35);
                }
                fineColonna(j, pushButton5);
                turno();
            }
        }
        if (e.getSource() == pushButton6) {
            k=1;
            int i = 5, j = 5;
            if(GIOCO == 1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut6, casellaBut12, casellaBut18, casellaBut24, casellaBut30, casellaBut36);
                }
                fineColonna(j, pushButton6);
                turno();
            }
            if(GIOCO == -1) {
                while (i > MIN_CELLE) {
                    i = setColore(i, j, casellaBut6, casellaBut12, casellaBut18, casellaBut24, casellaBut30, casellaBut36);
                }
                fineColonna(j, pushButton6);
                turno();
            }
        }

        /*Pulizia gioco*/
        if(e.getSource() == clear){

            pushButton1.setEnabled(false);
            pushButton2.setEnabled(false);
            pushButton3.setEnabled(false);
            pushButton4.setEnabled(false);
            pushButton5.setEnabled(false);
            pushButton6.setEnabled(false);
            player.setEnabled(true);
            computer.setEnabled(true);

            casellaBut1.setBackground(Color.WHITE);
            casellaBut2.setBackground(Color.WHITE);
            casellaBut3.setBackground(Color.WHITE);
            casellaBut4.setBackground(Color.WHITE);
            casellaBut5.setBackground(Color.WHITE);
            casellaBut6.setBackground(Color.WHITE);
            casellaBut7.setBackground(Color.WHITE);
            casellaBut8.setBackground(Color.WHITE);
            casellaBut9.setBackground(Color.WHITE);
            casellaBut10.setBackground(Color.WHITE);
            casellaBut11.setBackground(Color.WHITE);
            casellaBut12.setBackground(Color.WHITE);
            casellaBut13.setBackground(Color.WHITE);
            casellaBut14.setBackground(Color.WHITE);
            casellaBut15.setBackground(Color.WHITE);
            casellaBut16.setBackground(Color.WHITE);
            casellaBut17.setBackground(Color.WHITE);
            casellaBut18.setBackground(Color.WHITE);
            casellaBut19.setBackground(Color.WHITE);
            casellaBut20.setBackground(Color.WHITE);
            casellaBut21.setBackground(Color.WHITE);
            casellaBut22.setBackground(Color.WHITE);
            casellaBut23.setBackground(Color.WHITE);
            casellaBut24.setBackground(Color.WHITE);
            casellaBut25.setBackground(Color.WHITE);
            casellaBut26.setBackground(Color.WHITE);
            casellaBut27.setBackground(Color.WHITE);
            casellaBut28.setBackground(Color.WHITE);
            casellaBut29.setBackground(Color.WHITE);
            casellaBut30.setBackground(Color.WHITE);
            casellaBut31.setBackground(Color.WHITE);
            casellaBut32.setBackground(Color.WHITE);
            casellaBut33.setBackground(Color.WHITE);
            casellaBut34.setBackground(Color.WHITE);
            casellaBut35.setBackground(Color.WHITE);
            casellaBut36.setBackground(Color.WHITE);

            risultato.setText("Scegliere la modalità di gioco");
            for (int i=0; i<MAX_CELLE; i++){
                for (int j=0; j<MAX_CELLE; j++){
                    mat[i][j] = 0;
                }
            }
            clear.setText("Clear");
            precedente = 0;
            inizio();
            GIOCO =0;
            k=0;
        }

        if(GIOCO == -1) {
            if(precedente == GIALLO) {
                cellaComputer();
                turno();
            }
        }
        if(k==1) {
            conta();
        }
    }

    public void inizio(){
        int random;
        int max = 1;
        int min = 0;
        int range = (max - min)+1;
        random = (int) (Math.random()* range) + min;
        if(random==0){
            pushButton1.setBackground(Color.YELLOW);
            pushButton2.setBackground(Color.YELLOW);
            pushButton3.setBackground(Color.YELLOW);
            pushButton4.setBackground(Color.YELLOW);
            pushButton5.setBackground(Color.YELLOW);
            pushButton6.setBackground(Color.YELLOW);
            precedente = GIALLO;
        }
        else {
            pushButton1.setBackground(Color.RED);
            pushButton2.setBackground(Color.RED);
            pushButton3.setBackground(Color.RED);
            pushButton4.setBackground(Color.RED);
            pushButton5.setBackground(Color.RED);
            pushButton6.setBackground(Color.RED);
            precedente = ROSSO;
        }
    }

    public void turno(){
        if(precedente == GIALLO){
            pushButton1.setBackground(Color.RED);
            pushButton2.setBackground(Color.RED);
            pushButton3.setBackground(Color.RED);
            pushButton4.setBackground(Color.RED);
            pushButton5.setBackground(Color.RED);
            pushButton6.setBackground(Color.RED);
            precedente = ROSSO;
        }
        else {
            if(precedente == ROSSO){
                pushButton1.setBackground(Color.YELLOW);
                pushButton2.setBackground(Color.YELLOW);
                pushButton3.setBackground(Color.YELLOW);
                pushButton4.setBackground(Color.YELLOW);
                pushButton5.setBackground(Color.YELLOW);
                pushButton6.setBackground(Color.YELLOW);
                precedente = GIALLO;
            }
        }
    }

    public int setColore(int i, int j, JButton jButton0, JButton jButton1, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5){
        if(mat[i][j] == ROSSO || mat[i][j]==GIALLO){
            if(i != MIN_CELLE){
                i--;
                if (precedente == ROSSO && mat[i][j] == 0){
                    if(i == 0) {
                        colorButton(jButton0, ROSSO, i, j);
                        return -1;
                    }
                    else{
                        if(i == 1){
                            colorButton(jButton1, ROSSO, i, j);
                            return -1;
                        }else{
                            if(i == 2){
                                colorButton(jButton2, ROSSO, i, j);
                                return -1;
                            }else{
                                if(i == 3){
                                    colorButton(jButton3, ROSSO, i, j);
                                    return -1;
                                }else{
                                    if(i == 4){
                                        colorButton(jButton4, ROSSO, i, j);
                                        return -1;
                                    }
                                    else{
                                        if(i == 5){
                                            colorButton(jButton5, ROSSO, i, j);
                                            return -1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else{
                    if (precedente == GIALLO && mat[i][j] == 0){
                        if(i == 0) {
                            colorButton(jButton0, GIALLO, i, j);
                            return -1;
                        }else{
                            if(i == 1){
                                colorButton(jButton1, GIALLO, i, j);
                                return -1;
                            }else{
                                if(i == 2){
                                    colorButton(jButton2, GIALLO, i, j);
                                    return -1;
                                }else{
                                    if(i == 3){
                                        colorButton(jButton3, GIALLO, i, j);
                                        return -1;
                                    }else{
                                        if(i == 4){
                                            colorButton(jButton4, GIALLO, i, j);
                                            return -1;
                                        }
                                        else{
                                            if(i == 5){
                                                colorButton(jButton5, GIALLO, i, j);
                                                return -1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else {
            if (precedente == ROSSO) {
                if (i == 0) {
                    colorButton(jButton0, ROSSO, i, j);
                    return -1;
                } else {
                    if (i == 1) {
                        colorButton(jButton1, ROSSO, i, j);
                        return -1;
                    } else {
                        if (i == 2) {
                            colorButton(jButton2, ROSSO, i, j);
                            return -1;
                        } else {
                            if (i == 3) {
                                colorButton(jButton3, ROSSO, i, j);
                                return -1;
                            } else {
                                if (i == 4) {
                                    colorButton(jButton4, ROSSO, i, j);
                                    return -1;
                                } else {
                                    if (i == 5) {
                                        colorButton(jButton5, ROSSO, i, j);
                                        return -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }else{
                if (precedente == GIALLO){
                    if(i == 0) {
                        colorButton(jButton0, GIALLO, i, j);
                        return -1;
                    }
                    else{
                        if(i == 1){
                            colorButton(jButton1, GIALLO, i, j);
                            return -1;
                        }else{
                            if(i == 2){
                                colorButton(jButton2, GIALLO, i, j);
                                return -1;
                            }else{
                                if(i == 3){
                                    colorButton(jButton3, GIALLO, i, j);
                                    return -1;
                                }else{
                                    if(i == 4){
                                        colorButton(jButton4, GIALLO, i, j);
                                        return -1;
                                    }
                                    else{
                                        if(i == 5){
                                            colorButton(jButton5, GIALLO, i, j);
                                            return -1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public void colorButton(JButton jButton, int colore, int i, int j){
        if(colore == GIALLO){
            jButton.setBackground(Color.YELLOW);
            mat[i][j] = GIALLO;
        }
        else{
            if(colore == ROSSO){
                jButton.setBackground(Color.RED);
                mat[i][j] = ROSSO;
            }
        }
    }

    public void fineColonna( int j, JButton jButton){
          if (mat[0][j] != 0) {
              jButton.setEnabled(false);
          }
    }

    public void cellaComputer(){
        int i, j;
        int max = 5;
        int min = 0;
        int range = (max - min)+1;
        i = 5;
        j = (int) (Math.random()* range) + min;
        System.out.println("I" + i + "J" + j);
        while(i>MIN_CELLE){
            if(j==0) {
                i = setColore(i, j, casellaBut1, casellaBut7, casellaBut13, casellaBut19, casellaBut25, casellaBut31);
                fineColonna(j, pushButton1);
            }
            if(j==1) {
                i = setColore(i, j, casellaBut2, casellaBut8, casellaBut14, casellaBut20, casellaBut26, casellaBut32);
                fineColonna(j, pushButton2);
            }
            if(j==2) {
                i = setColore(i, j, casellaBut3, casellaBut9, casellaBut15, casellaBut21, casellaBut27, casellaBut33);
                fineColonna(j, pushButton3);
            }
            if(j==3) {
                i = setColore(i, j, casellaBut4, casellaBut10, casellaBut16, casellaBut22, casellaBut28, casellaBut34);
                fineColonna(j, pushButton4);
            }
            if(j==4) {
                i = setColore(i, j, casellaBut5, casellaBut11, casellaBut17, casellaBut23, casellaBut29, casellaBut35);
                fineColonna(j, pushButton5);
            }
            if(j==5) {
                i = setColore(i, j, casellaBut6, casellaBut12, casellaBut18, casellaBut24, casellaBut30, casellaBut36);
                fineColonna(j, pushButton6);
            }
            if(i != 0 && pushButton1.isEnabled()){
                j = (int) (Math.random()* range) + min;
            }
        }
    }

    public void conta(){
        int calcola;
        int r=0;
        int c=0;

        for(r=0; r<MAX_CELLE; r++){
            System.out.print("\n");
            for (c=0; c<MAX_CELLE; c++){
                System.out.print(mat[r][c]);
            }
        }
        System.out.print("\n");

        /*Conta riga 1*/
        calcola=0;
        r=0;
        for(c=0; c<MAX_CELLE; c++) {
            calcola = contaRiga(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta riga1 " + calcola);

        /*Conta riga 2*/
        calcola=0;
        r=1;
        for(c=0; c<MAX_CELLE; c++){
            calcola = contaRiga(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta riga2 " + calcola);

        /*Conta riga 3*/
        calcola=0;
        r=2;
        for(c=0; c<MAX_CELLE; c++){
            calcola = contaRiga(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta riga3 " + calcola);

        /*Conta riga 4*/
        calcola=0;
        r=3;
        for(c=0; c<MAX_CELLE; c++){
            calcola = contaRiga(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta riga4 " + calcola);

        /*Conta riga 5*/
        calcola=0;
        r=4;
            for(c=0; c<MAX_CELLE; c++){
                calcola = contaRiga(r, c, calcola);
                vincita(calcola);
            }
        System.out.println("conta riga5 " + calcola);

        /*Conta riga 6*/
        calcola=0;
        r=5;
            for(c=0; c<MAX_CELLE; c++){
                calcola = contaRiga(r, c, calcola);
                vincita(calcola);
        }
        System.out.println("conta riga6 " + calcola);

        /*Conta colonna 1*/
        calcola=0;
        c=0;
        for(r=0; r<MAX_CELLE; r++){
            calcola = contaColonna(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta colonna1 " + calcola);

        /*Conta colonna 2*/
        calcola=0;
        c=1;
            for(r=0; r<MAX_CELLE; r++){
                calcola = contaColonna(r, c, calcola);
                vincita(calcola);
            }
        System.out.println("conta colonna2 " + calcola);

        /*Conta colonna 3*/
        calcola=0;
        c=2;
            for(r=0; r<MAX_CELLE; r++){
                calcola = contaColonna(r, c, calcola);
                vincita(calcola);
            }
        System.out.println("conta colonna3 " + calcola);

        /*Conta colonna 4*/
        calcola=0;
        c=3;
            for(r=0; r<MAX_CELLE; r++){
                calcola = contaColonna(r, c, calcola);
                vincita(calcola);
            }
        System.out.println("conta colonna4 " + calcola);

        /*Conta colonna 5*/
        calcola=0;
        c=4;
            for(r=0; r<MAX_CELLE; r++){
                calcola = contaColonna(r, c, calcola);
                vincita(calcola);
            }
        System.out.println("conta colonna5 " + calcola);

        /*Conta colonna 6*/
        calcola=0;
        c=5;
            for(r=0; r<MAX_CELLE; r++){
                calcola = contaColonna(r, c, calcola);
                vincita(calcola);
            }
        System.out.println("conta colonna6 " + calcola);

        /*Conta diagonale principale sx->dx*/
        calcola=0;
            for(r=0; r<MAX_CELLE; r++){
                calcola = contaDiagonaleSxDx(r, calcola);
                vincita(calcola);
            }
        System.out.println("conta diagonale principale sx->dx " + calcola);

        /*Conta diagonale sx->dx*/
        calcola=0;
        for(r=0, c=1; c<MAX_CELLE; r++, c++){
            calcola = contaDiagonaleSxDxSec(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale sx->dx 0 1 " + calcola);

        /*Conta diagonale sx->dx*/
        calcola=0;
        for(r=0, c=2; c<MAX_CELLE; r++, c++){
            calcola = contaDiagonaleSxDxSec(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale sx->dx 0 2 " + calcola);

        /*Conta diagonale sx->dx*/
        calcola=0;
        for(r=1, c=0; r<MAX_CELLE; r++, c++){
            calcola = contaDiagonaleSxDxSec(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale sx->dx 1 0 " + calcola);

        /*Conta diagonale sx->dx*/
        calcola=0;
        for(r=2, c=0; r<MAX_CELLE; r++, c++){
            calcola = contaDiagonaleSxDxSec(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale sx->dx 2 0 " + calcola);

        /*Conta diagonale principale dx->sx*/
        calcola=0;
        for(r=0, c=5; r<MAX_CELLE; r++, c--){
            calcola = contaDiagonaleDxSx(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale pricipale dx->sx 0 5 " + calcola);

        /*Conta diagonale dx->sx*/
        calcola=0;
        for(r=0, c=3; c>=MIN_CELLE; r++, c--){
            calcola = contaDiagonaleDxSx(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale dx->sx 0 3 " + calcola);

        /*Conta diagonale dx->sx*/
        calcola=0;
        for(r=0, c=4; c>=MIN_CELLE; r++, c--){
            calcola = contaDiagonaleDxSx(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale dx->sx 0 4 " + calcola);

        /*Conta diagonale dx->sx*/
        calcola=0;
        for(r=1, c=5; r<MAX_CELLE; r++, c--){
            calcola = contaDiagonaleDxSx(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale dx->sx 1 5 " + calcola);

        /*Conta diagonale dx->sx*/
        calcola=0;
        for(r=2, c=5; r<MAX_CELLE; r++, c--){
            calcola = contaDiagonaleDxSx(r, c, calcola);
            vincita(calcola);
        }
        System.out.println("conta diagonale dx->sx 2 5 " + calcola);
    }

    public void vincita(int conta){
        if(conta == (ROSSO * 4)){
            risultato.setText("Ha vinto il giocatore 1");
        }
        else{
            if (conta == (GIALLO * 4)){
                risultato.setText("Ha vinto il giocatore 2");
            }
        }
        if(conta == (ROSSO * 4) || conta == (GIALLO * 4)){
            pushButton1.setEnabled(false);
            pushButton2.setEnabled(false);
            pushButton3.setEnabled(false);
            pushButton4.setEnabled(false);
            pushButton5.setEnabled(false);
            pushButton6.setEnabled(false);
            player.setEnabled(false);
            computer.setEnabled(false);
            clear.setText("Nuova partita");
        }
    }

    public int contaRiga(int r, int c, int conta){
        if(c==0){
            if (mat[r][c] == GIALLO){
                conta++;
            }else {
                if (mat[r][c] == ROSSO){
                    conta += 5;
                }
            }
        }
        else {
            if (mat[r][c] == GIALLO && mat[r][c-1] == 0) {
                conta = 0;
                conta++;
            }else {
                if (mat[r][c] == ROSSO && mat[r][c - 1] == 0) {
                    conta = 0;
                    conta += 5;
                } else {
                    if (mat[r][c] == GIALLO && mat[r][c - 1] == ROSSO) {
                        conta = 0;
                        conta++;
                    } else {
                        if (mat[r][c] == GIALLO && mat[r][c - 1] == GIALLO) {
                            conta++;
                        } else {
                            if (mat[r][c] == ROSSO && mat[r][c - 1] == GIALLO) {
                                conta = 0;
                                conta += 5;
                            } else {
                                if (mat[r][c] == ROSSO && mat[r][c - 1] == ROSSO) {
                                    conta += 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        return conta;
    }

    public int contaColonna(int r, int c, int conta){
        if(r==0){
            if (mat[r][c] == GIALLO){
                conta++;
            }else {
                if (mat[r][c] == ROSSO){
                    conta += 5;
                }
            }
        }
        else {
            if (mat[r][c] == GIALLO && mat[r-1][c] == 0) {
                conta = 0;
                conta++;
            }else {
                if (mat[r][c] == ROSSO && mat[r-1][c] == 0) {
                    conta = 0;
                    conta +=5;
                }else {
                    if (mat[r][c] == GIALLO && mat[r-1][c] == ROSSO) {
                        conta = 0;
                        conta++;
                    }else {
                        if (mat[r][c] == GIALLO && mat[r-1][c] == GIALLO) {
                            conta++;
                        }else {
                            if (mat[r][c] == ROSSO && mat[r-1][c] == GIALLO) {
                                conta = 0;
                                conta +=5;
                            }else {
                                if (mat[r][c] == ROSSO && mat[r - 1][c] == ROSSO) {
                                    conta += 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        return conta;
    }

    public int contaDiagonaleSxDx(int r, int conta){
        if(r==0){
            if (mat[r][r] == GIALLO){
                conta++;
            }else {
                if (mat[r][r] == ROSSO){
                    conta += 5;
                }
            }
        }
        else {
            if (mat[r][r] == GIALLO && mat[r-1][r-1] == 0) {
                conta = 0;
                conta++;
            } else {
                if (mat[r][r] == ROSSO && mat[r - 1][r - 1] == 0) {
                    conta = 0;
                    conta += 5;
                } else {
                    if (mat[r][r] == GIALLO && mat[r - 1][r - 1] == ROSSO) {
                        conta = 0;
                        conta++;
                    } else {
                        if (mat[r][r] == GIALLO && mat[r - 1][r - 1] == GIALLO) {
                            conta++;
                        } else {
                            if (mat[r][r] == ROSSO && mat[r - 1][r - 1] == GIALLO) {
                                conta = 0;
                                conta += 5;
                            } else {
                                if (mat[r][r] == ROSSO && mat[r - 1][r - 1] == ROSSO) {
                                    conta += 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        return conta;
    }

    public int contaDiagonaleSxDxSec(int r, int c, int conta){
        if(r==0 || c==0){
            if (mat[r][c] == GIALLO){
                conta++;
            }else {
                if (mat[r][c] == ROSSO){
                    conta += 5;
                }
            }
        }
        else {
                if (mat[r][c] == GIALLO && mat[r - 1][c - 1] == 0) {
                conta = 0;
                conta++;
            } else {
                if (mat[r][c] == ROSSO && mat[r - 1][c - 1] == 0) {
                    conta = 0;
                    conta += 5;
                } else {
                    if (mat[r][c] == GIALLO && mat[r - 1][c - 1] == ROSSO) {
                        conta = 0;
                        conta++;
                    } else {
                        if (mat[r][c] == GIALLO && mat[r - 1][c - 1] == GIALLO) {
                            conta++;
                        } else {
                            if (mat[r][c] == ROSSO && mat[r - 1][c - 1] == GIALLO) {
                                conta = 0;
                                conta += 5;
                            } else {
                                if (mat[r][c] == ROSSO && mat[r - 1][c - 1] == ROSSO) {
                                    conta += 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        return conta;
    }

    public int contaDiagonaleDxSx(int r, int c, int conta){
        if(r==0 || c==5){
            if (mat[r][c] == GIALLO){
                conta++;
            }else {
                if (mat[r][c] == ROSSO){
                    conta += 5;
                }
            }
        }
        else {
            if (mat[r][c] == GIALLO && mat[r-1][c+1] == 0) {
                conta = 0;
                conta ++;
            }else {
                if (mat[r][c] == ROSSO && mat[r-1][c+1] == 0) {
                    conta = 0;
                    conta += 5;
                } else {
                    if (mat[r][c] == GIALLO && mat[r - 1][c + 1] == ROSSO) {
                        conta = 0;
                        conta++;
                    } else {
                        if (mat[r][c] == GIALLO && mat[r - 1][c + 1] == GIALLO) {
                            conta++;
                        } else {
                            if (mat[r][c] == ROSSO && mat[r - 1][c + 1] == GIALLO) {
                                conta = 0;
                                conta += 5;
                            } else {
                                if (mat[r][c] == ROSSO && mat[r - 1][c + 1] == ROSSO) {
                                    conta += 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        return conta;
    }

    public static void main(String[] args) {
        ForzaQuattro forzaQuattro = new ForzaQuattro();
    }
}
