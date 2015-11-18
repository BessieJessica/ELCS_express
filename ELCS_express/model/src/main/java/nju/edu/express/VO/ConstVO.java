package nju.edu.express.VO;

public class ConstVO {

	String id;
	double price;
	double distance;

	/**
	 * 
	 * @param id
	 * @param price
	 * @param distance
	 */
	public ConstVO(String id, double price, double distance) {
		super();
		this.id = id;
		this.price = price;
		this.distance = distance;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
