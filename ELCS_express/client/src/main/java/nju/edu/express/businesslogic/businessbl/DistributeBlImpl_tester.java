package nju.edu.express.businesslogic.businessbl;

import static org.junit.Assert.assertEquals;
import nju.edu.express.businesslogic.logisticsbl.MockLogisticsBlImpl;

import org.junit.Test;

public class DistributeBlImpl_tester {

	@Test
	public void testAddDistribute() {
		MockLogisticsBlImpl logistics = new MockLogisticsBlImpl();
		boolean insertResult = logistics.insertLogistics(null);

		assertEquals(true, insertResult);
	}
}
