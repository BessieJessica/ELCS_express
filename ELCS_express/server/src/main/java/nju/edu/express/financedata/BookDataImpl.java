package nju.edu.express.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.BookPO;
import nju.edu.express.financedataservice.BookDataService;

public class BookDataImpl extends UnicastRemoteObject implements BookDataService {

	public BookDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public BookPO[] getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPO getBook(String bookID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(BookPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
