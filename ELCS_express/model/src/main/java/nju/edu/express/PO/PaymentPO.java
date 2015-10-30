package nju.edu.express.PO;
/**
 * 付款单－包含：付款日期date、付款金额number、付款人payMan、付款账号payID、条目kind（租金（按年收）运费（按次计算）人员工资（按月统计）奖励（一次性）），备注note（租金年份、运单号、标注工资月份）。
其中（快递员提成、司机计次、业务员月薪）
 * 
 *
 */
public class PaymentPO {

	String id;
	String number;
	String date;
	/**
	 * 付款人
	 */
	String payMan;
	String payID;
	/**
	 * 条目（租金（按年收）运费（按次计算）人员工资（按月统计）奖励（一次性））
	 */
	int kind;
	String note;

	/**
	 * @param number
	 * @param date
	 * @param payMan
	 * @param payID
	 * @param kind
	 * @param note
	 */
	public PaymentPO(String number, String date, String payMan, String payID,
			int kind, String note) {
		super();
		this.number = number;
		this.date = date;
		this.payMan = payMan;
		this.payID = payID;
		this.kind = kind;
		this.note = note;
	}
	
	public PaymentPO(){
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPayMan() {
		return payMan;
	}

	public void setPayMan(String payMan) {
		this.payMan = payMan;
	}

	public String getPayID() {
		return payID;
	}

	public void setPayID(String payID) {
		this.payID = payID;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public PaymentPO(String id, String cost) {
		super();
		this.id = id;
		this.number = cost;
	}

	public String getCost() {
		return number;
	}

	public void setCost(String cost) {
		this.number = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
