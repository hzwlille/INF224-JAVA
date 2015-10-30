import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Fenetre extends JFrame {
	
	JButton button1;
	JButton button2;
	JButton button3;
	
	public Fenetre(){
		//Déclaration des éléments dans la fenêtre principale
		JTextArea myText=new JTextArea("fsdqfdsqfdsqfsdq");
		myText.setColumns(25);
		myText.setRows(15);
		
		button1=new JButton("new line x");
		button2=new JButton("new line y");
		button3=new JButton("Exit");
		
		//Les conteneurs
		Panel panelText=new Panel();
		Panel panelButton=new Panel();
		panelText.add(myText);
		panelButton.add(button1);
		panelButton.add(button2);
		panelButton.add(button3);
		
		//Positionnement des conteneurs
		this.add(panelText, BorderLayout.CENTER);
		this.add(panelButton,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Bib Bip"); 
		pack(); // calcule la disposition spatiale 
		setVisible(true); 
		
	}
}
