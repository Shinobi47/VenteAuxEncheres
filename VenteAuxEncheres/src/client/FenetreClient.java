package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import server.Encherisseur;
import server.InterfaceServeurVente;

public class FenetreClient extends JFrame{
	
	private JButton sinscrire = new JButton("S'inscrire");
	private JLabel statut = new JLabel("Bienvenue à la vente aux enchères");
	private InterfaceServeurVente stub;
	
	private Encherisseur en = new Encherisseur("Yatta2","Dieye");
	private InterfaceAcheteur ia = new ImplInterfaceAcheteur();
	
	
	public FenetreClient(final InterfaceServeurVente stub) throws RemoteException{
		this.stub = stub;
		
		this.setTitle("Interface Client");
		this.setLocation(320, 130);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(550,270);
		this.getContentPane().setLayout(null);
		
		sinscrire.setBounds(140, 50, 110, 20);
		this.getContentPane().add(sinscrire);
		
		statut.setBounds(15, 200, 500, 20);
		this.getContentPane().add(statut);
		
		sinscrire.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
	            boolean successSubscription;
				try {
					
					successSubscription = stub.inscriptionEncherisseur(en,ia);
					
		            if(successSubscription)
		            	statut.setText("inscription success");
		            
		            
		            else
		            	statut.setText("Objets envoyés vides ou liste pleine !");
		            
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
				
			}
		});
		
		this.setVisible(true);
	}


	public void setStatut(String statut) {
		this.statut.setText(statut);
	}
	


}
