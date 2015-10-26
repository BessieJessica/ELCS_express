package nju.edu.express.transiterdata.stub;

import nju.edu.express.PO.OutArrivalPO;
import nju.edu.express.transiterdataservice.OutArrivalDataService;

public class OutArrivalDataImpl_stub implements OutArrivalDataService {

	OutArrivalPO[] outarrivalpolist;
	@Override
	public OutArrivalPO[] getOutArrivalList(String TransitID) {
		// TODO Auto-generated method stub
		outarrivalpolist=new OutArrivalPO[1];
		outarrivalpolist[0]=new OutArrivalPO("10928913");
		return outarrivalpolist;
	}

	@Override
	public OutArrivalPO getOutArrival(String OutArrivalID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOutArrival(OutArrivalPO po) {
		// TODO Auto-generated method stub

	}

}
