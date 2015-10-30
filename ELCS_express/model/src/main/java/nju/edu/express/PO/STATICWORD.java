package nju.edu.express.PO;
/**
 * 性别：男=0，女=1；
 * 机构类型：营业厅=2，中转中心=3；
 * 职位：快递员=4，营业厅业务员=5，中转中心业务员=6，中转中心仓库管理员=7，财务人员=8，总经理=9
 * 货物状态：完整=10；损坏=11，丢失=12
 * 计薪方式：按次=13，按月=14，提成=15；
 * 快递类型：特快=16，普通=17，经济=18
 * 订单完成状态：已完成=19，未完成=20；
 * 运输方式：飞机=21；火车=22；汽车=23；
 *         物流信息：已收件=24，寄件人营业厅=25，寄件人中转中心=26，收件人中转中心=27，收件人营业厅=28，派件中=29，结束=30；
 *         
 *         
 *  用户权限级别待定：
 * @author asd
 *
 */
public class STATICWORD {
	
	public static int GENDER_MAIL=0;
	public static int GENDER_FEMAIL=1;
	
	public static int BUSINESS=2;
	public static int TRANSIST=3;
	
	public static int STUFF_EXPRESS=4;
	public static int STUFF_BUSINESSER=5;
	public static int STUFF_TRANSISTER=6;
	public static int STUFF_WAREHOUSER=7;
	public static int STUFF_FINANCE=8;
	public static int STUFF_MANAGER=9;
	
	public static int CARGO_FULL=10;
	public static int CARGO_DAMAGED=11;
	public static int CARGO_MISSED=12;
	
	public static int SALARY_BYTIME=13;
	public static int SALARY_BYMONTH=14;
	public static int SALARY_TICHENG=15;
	
	public static int POSTKIND_SUPERFAST=16;
	public static int POSTKIND_COMMON=17;
	public static int POSTKIND_CHEAP=18;
	
	public static int ORDERSTATE_COMPLETED=19;
	public static int ORDERSTATE_UNCOMPLETED=20;
	
	public static int CARRYKIND_AIR=21;
	public static int CARRYKIND_TRAIN=22;
	public static int CARRYKIND_CAR=23;
	
//	public static int LOGICTICS_BEGIN=24;
//	public static int LOGICTICS_SENDERBUSINESS=25;
//	public static int LOGICTICS_SENDERTRANSIST=26;
//	public static int LOGICTICS_RECEIVERTRANSIST=27;
//	public static int LOGICTICS_RECEIVERBUSINESS=28;
//	public static int LOGICTICS_DISTRIBUTING=29;
//	public static int LOGICTICS_FINISHED=30;
	
}
