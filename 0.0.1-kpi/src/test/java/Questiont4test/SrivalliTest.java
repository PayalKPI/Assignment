package Questiont4test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Srivalli;



public class SrivalliTest {
	@Test
	public void test1() {
		Srivalli s = new Srivalli();
		int ans = s.mob_no();
		assertEquals(863864,ans); }

	

}
