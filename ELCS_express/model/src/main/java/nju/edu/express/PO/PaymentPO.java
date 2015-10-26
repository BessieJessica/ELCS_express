package nju.edu.express.PO;

public class PaymentPO {

	String id,cost;


	public PaymentPO(String id, String cost) {
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
