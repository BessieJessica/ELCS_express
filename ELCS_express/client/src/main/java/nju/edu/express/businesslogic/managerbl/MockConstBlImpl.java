package nju.edu.express.businesslogic.managerbl;

import nju.edu.express.PO.ConstPO;
import nju.edu.express.VO.ConstVO;
import nju.edu.express.managerdata.stub.ConstDataImpl_stub;

public class MockConstBlImpl extends ConstBlImpl{
	
	public ConstVO[] getConst(){
		ConstDataImpl_stub Const = new ConstDataImpl_stub();//向下调用桩程序
		ConstPO[] po = Const.getConstList();
		ConstVO[] vo = new ConstVO[3];
		vo[0] = new ConstVO(po[0].getId(), po[0].getPrice(), po[0].getDistance());
		vo[1] = new ConstVO(po[1].getId(), po[1].getPrice(), po[1].getDistance());
		vo[2] = new ConstVO(po[2].getId(), po[2].getPrice(), po[2].getDistance());
		
		return vo;
	}
}
