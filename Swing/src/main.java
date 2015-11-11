import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main {

	/**
	 * @param args
	 */
	static final String DEFAULT_HOST = "localhost";
	static final int DEFAULT_PORT = 3331;
	class Ecoute implements ActionListener 
	{ 
	 public void actionPerformed(ActionEvent e) { 
	 System.out.println("Done!"); 
	 this.notify(); // ne compile pas ! 
	 } 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = null;
		client=Client.makeClient(DEFAULT_HOST, DEFAULT_PORT);
		Fenetre a=new Fenetre(client);
		a.setVisible(true);
		a.setSize(300, 300);  
		Client.startClient(client);	
	}

}
