package Questiont4test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Ayushi;



public class AyushiTest {
	@Test
	public void test1() {
		Ayushi a1 = new Ayushi();
		String ans = a1.name();
		assertEquals("Ayushi",ans); }


}
