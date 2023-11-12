package RMIclient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient {
     public static void main(String[] args) {
    	 try {
    		 // Recherche de l'objet distant en utilisant le nom "rmi://localhost:1025/ConvObject"
    	 IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1025/ConvObject");
    	 // Appel de la méthode distante convertirMontant avec un montant de 1234
    		  System.out.println (stub.convertirMontant(1234));
    		  // Appel de la méthode distante convertirMontant avec un montant de 700
    		  System.out.println(stub.convertirMontant(700));
    	 
    		  } catch (Exception e) { 
    			  e.printStackTrace();
    		  }
	}
}
