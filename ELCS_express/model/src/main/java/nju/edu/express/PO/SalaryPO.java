package nju.edu.express.PO;
/**
 * 工资——职务job，薪水策略salarykind（按月、计次、提成），薪水额度salarynum
 * 
 *
 */
public class SalaryPO {

	String id;
	int job;

	String salarynum;
	/**
	 * 薪水策略
	 */
	int salarykind;
	
	/**
	 * @param job
	 * @param salarynum
	 * @param salarykind
	 */
	public SalaryPO(int job, String salarynum, int salarykind) {
		super();
		this.job = job;
		this.salarynum = salarynum;
		this.salarykind = salarykind;
	}

	public String getSalarynum() {
		return salarynum;
	}

	public void setSalarynum(String salarynum) {
		this.salarynum = salarynum;
	}
	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}
	public int getSalarykind() {
		return salarykind;
	}

	public void setSalarykind(int salarykind) {
		this.salarykind = salarykind;
	}

	public SalaryPO(String id, String salary) {
		super();
		this.id = id;
		this.salarynum = salary;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSalary() {
		return salarynum;
	}
	public void setSalary(String salary) {
		this.salarynum = salary;
	}
	
}
