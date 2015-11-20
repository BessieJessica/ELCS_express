package nju.edu.express.businesslogic.managerbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.SalaryPO;
import nju.edu.express.VO.SalaryVO;
import nju.edu.express.managerblservice.SalaryBlService;
import nju.edu.express.managerdataservice.SalaryDataService;

public class SalaryBlImpl implements SalaryBlService {

	SalaryDataService salaryData;

	public SalaryBlImpl() {
		try {
			salaryData = (SalaryDataService) Naming
					.lookup("rmi://127.0.0.1:6600/SalaryData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	SalaryVO[] salaryVOList = null;
	SalaryPO[] salaryPOList = null;

	public SalaryVO[] getSalaryList() {
		try {
			salaryPOList = salaryData.getSalaryList();
			salaryVOList = new SalaryVO[salaryPOList.length];
			for (int i = 0; i < salaryVOList.length; i++) {
				salaryVOList[i] = transformP2V(salaryPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return salaryVOList;
	}

	SalaryVO salaryVO = null;

	public SalaryVO getSalary(String salaryID) {

		try {
			salaryVO = transformP2V(salaryData.getSalary(salaryID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return salaryVO;
	}

	public boolean endSalary(SalaryVO vo) {

		try {
			return salaryData.updateSalary(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private SalaryPO transformV2P(SalaryVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	private SalaryVO transformP2V(SalaryPO salaryPO) {
		// TODO Auto-generated method stub
		return null;
	}
}
