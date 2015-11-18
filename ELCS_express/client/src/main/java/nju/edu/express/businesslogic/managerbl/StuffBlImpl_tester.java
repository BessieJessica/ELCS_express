package nju.edu.express.businesslogic.managerbl;

import static org.junit.Assert.assertEquals;
import nju.edu.express.businesslogic.adminbl.MockUserBlImpl;
import nju.edu.express.businesslogic.logisticsbl.MockLogisticsBlImpl;

import org.junit.Test;

public class StuffBlImpl_tester {

	@Test
	public void testStuff(){
		MockUserBlImpl user = new MockUserBlImpl();
		boolean insertResult = user.deleteUser();
		assertEquals(true,insertResult);
		
		insertResult = user.addUser();
		assertEquals(true,insertResult);
		
		insertResult = user.updateUser();
		assertEquals(true,insertResult);
	}
}
