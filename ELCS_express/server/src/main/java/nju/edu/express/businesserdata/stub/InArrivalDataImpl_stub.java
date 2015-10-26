package nju.edu.express.businesserdata.stub;

import nju.edu.express.PO.InArrivalPO;
import nju.edu.express.businesserdataservice.InArrivalDataService;

public class InArrivalDataImpl_stub implements InArrivalDataService {
	
	InArrivalPO[] inarrivalpolist;
	@Override
	public InArrivalPO[] getInArrivalList(String bussinessID) {
		// TODO Auto-generated method stub
		inarrivalpolist=new InArrivalPO[1];
		inarrivalpolist[0]=new InArrivalPO("10000");
		return inarrivalpolist;
	}

	@Override
	public InArrivalPO getInArrival(String InArrivalID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertInArrival(InArrivalPO po) {
		// TODO Auto-generated method stub

	}

}
