package nju.edu.express.VO;

public class PaymentVO {

	String id,cost;
	public PaymentVO(String id, String cost) {
		super();
		this.id = id;
		this.cost = cost;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
