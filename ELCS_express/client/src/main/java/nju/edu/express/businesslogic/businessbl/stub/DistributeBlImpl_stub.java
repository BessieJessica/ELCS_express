package nju.edu.express.businesslogic.businessbl.stub;

import nju.edu.express.PO.DistributePO;
import nju.edu.express.VO.DistributeVO;
import nju.edu.express.businesserblservice.DistributeBlService;
import nju.edu.express.businesserdata.stub.DistributeDataImpl_stub;
import nju.edu.express.businesserdataservice.DistributeDataService;

public class DistributeBlImpl_stub implements DistributeBlService {

	DistributeDataService distribute;
	DistributePO[] distributepolist;
	DistributeVO[] distributevolist;
	
	public DistributeVO[] getDistributeList(String businessID) {
		// TODO Auto-generated method stub
		distribute=new DistributeDataImpl_stub();
		distributepolist=distribute.getDistributeList(businessID);
		transform(distributepolist);
		return distributevolist;
	}
	
	public void transform(DistributePO[] distributepolist){
		String id=distributepolist[0].getID();
		distributevolist=new DistributeVO[distributepolist.length];
		distributevolist[0]=new DistributeVO();
		distributevolist[0].setID(id);
	}
	public DistributeVO getDistribute(String distributeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addDistribute(DistributeVO distributeVO) {
		// TODO Auto-generated method stub
		return false;
	}

}
