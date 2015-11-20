package nju.edu.express.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.BookPO;

public interface BookDataService extends Remote{

	/**
	 * 查找多个持久化对象
	 */
	public BookPO[] getBookList()throws RemoteException;
	
	/**
	 * 查找单个持久化对象
	 */
	public BookPO getBook(String bookID)throws RemoteException;
	
	/**
	 * 在数据库中插入BookPO
	 */
	public boolean insert(BookPO po)throws RemoteException;
}
