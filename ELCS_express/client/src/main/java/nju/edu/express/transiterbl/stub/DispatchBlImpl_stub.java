package nju.edu.express.transiterbl.stub;

import nju.edu.express.PO.DispatchPO;
import nju.edu.express.VO.DispatchVO;
import nju.edu.express.transiterblservice.DispatchBlService;
import nju.edu.express.transiterdata.stub.DispatchDataImpl_stub;
import nju.edu.express.transiterdataservice.DispatchDataService;

public class DispatchBlImpl_stub implements DispatchBlService {

	DispatchDataService dispatch;
	DispatchPO[] dispatchpolist;
	DispatchVO[] dispatchvolist;
	
	public DispatchVO[] getDispatchList(String transitID) {
		// TODO Auto-generated method stub
		dispatch=new DispatchDataImpl_stub();
		dispatchpolist=dispatch.getDispatchList(transitID);
		transform(dispatchpolist);
		return dispatchvolist;
	}

	public void transform(DispatchPO[] dispatchpolist){
		String id=dispatchpolist[0].getID();
		dispatchvolist=new DispatchVO[1];
		dispatchvolist[0]=new DispatchVO();
		dispatchvolist[0].setID(id);
	}
	public DispatchVO getDispatch(String dispatchID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDispatch(DispatchVO vo) {
		// TODO Auto-generated method stub

	}

}
