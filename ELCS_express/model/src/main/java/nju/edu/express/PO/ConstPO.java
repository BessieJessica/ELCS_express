package nju.edu.express.PO;

/**
 * 常量：距离，价格
 * @author asd
 *
 */
public class ConstPO {
	
	String id;
	double price;
	double distance;

	/**
	 * @param price
	 * @param distance
	 */
	public ConstPO(double price, double distance) {
		super();
		this.price = price;
		this.distance = distance;
	}

	public ConstPO(){
		
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public ConstPO(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
