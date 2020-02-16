import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Finestra extends  JFrame implements ActionListener {
	
	JLabel lCognome;
	JLabel lNome;
	JTextField tNome;
	JTextField tCognome;
	JButton bInvia;
	JLabel lCompleto;

	public Finestra()
	{
		setSize(800,600);
		setLocation(200, 200);
		setTitle("MyFirstFrame");
		initComponets();
		pack();
		JPanel myPanel = new JPanel();
		myPanel.setBackground(Color.BLUE);
		Container container = this.getContentPane();
		container.add(myPanel);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 }
	
	private void initComponets() {
		// TODO Auto-generated method stub
		this.setLayout(new FlowLayout());
		lCognome = new JLabel("cognome: ");
		this.add(lCognome);
		tCognome = new JTextField(20);
		this.add(tCognome);
		lNome = new JLabel("nome: ");
		this.add(lNome);
		tNome= new JTextField(20);
		this.add(tNome);
		bInvia= new JButton("Invia");
		this.add(bInvia);
		lCompleto = new JLabel("Cognome+Nome");
		this.add(lCompleto);
		bInvia.addActionListener(this);
	}
	
	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == bInvia)
		{
			lCompleto.setText(tCognome.getText()+" "+tNome.getText());
		}
	}
	
	public static void main(String[] args)
	{
		Finestra fs = new Finestra();
	}
}