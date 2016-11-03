package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceAcheteur extends Remote{
	
	public void nouvelleSoumission(String desc, int prix) throws RemoteException;
	public void objetVendu(int prixVendu)throws RemoteException;
	public void nouveauPrixRencherissement(int newprice)throws RemoteException;
	
	

}