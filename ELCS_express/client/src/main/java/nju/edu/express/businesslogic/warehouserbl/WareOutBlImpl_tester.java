package nju.edu.express.businesslogic.warehouserbl;

import static org.junit.Assert.assertEquals;
import nju.edu.express.businesslogic.logisticsbl.MockLogisticsBlImpl;

import org.junit.Test;

public class WareOutBlImpl_tester {

	@Test
	public void testAddWareOut(){
		MockLogisticsBlImpl logistics = new MockLogisticsBlImpl();
		boolean insertResult = logistics.insertLogistics(null);
		
		assertEquals(true,insertResult);
	}
}
