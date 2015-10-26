package nju.edu.express.businessbl.stub;

import nju.edu.express.PO.InTransPO;
import nju.edu.express.VO.InTransVO;
import nju.edu.express.businesserblservice.InTransBlService;
import nju.edu.express.businesserdata.stub.InTransDataImpl_stub;
import nju.edu.express.businesserdataservice.InTransDataService;

public class InTransBlImpl_stub implements InTransBlService {
	InTransDataService intrans;
	InTransPO[] intranspolist;
	InTransVO[] intransvolist;
	public InTransVO[] getInTransList(String businessID) {
		// TODO Auto-generated method stub
		intrans=new InTransDataImpl_stub();
		intranspolist=intrans.getInTransList(businessID);
		transform(intranspolist);
		return intransvolist;
	}

	public void transform(InTransPO[] intranspolist){
		String id=intranspolist[0].getID();
		intransvolist = new InTransVO[1];
		intransvolist[0]=new InTransVO();
		intransvolist[0].setID(id);
	}
	public InTransVO getInTrans(String inTransID) {
		// TODO Auto-generated method stub
		return null;
	}

}
