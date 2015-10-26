package nju.edu.express.financedata.stub;

import nju.edu.express.PO.ProfitPO;
import nju.edu.express.financedataservice.ProfitDataService;

public class ProfitDataImpl_stub implements ProfitDataService {
	ProfitPO po;
	@Override
	public ProfitPO getProfitChart() {
		po = new ProfitPO("100");
		return po;
	}

}
