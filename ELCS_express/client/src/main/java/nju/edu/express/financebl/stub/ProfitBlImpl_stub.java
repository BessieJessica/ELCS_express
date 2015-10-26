package nju.edu.express.financebl.stub;

import nju.edu.express.PO.ProfitPO;
import nju.edu.express.VO.ProfitVO;
import nju.edu.express.financeblservice.ProfitBlService;
import nju.edu.express.financedata.stub.ProfitDataImpl_stub;
import nju.edu.express.financedataservice.ProfitDataService;

public class ProfitBlImpl_stub implements ProfitBlService{

	ProfitDataService profit;
	ProfitPO po;
	ProfitVO vo;
	@Override
	public ProfitVO getProfitChart() {
		profit = new ProfitDataImpl_stub();
		po = profit.getProfitChart();
		vo = new ProfitVO(po.getId());
		return vo;
	}

}
