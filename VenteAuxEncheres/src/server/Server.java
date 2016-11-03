package server;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;

import client.InterfaceAcheteur;

public class Server {

	
	
	public static void main(String[] argv) {
        try {
        	
        	// 6969 est le port sur lequel sera publiÃ© le service. Nous devons le prÃ©ciser Ã  la fois sur le registry et Ã  la fois Ã  la crÃ©ation du stub.


//            InterfaceServeurVente skeleton = (InterfaceServeurVente) UnicastRemoteObject.exportObject(new ImplInterfaceServeurVente(), 9012); // GÃ©nÃ¨re un stub vers notre service.
//            Registry registry = LocateRegistry.createRegistry(9012);
//            System.out.println("crÃ©ation du registre effectuÃ©e");
//            registry.rebind("remote", skeleton); // publie notre instance sous le nom "remote"
//            System.out.println("bind success");
            
        	
            ImplInterfaceServeurVente iisv = new ImplInterfaceServeurVente();
            String url = "rmi://127.0.0.1:9093/TestRMI";
            LocateRegistry.createRegistry(9093);
            System.out.println("Enregistrement de l'objet avec l'url : " + url);
            Naming.rebind(url, iisv);

            System.out.println("Serveur lancé");
            
            
            
            // complétude de la liste des enchérisseurs
            while(true){

            	System.out.println("i");
            	if(ImplInterfaceServeurVente.getListeEn().size() > 1){
            	
            		for(Map.Entry<Encherisseur,InterfaceAcheteur> en : ImplInterfaceServeurVente.getListeEn().entrySet()){
            			en.getValue().nouvelleSoumission("objet 1", 20);
            			System.out.println("nouvelle soumission lancée pour : " + en.getKey().getNom());
            		}
            		
            		// début des enchères
            		while(true){		
            			
            		}
            		
            		
            	}
            	
            	
            	try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            }
            
            
            
            
          } catch (RemoteException e) {
            e.printStackTrace();
          } catch (MalformedURLException e) {
            e.printStackTrace();
          }
            
            
            
            
            
//        	if(ImplInterfaceServeurVente.getEncherisseurs().size()>5){
//        		ImplInterfaceServeurVente.setFilePleine(true);
//                while(true){               		            	
//                	
//                }
//        	}            
            

    }
	
}
