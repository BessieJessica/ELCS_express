package nju.edu.express.managerdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.DepartmentPO;

public interface DepartmentDataService extends Remote{

	/**
	 * 获得机构列表
	 */
	public DepartmentPO[] getDepartmentList()throws RemoteException;
	
	/**
	 * 在数据库中插入DepartmentPO对象
	 */
	public boolean insertDepartment(DepartmentPO po)throws RemoteException;
	
	/**
	 * 在数据库中删除DepartmentPO对象
	 */
	public boolean deleteDepartment(String[] departmentID)throws RemoteException;
	
}
