package nju.edu.express.businesslogic.warehouserbl;

import static org.junit.Assert.assertEquals;
import nju.edu.express.businesslogic.logisticsbl.MockLogisticsBlImpl;

import org.junit.Test;

public class WareInBlImpl_tester {

	@Test
	public void testAddWareIn(){
		MockLogisticsBlImpl logistics = new MockLogisticsBlImpl();
		boolean insertResult = logistics.insertLogistics(null);
		
		assertEquals(true,insertResult);
	}
}
