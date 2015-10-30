package nju.edu.express.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlImpl {
	
	Statement stmt;
	
	public MySqlImpl() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/elcs?"
				+ "user=root&password=19951102&useUnicode=true&characterEncoding=UTF8";
		Class.forName("com.mysql.jdbc.Driver");//动态加载MySQL驱动
		conn = DriverManager.getConnection(url);//获得elcs数据库的连接
		stmt = conn.createStatement();//获得陈述引用		
	}
	
	/**
	 * 数据库提取信息方法
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public ResultSet query(String sql) throws SQLException{
		ResultSet result = stmt.executeQuery(sql);
		return result;
	}
}
