package nju.edu.express.PO;

/**
 * 中转中心到达单——中转中心编号transistID（025城市编码+0中转中心）、到达日期date、中转单编号dispatchID、出发地startID、货物到达状态state（损坏、完整、丢失）
 * 
 */
public class OutArrivalPO {

	String id;
	String transistID;
	String date;
	String dispatchID;
	/**
	 * 出发地的编号
	 */
	String startID;
	int state;
	/**
	 * @param transistID
	 * @param date
	 * @param dispatchID
	 * @param startID
	 * @param state
	 */
	public OutArrivalPO(String transistID, String date, String dispatchID,
			String startID, int state) {
		super();
		this.transistID = transistID;
		this.date = date;
		this.dispatchID = dispatchID;
		this.startID = startID;
		this.state = state;
	}
	public String getTransistID() {
		return transistID;
	}
	public void setTransistID(String transistID) {
		this.transistID = transistID;
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
	 * @param id
	 */
	public OutArrivalPO(String id) {
		super();
		this.id = id;
	}
	public OutArrivalPO(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
