package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplInterfaceAcheteur extends UnicastRemoteObject implements InterfaceAcheteur  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ImplInterfaceAcheteur() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void nouvelleSoumission(String desc, int prix)
			throws RemoteException {
		System.out.println("nouvelle Soumission : " + desc +" Pour " + prix + " Euro" );
		
	}

	public void objetVendu(int prixVendu) throws RemoteException {
		System.out.println("objetVendu");
		
	}

	public void nouveauPrixRencherissement(int newprice) throws RemoteException {
		System.out.println("nouveauPrixRencherissement");
	}

	public void test() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("hello client");
		
	}

}
