package nju.edu.express.businesslogic.transiterbl;

import static org.junit.Assert.assertEquals;
import nju.edu.express.businesslogic.logisticsbl.MockLogisticsBlImpl;

import org.junit.Test;

public class OutTransBlImpl_tester {

	@Test
	public void testAddOutTrans(){
		MockLogisticsBlImpl logistics = new MockLogisticsBlImpl();
		boolean insertResult = logistics.insertLogistics(null);
		
		assertEquals(true,insertResult);
	}
}
