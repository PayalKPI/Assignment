package Questiont4test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Meghna;



public class MeghnaTest {
	@Test
	public void test1() {
		Meghna m = new Meghna();
		String ans = m.name();
		assertEquals("Meghna",ans); }

}
