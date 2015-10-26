package nju.edu.express.PO;

public class SalaryPO {

	String id;
	String salary;
	
	public SalaryPO(String id, String salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
