package nju.edu.express.businesslogic.managerbl.stub;

import nju.edu.express.VO.DepartmentVO;
import nju.edu.express.managerblservice.DepartmentBlService;
import nju.edu.express.managerdataservice.DepartmentDataService;

public class DepartmentBlImpl_stub implements DepartmentBlService{

	DepartmentDataService department;
	
	public DepartmentVO[] getDepartmentList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDepartment(DepartmentVO vo) {
		// TODO Auto-generated method stub
		
	}

	public void delDepartment(String[] departmentID) {
		
//		department = new DepartmentDataImpl_stub();
//		department.deleteDepartment(departmentID);
	}

}
