import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;


public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton button1;
	JButton button2;
	JButton button3;
	JTextArea myText;
	JMenuBar myMenuBar;
	JMenu myMenu1;
	JMenu myMenu2;
	JMenu myMenu3;
	Client m_client;
	//JToolBar myToolBar;



	public Fenetre(Client client){
		//Déclaration des éléments dans la fenêtre principale
		m_client=client;
		myText=new JTextArea();
		myText.setColumns(25);
		myText.setRows(15);

		Action1 action1=new Action1("Ouvrir une nouvelle base de multimédias");
		Action2 action2=new Action2("Sauvegarder la base courante");
		Action3 action3=new Action3("Exit");
		
		Action4 action4=new Action4("Find");
		Action5 action5=new Action5("Affich");
		Action6 action6=new Action6("Play");
		
		Action7 action7=new Action7("Help");
		
		button1=new JButton();
		button2=new JButton();
		button3=new JButton();
		myMenu1=new JMenu("File");
		myMenu2=new JMenu("Multimedia");
		myMenu3=new JMenu("Help");
		myMenuBar=new JMenuBar();
		myMenuBar.add(myMenu1);
		myMenuBar.add(myMenu2);
		myMenuBar.add(myMenu3);
		

		
		//myToolBar=new JToolBar("Tool Bar");
		//myToolBar.add(button1);
		//Les conteneurs

		JPanel panelText=new JPanel();
		JScrollPane scrollPaneText=new JScrollPane(panelText);
		JPanel panelButton=new JPanel();
		panelText.add(myText);
		panelButton.add(button1);
		panelButton.add(button2);
		panelButton.add(button3);


		//Positionnement des conteneurs
		this.add(panelText, BorderLayout.CENTER);
		this.add(panelButton,BorderLayout.SOUTH);
		this.setJMenuBar(myMenuBar);
		//this.add(myToolBar);
		
		//Ajouter des actions pour les boutons et menus
		button1.setAction(action1);
		button2.setAction(action2);
		button3.setAction(action3);
		
		myMenu1.add(action1);
		myMenu1.add(action2);
		myMenu1.add(action3);

		myMenu2.add(action4);
		myMenu2.add(action5);
		myMenu2.add(action6);
		
		myMenu3.add(action7);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Bib Bip"); 
		pack(); 												// calcule la disposition spatiale 
		setVisible(true); 
		
		
	

	}

	
	
	
	//Les actions à effectuer
	private class Action1 extends AbstractAction{

		public Action1(String text){
			super(text);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			myText.append("*******************\n");

		}


	}
	private class Action2 extends AbstractAction{

		public Action2(String text){
			super(text);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			myText.append("++++++++++++++++++++\n");
		}


	}
	private class Action3 extends AbstractAction{

		public Action3(String text){
			super(text);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(1);
		}


	}
	private class Action4 extends AbstractAction{

		public Action4(String text){
			super(text);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			m_client.boutonSend("Find");
		}


	}private class Action5 extends AbstractAction{

		public Action5(String text){
			super(text);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			m_client.boutonSend("Affiche");
		}


	}private class Action6 extends AbstractAction{

		public Action6(String text){
			super(text);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			m_client.boutonSend("Play");
		}


	}
	
	private class Action7 extends AbstractAction{

		public Action7(String text){
			super(text);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String message= "Cette telecommande est developpee par Zhongwei HU, Telecom Paristech, 2015 Copyright";
			String message1="good";
			JOptionPane.showMessageDialog(new JFrame(),message);
		}


	}
	


}
