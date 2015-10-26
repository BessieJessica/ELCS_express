package nju.edu.express.ViceDriver;

import nju.edu.express.VO.BalanceVO;
import nju.edu.express.VO.CarVO;
import nju.edu.express.VO.DispatchVO;
import nju.edu.express.VO.DistributeVO;
import nju.edu.express.VO.DriverVO;
import nju.edu.express.VO.InArrivalVO;
import nju.edu.express.VO.InTransVO;
import nju.edu.express.VO.OutArrivalVO;
import nju.edu.express.VO.OutTransVO;
import nju.edu.express.businessbl.stub.BalanceBlImpl_stub;
import nju.edu.express.businessbl.stub.CarBlImpl_stub;
import nju.edu.express.businessbl.stub.DistributeBlImpl_stub;
import nju.edu.express.businessbl.stub.DriverBlImpl_stub;
import nju.edu.express.businessbl.stub.InArrivalBlImpl_stub;
import nju.edu.express.businessbl.stub.InTransBlImpl_stub;
import nju.edu.express.businesserblservice.BalanceBlService;
import nju.edu.express.businesserblservice.CarBlService;
import nju.edu.express.businesserblservice.DistributeBlService;
import nju.edu.express.businesserblservice.DriverBlService;
import nju.edu.express.businesserblservice.InArrivalBlService;
import nju.edu.express.businesserblservice.InTransBlService;
import nju.edu.express.transiterbl.stub.DispatchBlImpl_stub;
import nju.edu.express.transiterbl.stub.OutArrivalBlImpl_stub;
import nju.edu.express.transiterbl.stub.OutTransBlImpl_stub;
import nju.edu.express.transiterblservice.DispatchBlService;
import nju.edu.express.transiterblservice.OutArrivalBlService;
import nju.edu.express.transiterblservice.OutTransBlService;

public class Vice_Driver {
	
	static String BusinessID;

	DriverBlService driver;
	DriverVO[] drivervolist;
	
	CarBlService car;
	CarVO[] carvolist;
	
	BalanceBlService balance;
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
	/**
	 * 获得中转中心装车单
	 */
	public void getOutTransList(String transistID){
		outtrans=new OutTransBlImpl_stub();
		outtransvolist=outtrans.getOutTransList(BusinessID);
		System.out.println("-----------中转中心装车单列表--------------");
		System.out.println(intransvolist[0].getID());
	}
	
	/**
	 * 获得中转中心到达单
	 */
	public void getOutArrivalList(String transistID){
		outarrival=new OutArrivalBlImpl_stub();
		outarrivalvolist=outarrival.getOutArrivalList(transistID);
		System.out.println("-----------中转中心到达单列表------------");
		System.out.println(inarrivalvolist[0].getID());
		
	}
	
	
	/**
	 * 获得中转中心中转单
	 */
	public void getDispatchList(String transistID){
		dispatch=new DispatchBlImpl_stub();
		dispatchvolist=dispatch.getDispatchList(transistID);
		System.out.println("---------中转中心中转单--------------");
		System.out.println(dispatchvolist[0].getID());
	}
	
	/**
	 * 获得营业厅装车单
	 */
	public void getInTransList(String BusinessID){
		intrans=new InTransBlImpl_stub();
		intransvolist=intrans.getInTransList(BusinessID);
		System.out.println("---------营业厅装车单列表--------------");
		System.out.println(intransvolist[0].getID());
	}
	
	/**
	 * 获得营业厅到达单列表
	 */
	public void getInArrivalList(String BusinessID){
		inarrival=new InArrivalBlImpl_stub();
		inarrivalvolist=inarrival.getInArrivalList(BusinessID);
		System.out.println("-----------营业厅到达单列表------------");
		System.out.println(inarrivalvolist[0].getID());
	}
	
	/**
	 * 获得收款单列表
	 */
	public void getDistributeList(String BusinessID){
		distribute=new DistributeBlImpl_stub();
		distributevolist=distribute.getDistributeList(BusinessID);
		System.out.println("------------收款单列表----------");
		System.out.println(distributevolist[0].getID());
	}
	
	/**
	 * 获得司机列表
	 */
	public void getDriverList(String businessID){
		driver=new DriverBlImpl_stub();
		drivervolist=driver.getDriverList(businessID);
		System.out.println("---------------司机信息id-----------------");
		System.out.println(drivervolist[0].getID());
	}
	
	
	/**
	 * 获得车辆列表
	 */
	public void getCarList(String BusinessID){
		car = new CarBlImpl_stub();
		carvolist = car.getCarList(BusinessID);
		System.out.println("---------------车辆信息id------------------");
		System.out.println(carvolist[0].getID());
		
	}
	
	
	/**
	 * 获得收款单列表
	 */
	public void getBalanceList(String BusinessID){
		balance=new BalanceBlImpl_stub();
		balancevolist=balance.getBalanceList(BusinessID);
		System.out.println("------------收款单列表-----------");
		System.out.println(balancevolist[0].getID());
	}
	
	

	
	public static void main(String[] args){
		Vice_Driver driver=new Vice_Driver();
		BusinessID="10000";
		driver.getBalanceList(BusinessID);
		driver.getCarList(BusinessID);
		driver.getDriverList(BusinessID);
	}
	
	
}
