package nju.edu.express.driver;

import nju.edu.express.presentation.mainui.MainFrame;

public class Main_driver {

	/**
	 * 获得物流信息界面，这部分功能在图形界面实现！
	 */
	/*LogisticsBlService logistics;
	LogisticsVO logisticsVO;

	public void getLogistics() {
		logistics = new LogisticsBlImpl_stub();
		try {
			logisticsVO = logistics.getLogistics("10000");
			if (logisticsVO == null)
				System.out.println("null");
			else
				System.out.println(logisticsVO.getBusinessInfo());

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/

	/**
	 * 登录
	 */
/*	SigninBlService signin;

	public void signIn() {
		boolean correctness;
		signin = new SigninBlImpl_stub();
//		correctness = signin.isCorrect("alan", "11111");

		System.out.println("----------登录功能----------");
//		System.out.println(correctness);
	}*/

	/**
	 * 人员管理--添加人员
	 *//*
	StuffBlService stuff;
	StuffVO stuffVO;

	public void addStuff() {
		stuff = new StuffBlImpl_stub();
		stuffVO = new StuffVO("10000");
		System.out.println("----------人员管理----------");
		stuff.addStuff(stuffVO);
	}

	*//**
	 * 部门管理--删除部门
	 *//*
	DepartmentBlService department;
	String[] departmentID;

	public void delDepartment() {
		departmentID = new String[2];
		departmentID[0] = "1";
		departmentID[1] = "2";
		department = new DepartmentBlImpl_stub();
		System.out.println("----------部门管理----------");
		department.delDepartment(departmentID);
	}

	*//**
	 * 常量管理--修改常量
	 *//*
//	ConstBlService Const;
//	ConstVO[] constVO;
//
//	public void updateConst() {
//		constVO = new ConstVO[2];
//		constVO[0] = new ConstVO("车辆");
//		constVO[1] = new ConstVO("人员");
//		Const = new ConstBlImpl_stub();
//		System.out.println("----------常量管理----------");
//		Const.endConst(constVO);
//	}

	*//**
	 * 工资管理--获得详细工资信息
	 *//*
	SalaryBlService salary;
	SalaryVO salaryVO;

	public void getSalary() {
		salary = new SalaryBlImpl_stub();
		salaryVO = salary.getSalary("1");
		System.out.println("----------工资管理----------");
		System.out.println("1" + " 号员工 " + " 工资为 " + salaryVO.getSalary());
	}

	*//**
	 * 银行账户--删除银行账户
	 *//*
	AccountBlService account;
	String[] delIDs = { "1号银行账户", "2号银行账户" };

	public void delAccount() {
		account = new AccountBlImpl_stub();
		System.out.println("--------银行账户管理--------");
		account.delAccount(delIDs);
	}

	*//**
	 * 收款单结算--更新银行账户
	 *//*
	BalanceBlService balance;

	public void balance() {
		balance = new BalanceBlImpl_stub();
		balance.endBalance(12345.0);
	}

	*//**
	 * 查看经营情况表
	 *//*
	BusinessConBlService businessCon;
	BusinessConVO businessVO;

	public void getBusinessCon() {
		businessCon = new BusinessConBlImpl_stub();
		businessVO = businessCon.getBusinessConChart("20151025", "20151026");
		System.out.println("----------经营情况表----------");
		System.out.println(businessVO.getId() + "经验情况表已载入");
	}

	*//**
	 * 查看成本收益表
	 *//*
	ProfitBlService profit;
	ProfitVO vo;

	public void getProfitChart() {
		profit = new ProfitBlImpl_stub();
		vo = profit.getProfitChart();
		System.out.println("----------查看成本收益表----------");
		System.out.println("成本收益表 " + vo.getId() + " 号已载入");
	}

	*//**
	 * 查看付款单
	 *//*
	PaymentBlService payment;
	PaymentVO vo1;

	public void getPayment() {
		payment = new PaymentBlImpl_stub();
		vo1 = payment.getPayment("1");
		System.out.println("----------查看收款单----------");
		System.out.println("1号收款单金额:" + vo1.getCost());

	}

	static String BusinessID;

	DriverBlService driver;
	DriverVO[] drivervolist;

	CarBlService car;
	CarVO[] carvolist;

	nju.edu.express.businesserblservice.BalanceBlService balance1;
	BalanceVO[] balancevolist;

	DistributeBlService distribute;
	DistributeVO[] distributevolist;

	InArrivalBlService inarrival;
	InArrivalVO[] inarrivalvolist;

	InTransBlService intrans;
	InTransVO[] intransvolist;

	DispatchBlService dispatch;
	DispatchVO[] dispatchvolist;

	OutArrivalBlService outarrival;
	OutArrivalVO[] outarrivalvolist;

	OutTransBlService outtrans;
	OutTransVO[] outtransvolist;

	*//**
	 * 获得中转中心装车单,有点小问题
	 *//*
	// public void getOutTransList(){
	// outtrans=new OutTransBlImpl_stub();
	// outtransvolist=outtrans.getOutTransList(BusinessID);
	// System.out.println("-----------中转中心装车单列表--------------");
	// System.out.println(outtransvolist[0].getId());
	// }
	//
	*//**
	 * 获得中转中心到达单
	 *//*
	public void getOutArrivalList() {
		outarrival = new OutArrivalBlImpl_stub();
		outarrivalvolist = outarrival.getOutArrivalList("10000");
		System.out.println("-----------中转中心到达单列表------------");
		System.out.println(outarrivalvolist[0].getID());

	}

	*//**
	 * 获得中转中心中转单
	 *//*
	public void getDispatchList() {
		dispatch = new DispatchBlImpl_stub();
		dispatchvolist = dispatch.getDispatchList("10000");
		System.out.println("---------中转中心中转单--------------");
		System.out.println(dispatchvolist[0].getID());
	}

	*//**
	 * 获得营业厅装车单
	 *//*
	public void getInTransList() {
		intrans = new InTransBlImpl_stub();
		intransvolist = intrans.getInTransList("10000");
		System.out.println("---------营业厅装车单列表--------------");
		System.out.println(intransvolist[0].getID());
	}

	*//**
	 * 获得营业厅到达单列表
	 *//*
	public void getInArrivalList() {
		inarrival = new InArrivalBlImpl_stub();
		inarrivalvolist = inarrival.getInArrivalList("10000");
		System.out.println("-----------营业厅到达单列表------------");
		System.out.println(inarrivalvolist[0].getID());
	}

	*//**
	 * 获得收款单列表
	 *//*
	public void getDistributeList() {
		distribute = new DistributeBlImpl_stub();
		distributevolist = distribute.getDistributeList("1");
		System.out.println("------------收款单列表----------");
		System.out.println(distributevolist[0].getID());
	}

	*//**
	 * 获得司机列表
	 *//*
	public void getDriverList() {
		driver = new DriverBlImpl_stub();
		drivervolist = driver.getDriverList("1");
		System.out.println("---------------司机信息id-----------------");
		System.out.println(drivervolist[0].getID());
	}

	*//**
	 * 获得车辆列表
	 *//*
	public void getCarList() {
		car = new CarBlImpl_stub();
		carvolist = car.getCarList("1");
		System.out.println("---------------车辆信息id------------------");
		System.out.println(carvolist[0].getID());

	}*/

	/**
	 * 主函数运行驱动
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Main_driver driver = new Main_driver();
		// LogisticsFrame_Test logistics = new LogisticsFrame_Test();
		// driver.signIn();
		// driver.addStuff();
		// driver.delDepartment();
		// driver.updateConst();
		// driver.getSalary();
		// driver.delAccount();
		// driver.getBusinessCon();
		// driver.getProfitChart();
		// driver.getPayment();
		//
		// driver.getCarList();
		// driver.getDriverList();
		// driver.getDistributeList();
		// driver.getDispatchList();
		// driver.getInArrivalList();
		// driver.getInTransList();
		// driver.getOutArrivalList();
		 MainFrame mainFrame = MainFrame.getInstance();
		// driver.getLogistics();

		// SQL测试
		/*MySqlImpl mySqlImpl = new MySqlImpl();
		ResultSet result = mySqlImpl.query("select * from user");
		while(result.next()){
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}*/
		
//		SigninBlImpl sign = new SigninBlImpl();
//		System.out.println(sign.isCorrect("xzf14", "19951102")==StuffAccess.MANAGER);
		
		
	}
}
