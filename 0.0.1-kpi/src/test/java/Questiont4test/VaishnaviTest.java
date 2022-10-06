package Questiont4test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Vaishnavi;



public class VaishnaviTest {
	@Test
	public void test1() {
		Vaishnavi v = new Vaishnavi();
		String ans = v.name();
		assertEquals("Vaishnavi",ans); }


}
