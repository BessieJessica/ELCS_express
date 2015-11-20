package nju.edu.express.businesslogic.financebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.BookPO;
import nju.edu.express.VO.BookVO;
import nju.edu.express.financeblservice.BookBlService;
import nju.edu.express.financedataservice.BookDataService;

public class BookBlImpl implements BookBlService {

	BookDataService bookData;

	public BookBlImpl() {

		try {
			bookData = (BookDataService) Naming
					.lookup("rmi://127.0.0.1:6600/BookData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	BookPO[] bookPOList = null;
	BookVO[] bookVOList = null;

	@Override
	public BookVO[] getBookList() {

		try {
			bookPOList = bookData.getBookList();
			bookVOList = new BookVO[bookPOList.length];
			for (int i = 0; i < bookVOList.length; i++) {
				bookVOList[i] = transformP2V(bookPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return bookVOList;
	}

	BookVO bookVO = null;

	@Override
	public BookVO getBook(String bookID) {

		try {
			bookVO = transformP2V(bookData.getBook(bookID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return bookVO;
	}

	@Override
	public boolean addBook(BookVO vo) {

		try {
			return bookData.insert(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private BookPO transformV2P(BookVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	private BookVO transformP2V(BookPO bookPO) {
		// TODO Auto-generated method stub
		return null;
	}
}
