package nju.edu.express.managerbl.stub;

import nju.edu.express.PO.StuffPO;
import nju.edu.express.VO.StuffVO;
import nju.edu.express.managerblservice.StuffBlService;
import nju.edu.express.managerdata.stub.StuffDataImpl_stub;
import nju.edu.express.managerdataservice.StuffDataService;

public class StuffBlImpl_stub implements StuffBlService{

	StuffDataService stuff;
	StuffPO stuffPO;
	
	public StuffVO[] getStuffList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addStuff(StuffVO vo) {
		stuffPO = new StuffPO(vo.getId());
		stuff = new StuffDataImpl_stub();
		stuff.insertStuff(stuffPO);
		
	}

	public void delStuff(String[] stuffID) {
		// TODO Auto-generated method stub
		
	}

}
