package nju.edu.express.managerbl.stub;

import nju.edu.express.VO.SalaryVO;
import nju.edu.express.managerblservice.SalaryBlService;
import nju.edu.express.managerdata.stub.SalaryDataImpl_stub;
import nju.edu.express.managerdataservice.SalaryDataService;

public class SalaryBlImpl_stub implements SalaryBlService{

	SalaryDataService salary;
	SalaryVO salaryVO;
	
	public SalaryVO[] getSalaryList() {
		// TODO Auto-generated method stub
		return null;
	}

	public SalaryVO getSalary(String salaryID) {
		salary = new SalaryDataImpl_stub();
		salaryVO = new SalaryVO(salary.getSalary(salaryID).getId(), 
				salary.getSalary(salaryID).getSalary());
		
		return salaryVO;
	}

	public void endSalary(SalaryVO vo) {
		// TODO Auto-generated method stub
		
	}

}
