package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.InterfaceAcheteur;

public interface InterfaceServeurVente extends Remote{

	public boolean inscriptionEncherisseur(Encherisseur e1, InterfaceAcheteur ia)throws RemoteException;
	public void rencherir(int prix, Encherisseur whoBid)throws RemoteException; // pour savoir qui a enchérit de combien
	public void tempsEcoule(Encherisseur e1)throws RemoteException; // pour savoir pour qui le temps s'est écoulé

}
