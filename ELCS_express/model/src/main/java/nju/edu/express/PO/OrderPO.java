package nju.edu.express.PO;
/**
 * 订单信息——订单号orderID,寄件人姓名sender_name、住址sender_adress、单位sender_danwei、电话ender_telephone、手机sender_phoneNUm；
 * 收件人姓名receiver_name、住址 receiver_adress、单位receiver_danwei、电话receiver_telephone、手机receiver_phoneNUm；
 * 托运货物信息（原件数cargo_num、实际重量cargo_weight、体积cargo_volume、内件品名cargo_name、尺寸cargo_size）；
 * 包装费packagingCost（纸箱、木箱、快递袋、其它）；费用合计totalCost；；经济快递、标准快递、特快；种类postKind,
 * 订单完成状态orderState、收件人receiver_signature、收件日期receive_date
 *
 *
 */
public class OrderPO {
	String orderID;
	
	String sender_name;
	String sender_adress;
	/**
	 * 寄件人单位。。。
	 */
	String sender_danwei;
	String sender_phoneNUm;
	String sender_telephone;
	
	String receiver_name;
	String receiver_adress;
	/**
	 * 收件人单位。。。
	 */
	String receiver_danwei;
	String receiver_phoneNUm;
	String receiver_telephone;
	
	String cargo_num;
	String cargo_weight;
	String cargo_volume;
	String cargo_name;
	String cargo_size;
	
	String packagingCost;
	String totalCost;
	int postKind;
	
	int orderState;
	String receiver_signature;
	String receive_date;
	/**
	 * @param orderID
	 * @param sender_name
	 * @param sender_adress
	 * @param sender_danwei
	 * @param sender_phoneNUm
	 * @param sender_telephone
	 * @param receiver_name
	 * @param receiver_adress
	 * @param receiver_danwei
	 * @param receiver_phoneNUm
	 * @param receiver_telephone
	 * @param cargo_num
	 * @param cargo_weight
	 * @param cargo_volume
	 * @param cargo_name
	 * @param cargo_size
	 * @param packagingCost
	 * @param totalCost
	 * @param postKind
	 * @param orderState
	 * @param receiver_signature
	 * @param receive_date
	 */
	public OrderPO(String orderID, String sender_name, String sender_adress,
			String sender_danwei, String sender_phoneNUm,
			String sender_telephone, String receiver_name,
			String receiver_adress, String receiver_danwei,
			String receiver_phoneNUm, String receiver_telephone,
			String cargo_num, String cargo_weight, String cargo_volume,
			String cargo_name, String cargo_size, String packagingCost,
			String totalCost, int postKind, int orderState,
			String receiver_signature, String receive_date) {
		super();
		this.orderID = orderID;
		this.sender_name = sender_name;
		this.sender_adress = sender_adress;
		this.sender_danwei = sender_danwei;
		this.sender_phoneNUm = sender_phoneNUm;
		this.sender_telephone = sender_telephone;
		this.receiver_name = receiver_name;
		this.receiver_adress = receiver_adress;
		this.receiver_danwei = receiver_danwei;
		this.receiver_phoneNUm = receiver_phoneNUm;
		this.receiver_telephone = receiver_telephone;
		this.cargo_num = cargo_num;
		this.cargo_weight = cargo_weight;
		this.cargo_volume = cargo_volume;
		this.cargo_name = cargo_name;
		this.cargo_size = cargo_size;
		this.packagingCost = packagingCost;
		this.totalCost = totalCost;
		this.postKind = postKind;
		this.orderState = orderState;
		this.receiver_signature = receiver_signature;
		this.receive_date = receive_date;
	}
	public OrderPO(){
		
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public String getSender_adress() {
		return sender_adress;
	}
	public void setSender_adress(String sender_adress) {
		this.sender_adress = sender_adress;
	}
	public String getSender_danwei() {
		return sender_danwei;
	}
	public void setSender_danwei(String sender_danwei) {
		this.sender_danwei = sender_danwei;
	}
	public String getSender_phoneNUm() {
		return sender_phoneNUm;
	}
	public void setSender_phoneNUm(String sender_phoneNUm) {
		this.sender_phoneNUm = sender_phoneNUm;
	}
	public String getSender_telephone() {
		return sender_telephone;
	}
	public void setSender_telephone(String sender_telephone) {
		this.sender_telephone = sender_telephone;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_adress() {
		return receiver_adress;
	}
	public void setReceiver_adress(String receiver_adress) {
		this.receiver_adress = receiver_adress;
	}
	public String getReceiver_danwei() {
		return receiver_danwei;
	}
	public void setReceiver_danwei(String receiver_danwei) {
		this.receiver_danwei = receiver_danwei;
	}
	public String getReceiver_phoneNUm() {
		return receiver_phoneNUm;
	}
	public void setReceiver_phoneNUm(String receiver_phoneNUm) {
		this.receiver_phoneNUm = receiver_phoneNUm;
	}
	public String getReceiver_telephone() {
		return receiver_telephone;
	}
	public void setReceiver_telephone(String receiver_telephone) {
		this.receiver_telephone = receiver_telephone;
	}
	public String getCargo_num() {
		return cargo_num;
	}
	public void setCargo_num(String cargo_num) {
		this.cargo_num = cargo_num;
	}
	public String getCargo_weight() {
		return cargo_weight;
	}
	public void setCargo_weight(String cargo_weight) {
		this.cargo_weight = cargo_weight;
	}
	public String getCargo_volume() {
		return cargo_volume;
	}
	public void setCargo_volume(String cargo_volume) {
		this.cargo_volume = cargo_volume;
	}
	public String getCargo_name() {
		return cargo_name;
	}
	public void setCargo_name(String cargo_name) {
		this.cargo_name = cargo_name;
	}
	public String getCargo_size() {
		return cargo_size;
	}
	public void setCargo_size(String cargo_size) {
		this.cargo_size = cargo_size;
	}
	public String getPackagingCost() {
		return packagingCost;
	}
	public void setPackagingCost(String packagingCost) {
		this.packagingCost = packagingCost;
	}
	public String getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}
	public int getPostKind() {
		return postKind;
	}
	public void setPostKind(int postKind) {
		this.postKind = postKind;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public String getReceiver_signature() {
		return receiver_signature;
	}
	public void setReceiver_signature(String receiver_signature) {
		this.receiver_signature = receiver_signature;
	}
	public String getReceive_date() {
		return receive_date;
	}
	public void setReceive_date(String receive_date) {
		this.receive_date = receive_date;
	}

}
