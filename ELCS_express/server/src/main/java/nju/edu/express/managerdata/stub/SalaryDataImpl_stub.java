package nju.edu.express.managerdata.stub;

import nju.edu.express.PO.SalaryPO;
import nju.edu.express.managerdataservice.SalaryDataService;

public class SalaryDataImpl_stub implements SalaryDataService {

	SalaryPO salaryPO;
	@Override
	public SalaryPO[] getSalaryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalaryPO getSalary(String positionID) {
		salaryPO = new SalaryPO("10000", "每月10000元");
		return salaryPO;
	}

	@Override
	public void updateSalary(SalaryPO po) {
		// TODO Auto-generated method stub

	}

}
