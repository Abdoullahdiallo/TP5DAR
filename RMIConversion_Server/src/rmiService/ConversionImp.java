package rmiService;
//Importation de la classe RemoteException et de la classe UnicastRemoteObject pour RMI
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImp extends UnicastRemoteObject implements IConversion{
	// Constructeur par défaut de la classe ConversionImp
public ConversionImp() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
//Implémentation de la méthode convertirMontant de l'interface IConversion

public double convertirMontant(double mt) throws RemoteException {
	// Conversion du montant en multipliant par 3.33
		return mt*3.33;
	
}


}
