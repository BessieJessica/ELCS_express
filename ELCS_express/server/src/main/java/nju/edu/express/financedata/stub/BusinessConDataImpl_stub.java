package nju.edu.express.financedata.stub;

import nju.edu.express.PO.BusinessConPO;
import nju.edu.express.financedataservice.BusinessConDataService;

public class BusinessConDataImpl_stub implements BusinessConDataService{

	BusinessConPO businessConPO;
	@Override
	public BusinessConPO getBusinessConChart() {
		businessConPO = new BusinessConPO("123");
		return businessConPO;
	}

	
}
