package nju.edu.express.managerdata.stub;

import nju.edu.express.PO.DepartmentPO;
import nju.edu.express.managerdataservice.DepartmentDataService;

public class DepartmentDataImpl_stub implements DepartmentDataService{

	@Override
	public DepartmentPO[] getDepartmentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertDepartment(DepartmentPO po) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDepartment(String[] departmentID) {
		for(int i=0;i<departmentID.length;i++){
			System.out.println("机构"+departmentID[i]+"删除成功");
		}
		
	}

}