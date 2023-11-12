package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImp;
import rmiService.IConversion;

public class ConversionServer {
    public static void main(String[] args) {
    	try {
    		 // Création du registre RMI sur le port 1025
		LocateRegistry.createRegistry(1025);
		//Skeleton 
		 // Création d'une instance de ConversionImp (implémentation de l'interface IConversion)
		ConversionImp c1 = new ConversionImp();
		System.out.println(c1.toString());
		 // Enregistrement de l'objet ConversionImp avec le nom "rmi://localhost:1025/ConvObject"
		Naming.rebind("rmi://localhost:1025/ConvObject",c1);
		
}catch (Exception e) {
	e.printStackTrace();
}
}
}