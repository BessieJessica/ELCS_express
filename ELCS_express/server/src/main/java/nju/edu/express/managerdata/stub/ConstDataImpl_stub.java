package nju.edu.express.managerdata.stub;

import nju.edu.express.PO.ConstPO;
import nju.edu.express.managerdataservice.ConstDataService;

public class ConstDataImpl_stub implements ConstDataService {

	@Override
	public ConstPO[] getConstList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateConst(ConstPO[] po) {
		for(int i=0;i<po.length;i++){
			System.out.println(po[i].getId()+"已更新");
		}

	}

}
