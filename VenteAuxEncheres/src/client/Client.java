package client;

import java.rmi.Naming;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;

import server.Encherisseur;
import server.InterfaceServeurVente;


public class Client extends JFrame{
	
	public JButton sinscrire;
	

	public static void main(String[] argv) throws RemoteException {
		
		Encherisseur en = new Encherisseur("Yatta2","Dieye");
		InterfaceAcheteur ia = new ImplInterfaceAcheteur();
		
        try {

        	InterfaceServeurVente stub = (InterfaceServeurVente) Naming.lookup("rmi://127.0.0.1:9093/TestRMI");
      
        	new FenetreClient(stub);
//            boolean successSubscription = stub.inscriptionEncherisseur(en,ia);
        	
//            if(successSubscription)
//            	System.out.println("inscription success");
            
//            else
//            	System.out.println("Objets envoyés vides ou liste pleine !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
