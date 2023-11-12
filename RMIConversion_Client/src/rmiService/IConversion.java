package rmiService;
//Importation des classes nécessaires pour RMI et RemoteException
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote{
	// Déclaration d'une méthode distante pour convertir un montant monétaire
			// La méthode prend un paramètre double 'mt' représentant le montant à convertir
			// Lance une RemoteException pour gérer les problèmes de communication à distance
	public double convertirMontant(double mt) throws RemoteException;
    
}
