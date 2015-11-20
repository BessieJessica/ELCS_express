package nju.edu.express.managerdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.SalaryPO;

public interface SalaryDataService extends Remote{

	/**
	 * 获得工资列表
	 */
	public SalaryPO[] getSalaryList()throws RemoteException;
	
	/**
	 * 根据职位获得具体工资信息
	 */
	public SalaryPO getSalary(String positionID)throws RemoteException;
	
	/**
	 * 更新SalaryPO
	 */
	public boolean updateSalary(SalaryPO po)throws RemoteException;
	
}
