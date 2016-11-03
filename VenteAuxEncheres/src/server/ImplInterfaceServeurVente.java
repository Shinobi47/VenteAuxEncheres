package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import client.InterfaceAcheteur;



import server.InterfaceServeurVente;


public class ImplInterfaceServeurVente  extends UnicastRemoteObject implements InterfaceServeurVente{

	protected ImplInterfaceServeurVente() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// liste des enchérisseurs
	private static HashMap<Encherisseur,InterfaceAcheteur> listeEn = new HashMap<Encherisseur,InterfaceAcheteur>();
	private boolean filePleine = false;

	
	public static HashMap<Encherisseur, InterfaceAcheteur> getListeEn() {
		return listeEn;
	}

	public static void setListeEn(HashMap<Encherisseur, InterfaceAcheteur> listeEn) {
		ImplInterfaceServeurVente.listeEn = listeEn;
	}

	public void rencherir(int prix, Encherisseur whoBid) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	public void tempsEcoule(Encherisseur e1) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	// il faut synchroniser ici par ce que si on a 4 enchérisseurs enregistrés et si le 5eme et 6eme arrivent il faut enregistrer un seul
	public synchronized boolean inscriptionEncherisseur(Encherisseur e1, InterfaceAcheteur ia) 
			throws RemoteException {
		if(e1 !=null && ia != null && listeEn.size() < 2)
			listeEn.put(e1, ia);
		else {
			return false;
		}
		
		// l'affichage se fait au niveau du serveur psk le traitement se fait au serveur, si on veut afficher au niveau du client on retourne une liste
		System.out.println("Liste des encherisseurs  : \n"); 
		for (Map.Entry<Encherisseur,InterfaceAcheteur> en : listeEn.entrySet()) {
			
			System.out.println(en.getKey().getNom() + " " +en.getKey().getPrenom());
			
		}
		
			
		return true;
		
	}

}
