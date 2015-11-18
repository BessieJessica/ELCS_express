package nju.edu.express.businesslogic.businessbl.stub;

import nju.edu.express.PO.InArrivalPO;
import nju.edu.express.VO.InArrivalVO;
import nju.edu.express.businesserblservice.InArrivalBlService;
import nju.edu.express.businesserdata.stub.InArrivalDataImpl_stub;
import nju.edu.express.businesserdataservice.InArrivalDataService;

public class InArrivalBlImpl_stub implements InArrivalBlService {

	InArrivalDataService inarrival;
	InArrivalPO[] inarrivalpolist;
	InArrivalVO[] inarrivalvolist;
	
	public InArrivalVO[] getInArrivalList(String businessID) {
		inarrival=new InArrivalDataImpl_stub();
		inarrivalpolist=inarrival.getInArrivalList(businessID);
		transform(inarrivalpolist);
		return inarrivalvolist;
	}
	public void transform(InArrivalPO[] inarrivalpolist){
		String id=inarrivalpolist[0].getID();
		inarrivalvolist=new InArrivalVO[inarrivalpolist.length];
		inarrivalvolist[0]=new InArrivalVO();
		inarrivalvolist[0].setID(id);
	}
	public InArrivalVO getInArrival(String inArrivalID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addInArrival(InArrivalVO inArrivalVO) {
		// TODO Auto-generated method stub
		return false;
	}

}
