package nju.edu.express.businesslogic.transiterbl;

import static org.junit.Assert.assertEquals;
import nju.edu.express.businesslogic.logisticsbl.MockLogisticsBlImpl;

import org.junit.Test;

public class DispatchBlImpl_tester {

	@Test
	public void testAddDispatch(){
		MockLogisticsBlImpl logistics = new MockLogisticsBlImpl();
		boolean insertResult = logistics.insertLogistics(null);
		
		assertEquals(true,insertResult);
	}
}
