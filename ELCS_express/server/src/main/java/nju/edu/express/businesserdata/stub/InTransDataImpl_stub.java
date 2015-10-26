package nju.edu.express.businesserdata.stub;

import nju.edu.express.PO.InTransPO;
import nju.edu.express.businesserdataservice.InTransDataService;

public class InTransDataImpl_stub implements InTransDataService {
	InTransPO[] intranspolist;
	@Override
	public InTransPO[] getInTransList(String bussinessID) {
		// TODO Auto-generated method stub
		intranspolist=new InTransPO[1];
		intranspolist[0]=new InTransPO("1000000000");
		return intranspolist;
	}

	@Override
	public InTransPO getInTrans(String InTransID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertInTrans(InTransPO po) {
		// TODO Auto-generated method stub

	}

}
