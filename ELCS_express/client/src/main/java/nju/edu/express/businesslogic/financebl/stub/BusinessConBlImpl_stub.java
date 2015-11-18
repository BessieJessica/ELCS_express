package nju.edu.express.businesslogic.financebl.stub;

import nju.edu.express.VO.BusinessConVO;
import nju.edu.express.financeblservice.BusinessConBlService;
import nju.edu.express.financedata.stub.BusinessConDataImpl_stub;
import nju.edu.express.financedataservice.BusinessConDataService;

public class BusinessConBlImpl_stub implements BusinessConBlService{

	BusinessConVO vo;
	BusinessConDataService business;
	@Override
	public BusinessConVO getBusinessConChart(String beginDate, String endDate) {
		business = new BusinessConDataImpl_stub();
		vo = new BusinessConVO(business.getBusinessConChart().getId());
		return vo;
	}

}
