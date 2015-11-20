package nju.edu.express.businesslogic.managerbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.DepartmentPO;
import nju.edu.express.VO.DepartmentVO;
import nju.edu.express.managerblservice.DepartmentBlService;
import nju.edu.express.managerdataservice.DepartmentDataService;

public class DepartmentBlImpl implements DepartmentBlService {

	DepartmentDataService departmentData;

	public DepartmentBlImpl() {

		try {
			departmentData = (DepartmentDataService) Naming
					.lookup("rmi://127.0.0.1:6600/DepartmentData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	DepartmentPO[] departmentPOList = null;
	DepartmentVO[] departmentVOList = null;

	@Override
	public DepartmentVO[] getDepartmentList() {

		try {
			departmentPOList = departmentData.getDepartmentList();
			departmentVOList = new DepartmentVO[departmentPOList.length];
			for (int i = 0; i < departmentVOList.length; i++) {
				departmentVOList[i] = transformP2V(departmentPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return departmentVOList;
	}

	@Override
	public boolean addDepartment(DepartmentVO vo) {

		try {
			return departmentData.insertDepartment(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delDepartment(String[] departmentID) {

		try {
			return departmentData.deleteDepartment(departmentID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private DepartmentVO transformP2V(DepartmentPO departmentPO) {
		// TODO Auto-generated method stub
		return null;
	}

	private DepartmentPO transformV2P(DepartmentVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
