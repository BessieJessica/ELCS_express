package nju.edu.express.transiterdata.stub;

import nju.edu.express.PO.DispatchPO;
import nju.edu.express.transiterdataservice.DispatchDataService;

public class DispatchDataImpl_stub implements DispatchDataService {
	
	DispatchPO[] dispatchpolist;
	@Override
	public DispatchPO[] getDispatchList(String TransitID) {
		// TODO Auto-generated method stub
		dispatchpolist=new DispatchPO[1];
		dispatchpolist[0]=new DispatchPO("10000000000101");
		
		return dispatchpolist;
	}

	@Override
	public DispatchPO getDispatch(String DispatchID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertDispatch(DispatchPO po) {
		// TODO Auto-generated method stub

	}

}
