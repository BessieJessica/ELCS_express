package nju.edu.express.businesserdata.stub;

import nju.edu.express.PO.DistributePO;
import nju.edu.express.businesserdataservice.DistributeDataService;

public class DistributeDataImpl_stub implements DistributeDataService {
	
	DistributePO[] distributepolist;
	
	@Override
	public DistributePO[] getDistributeList(String bussinessID) {
		// TODO Auto-generated method stub
		distributepolist=new DistributePO[1];
		distributepolist[0]=new DistributePO("10000000");
		return distributepolist;
	}

	@Override
	public DistributePO getDistribute(String DistributeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertDistribute(DistributePO po) {
		// TODO Auto-generated method stub

	}

}
