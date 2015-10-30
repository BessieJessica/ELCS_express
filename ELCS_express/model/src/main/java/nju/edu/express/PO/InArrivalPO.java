package nju.edu.express.PO;


/**
 * 营业厅到达单——到达日期date、中转单编号dispatchID、出发地startID、货物到达状态state（损坏、完整、丢失）
 * @author asd
 *
 */

public class InArrivalPO {
	String ID;
	String date;
	String dispatchID;
	/**
	 * 出发地的编号
	 */
	String startID;
	int state;
	/**
	 * @param date
	 * @param dispatchID
	 * @param startID
	 * @param state
	 */
	public InArrivalPO(String date, String dispatchID, String startID,
			int state) {
		super();
		this.date = date;
		this.dispatchID = dispatchID;
		this.startID = startID;
		this.state = state;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDispatchID() {
		return dispatchID;
	}
	public void setDispatchID(String dispatchID) {
		this.dispatchID = dispatchID;
	}
	public String getStartID() {
		return startID;
	}
	public void setStartID(String startID) {
		this.startID = startID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * @param iD
	 */
	public InArrivalPO(String iD) {
		super();
		ID = iD;
	}
	public InArrivalPO(){
		
	}
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}
