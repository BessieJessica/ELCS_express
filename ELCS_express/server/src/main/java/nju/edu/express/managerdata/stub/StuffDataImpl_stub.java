package nju.edu.express.managerdata.stub;

import nju.edu.express.PO.StuffPO;
import nju.edu.express.managerdataservice.StuffDataService;

public class StuffDataImpl_stub implements StuffDataService{

	@Override
	public StuffPO[] getStuffList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StuffPO getStuff(String stuffID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertStuff(StuffPO po) {
//		System.out.println("添加人员"+po.getId()+"成功");
		
	}

	@Override
	public void deleteStuff(String stuffID) {
		// TODO Auto-generated method stub
		
	}
}
