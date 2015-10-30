package nju.edu.express.PO;
/**
 * 人员信息－员工编号stuffID，员工姓名stuffName，员工职务stuffJob，员工年龄stuffAge
 * @author asd
 *
 */
public class StuffPO {

	String stuffID;
	String stuffName;
	int stuffJob;
	int stuffAge;
	


	/**
	 * @param stuffID
	 * @param stuffName
	 * @param stuffJob
	 * @param stuffAge
	 */
	public StuffPO(String stuffID, String stuffName, int stuffJob,
			int stuffAge) {
		super();
		this.stuffID = stuffID;
		this.stuffName = stuffName;
		this.stuffJob = stuffJob;
		this.stuffAge = stuffAge;
	}

	public StuffPO(){
		
	}
	public String  getStuffID() {
		return stuffID;
	}

	public void setStuffID(String stuffID) {
		this.stuffID = stuffID;
	}

	public String getStuffName() {
		return stuffName;
	}

	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

	public int getStuffJob() {
		return stuffJob;
	}

	public void setStuffJob(int stuffJob) {
		this.stuffJob = stuffJob;
	}

	public int getStuffAge() {
		return stuffAge;
	}

	public void setStuffAge(int stuffAge) {
		this.stuffAge = stuffAge;
	}

	public StuffPO(String id) {
		super();
		this.stuffID = id;
	}


	
	
}
