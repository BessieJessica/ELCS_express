package nju.edu.express.managerbl.stub;

import nju.edu.express.PO.ConstPO;
import nju.edu.express.VO.ConstVO;
import nju.edu.express.managerblservice.ConstBlService;
import nju.edu.express.managerdata.stub.ConstDataImpl_stub;
import nju.edu.express.managerdataservice.ConstDataService;

public class ConstBlImpl_stub implements ConstBlService{

	ConstDataService Const;
	ConstPO[] constPO;
	
	public ConstVO[] getConstList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void endConst(ConstVO[] vo) {
		Const = new ConstDataImpl_stub();
		constPO = new ConstPO[vo.length];
		for(int i=0;i<vo.length;i++){
			constPO[i] = new ConstPO(vo[i].getId());
		}
		Const.updateConst(constPO);
		
	}

}