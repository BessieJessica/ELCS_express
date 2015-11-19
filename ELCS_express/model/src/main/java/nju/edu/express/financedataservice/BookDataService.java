package nju.edu.express.financedataservice;

import nju.edu.express.PO.BookPO;

public interface BookDataService {

	/**
	 * 查找多个持久化对象
	 */
	public BookPO[] getBookList();
	
	/**
	 * 查找单个持久化对象
	 */
	public BookPO getBook(String bookID);
	
	/**
	 * 在数据库中插入BookPO
	 */
	public boolean insert(BookPO po);
}
