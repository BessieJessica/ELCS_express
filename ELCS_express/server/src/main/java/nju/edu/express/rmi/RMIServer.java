package nju.edu.express.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import nju.edu.express.admindata.UserDataImpl;
import nju.edu.express.admindataservice.UserDataService;
import nju.edu.express.logisticsdata.LogisticsDataImpl;
import nju.edu.express.logisticsdataservice.LogisticsDataService;

public class RMIServer {

	static final int port = 6600;
	static final String host = "rmi://127.0.0.1:"+port+"/";
	
	public static void main(String[] args){
		try {
			LocateRegistry.createRegistry(port);
			
			LogisticsDataService logistics = new LogisticsDataImpl();
			Naming.rebind(host+"LogisticsService",logistics);

			UserDataService userData = new UserDataImpl();
			Naming.rebind(host+"UserService",userData);
			
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
