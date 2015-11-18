package nju.edu.express.businesslogic.transiterbl.stub;

import nju.edu.express.PO.OutArrivalPO;
import nju.edu.express.VO.OutArrivalVO;
import nju.edu.express.transiterblservice.OutArrivalBlService;
import nju.edu.express.transiterdata.stub.OutArrivalDataImpl_stub;
import nju.edu.express.transiterdataservice.OutArrivalDataService;

public class OutArrivalBlImpl_stub implements OutArrivalBlService {

	OutArrivalDataService outarrival;
	OutArrivalPO[] outarrivalpolist;
	OutArrivalVO[] outarrivalvolist;
	
	public OutArrivalVO[] getOutArrivalList(String trasitID) {
		// TODO Auto-generated method stub
		outarrival=new OutArrivalDataImpl_stub();
		outarrivalpolist=outarrival.getOutArrivalList(trasitID);
		transform();
		return outarrivalvolist;
	}

	public void transform(){
		String id=outarrivalpolist[0].getId();
		outarrivalvolist=new OutArrivalVO[1];
		outarrivalvolist[0]=new OutArrivalVO();
		outarrivalvolist[0].setID(id);
	}
	public OutArrivalVO getOutArrival(String outArrivalID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addOutArrival(OutArrivalVO vo) {
		// TODO Auto-generated method stub

	}

}
