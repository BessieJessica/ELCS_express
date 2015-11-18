package nju.edu.express.managerdata.stub;

import nju.edu.express.PO.ConstPO;
import nju.edu.express.managerdataservice.ConstDataService;

public class ConstDataImpl_stub implements ConstDataService{

	@Override
	public ConstPO[] getConstList() {
		// TODO Auto-generated method stub
		ConstPO[] po = new ConstPO[3];
		po[0] = new ConstPO("0000", 30, 100);
		po[1] = new ConstPO("0001", 50, 200);
		po[2] = new ConstPO("0002", 100, 2500);
		return po;
	}

	@Override
	public boolean updateConst(ConstPO[] po) {
		// TODO Auto-generated method stub
		System.out.println("更新成功");
		return true;
	}
	

}
