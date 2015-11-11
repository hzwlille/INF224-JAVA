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
		String host = DEFAULT_HOST;
	    int port = DEFAULT_PORT;   
	    
	    try {
	      client = new Client(host, port);
	    }
	    catch (Exception e) {
	      System.err.println("Client: Couldn't connect to "+host+":"+port);
	      System.exit(1);
	    }
	    System.out.println("Client connected to "+host+":"+port);
		Fenetre a=new Fenetre(client);
		a.setVisible(true);
		a.setSize(300, 300);  
		client.newClient(client);	
	}

}
