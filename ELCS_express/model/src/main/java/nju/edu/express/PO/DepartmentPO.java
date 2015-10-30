package nju.edu.express.PO;

/**
 * 机构信息－机构编号OrganizationID，机构类型（营业厅／中转中心）kind，机构位置location
 * 机构类型：int kind
 * @author asd
 *
 */
public class DepartmentPO {
	String OrganizationID;
	int kind;
	String location;
	/**
	 * @param organizationID
	 * @param kind
	 * @param location
	 */
	public DepartmentPO(String organizationID, int kind, String location) {
		super();
		OrganizationID = organizationID;
		this.kind = kind;
		this.location = location;
	}
	public DepartmentPO(){
		
	}
	public String getOrganizationID() {
		return OrganizationID;
	}
	public void setOrganizationID(String organizationID) {
		OrganizationID = organizationID;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
