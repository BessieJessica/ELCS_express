package nju.edu.express.enumdata;

public enum StuffAccess {

	EXPRESSER("快递员"), BUSINESSER("营业厅业务员"), WAREHOUSER("仓库管理员"), TRANSITER(
			"中转中心业务员"), MANAGER("总经理"), FINANCER("财务人员"), ADMIN("管理员"), ERROR("");
	
	private String name;
	private StuffAccess(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
