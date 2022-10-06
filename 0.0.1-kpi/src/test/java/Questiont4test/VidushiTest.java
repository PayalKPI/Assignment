package Questiont4test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Vidushi;



public class VidushiTest {
	@Test
	public void test1() {
		Vidushi v1 = new Vidushi();
		String ans = v1.name();
		assertEquals("Vidushi",ans); }

}
