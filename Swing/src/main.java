import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main {

	/**
	 * @param args
	 */

	class Ecoute implements ActionListener 
	{ 
		public void actionPerformed(ActionEvent e) { 
			System.out.println("Done!"); 
			this.notify(); // ne compile pas ! 
		} 
	} 
	public static void main(String[] args) {

		//Trying
//		JFrame like=new JFrame();
//		like.setSize(500, 500);
//		JTabbedPane myTab=new JTabbedPane();
//		JPanel panel1 = new JPanel();
//		myTab.addTab("Good", panel1);
//		like.add(myTab);
//		JPanel panel2 = new JPanel();
//		myTab.addTab("Good", panel2);
//		like.add(myTab);
//		like.setVisible(true);
		

		////////////////////////////////////////
		// TODO Auto-generated method stub
		Client client = null;
		client=Client.makeClient();
		Fenetre a=new Fenetre(client);
		a.setVisible(true);
		a.setSize(300, 300);  
		Client.startClient(client);	


	}

}
