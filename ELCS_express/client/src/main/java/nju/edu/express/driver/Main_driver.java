package nju.edu.express.driver;

import nju.edu.express.VO.BusinessConVO;
import nju.edu.express.VO.ConstVO;
import nju.edu.express.VO.LogisticsVO;
import nju.edu.express.VO.ProfitVO;
import nju.edu.express.VO.SalaryVO;
import nju.edu.express.VO.StuffVO;
import nju.edu.express.financebl.stub.AccountBlImpl_stub;
import nju.edu.express.financebl.stub.BalanceBlImpl_stub;
import nju.edu.express.financebl.stub.BusinessConBlImpl_stub;
import nju.edu.express.financebl.stub.ProfitBlImpl_stub;
import nju.edu.express.financeblservice.AccountBlService;
import nju.edu.express.financeblservice.BalanceBlService;
import nju.edu.express.financeblservice.BusinessConBlService;
import nju.edu.express.financeblservice.ProfitBlService;
import nju.edu.express.logisticsbl.LogisticsBlImpl;
import nju.edu.express.logisticsblservice.LogisticsBlService;
import nju.edu.express.managerbl.stub.ConstBlImpl_stub;
import nju.edu.express.managerbl.stub.DepartmentBlImpl_stub;
import nju.edu.express.managerbl.stub.SalaryBlImpl_stub;
import nju.edu.express.managerbl.stub.StuffBlImpl_stub;
import nju.edu.express.managerblservice.ConstBlService;
import nju.edu.express.managerblservice.DepartmentBlService;
import nju.edu.express.managerblservice.SalaryBlService;
import nju.edu.express.managerblservice.StuffBlService;
import nju.edu.express.signinbl.stub.SigninBlImpl_stub;
import nju.edu.express.signinblservice.SigninBlService;

public class Main_driver{	
	
	/**
	 * 获得物流信息界面
	 */
	LogisticsBlService logistics;
	LogisticsVO logisticsVO;
	
	public void getLogistics(){
		logistics = new LogisticsBlImpl();
		logisticsVO = logistics.getLogistics("10000");
	}
	
	
	
	/**
	 * 登录
	 */
	SigninBlService signin;
	
	public void signIn(){
		boolean correctness;
		signin = new SigninBlImpl_stub();
		correctness = signin.isCorrect("alan", "11111");
		
		System.out.println("----------登录功能----------");
		System.out.println(correctness);
	}
	
	/**
	 * 人员管理--添加人员
	 */
	StuffBlService stuff;
	StuffVO stuffVO;
	
	public void addStuff(){
		stuff = new StuffBlImpl_stub();
		stuffVO = new StuffVO("10000");
		System.out.println("----------人员管理----------");
		stuff.addStuff(stuffVO);
	}
	
	
	
	/**
	 * 部门管理--删除部门
	 */
	DepartmentBlService department;
	String[] departmentID;
	
	public void delDepartment(){
		departmentID = new String[2];
		departmentID[0] = "1";
		departmentID[1] = "2";
		department = new DepartmentBlImpl_stub();
		System.out.println("----------部门管理----------");
		department.delDepartment(departmentID);
	}
	
	
	
	/**
	 * 常量管理--修改常量
	 */
	ConstBlService Const;
	ConstVO[] constVO;
	
	public void updateConst(){
		constVO = new ConstVO[2];
		constVO[0] = new ConstVO("车辆");
		constVO[1] = new ConstVO("人员");
		Const = new ConstBlImpl_stub();
		System.out.println("----------常量管理----------");
		Const.endConst(constVO);
	}
	
	
	
	/**
	 * 工资管理--获得详细工资信息
	 */
	SalaryBlService salary;
	SalaryVO salaryVO;
	
	public void getSalary(){
		salary = new SalaryBlImpl_stub();
		salaryVO = salary.getSalary("1");
		System.out.println("----------工资管理----------");
		System.out.println("1"+" 号员工 "+" 工资为 "+salaryVO.getSalary());
	}
	
	
	
	/**
	 * 银行账户--删除银行账户
	 */
	AccountBlService account;
	String[] delIDs = {"1号银行账户","2号银行账户"};
	public void delAccount(){
		account = new AccountBlImpl_stub();
		System.out.println("--------银行账户管理--------");
		account.delAccount(delIDs);
	}
	
	
	/**
	 * 收款单结算--更新银行账户
	 */
	BalanceBlService balance;
	
	public void balance(){
		balance = new BalanceBlImpl_stub();
		balance.endBalance(12345.0);
	}
	
	
	/**
	 * 查看经营情况表
	 */
	BusinessConBlService businessCon;
	BusinessConVO businessVO;
	
	public void getBusinessCon(){
		businessCon = new BusinessConBlImpl_stub();
		businessVO = businessCon.getBusinessConChart("20151025", "20151026");
		System.out.println("----------经营情况表----------");
		System.out.println(businessVO.getId()+"经验情况表已载入");
	}
	
	
	/**
	 * 查看成本收益表
	 */
	ProfitBlService profit;
	ProfitVO vo;
	
	public void getProfitChart(){
		profit = new ProfitBlImpl_stub();
		vo = profit.getProfitChart();
		System.out.println("----------查看成本收益表----------");
		System.out.println("成本收益表 "+vo.getId()+" 号已载入");
	}
	
	
	
	/**
	 * 主函数运行驱动
	 * @param args
	 */
	public static void main(String[] args){
		Main_driver driver = new Main_driver();
		Logistics logistics = new Logistics();
		driver.signIn();
		driver.addStuff();
		driver.delDepartment();
		driver.updateConst();
		driver.getSalary();
		driver.delAccount();
		driver.getBusinessCon();
		driver.getProfitChart();
	}
}
