package Questiont4test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Employee;
import Question_2.Payal;


public class Payaltest {
	
	@Test
	public void test1() {
		Payal p = new Payal();
		int ans = p.age();
		assertEquals(24,ans);
	}
	
	
}
