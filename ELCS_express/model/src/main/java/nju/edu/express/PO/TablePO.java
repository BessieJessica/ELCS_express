package nju.edu.express.PO;

import java.util.ArrayList;

public class TablePO {
	ArrayList<String> tableIDLsit;

	/**
	 * @param tableIDLsit
	 */
	public TablePO(ArrayList<String> tableIDLsit) {
		super();
		this.tableIDLsit = tableIDLsit;
	}
	public TablePO(){
		
	}
	public ArrayList<String> getTableIDLsit() {
		return tableIDLsit;
	}

	public void setTableIDLsit(ArrayList<String> tableIDLsit) {
		this.tableIDLsit = tableIDLsit;
	}
	
}
