package nju.edu.express.financeblservice;

import nju.edu.express.VO.BookVO;

public interface BookBlService {

	/**
	 * 查看公司账户列表
	 */
	public BookVO[] getBookList();
	
	/**
	 * 根据bookID来查看公司账户信息
	 */
	public BookVO getBook(String bookID);
	
	/**
	 * 新增公司账户
	 */
	public void addBook(BookVO vo);
}
