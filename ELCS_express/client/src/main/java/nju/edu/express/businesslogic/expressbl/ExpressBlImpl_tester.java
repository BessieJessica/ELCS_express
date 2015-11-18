package nju.edu.express.businesslogic.expressbl;

import static org.junit.Assert.assertEquals;
import nju.edu.express.VO.ConstVO;
import nju.edu.express.businesslogic.logisticsbl.MockLogisticsBlImpl;
import nju.edu.express.businesslogic.managerbl.MockConstBlImpl;

import org.junit.Test;

public class ExpressBlImpl_tester {

	@Test
	public void testAddOrder(){
		MockLogisticsBlImpl logistics = new MockLogisticsBlImpl();
		boolean insertResult = logistics.insertLogistics(null);
		
		assertEquals(true,insertResult);
	}
	
	public void testSum(){
		MockConstBlImpl Const = new MockConstBlImpl();
		ConstVO[] vo = Const.getConst();
		
		double sum1 = vo[0].getDistance()*vo[0].getPrice();
		double sum2 = vo[1].getDistance()*vo[1].getPrice();
		double sum3 = vo[2].getDistance()*vo[2].getPrice();
		
		assertEquals(3000,sum1,0);
		assertEquals(10000,sum2,0);
		assertEquals(250000,sum3,0);
	}
}
