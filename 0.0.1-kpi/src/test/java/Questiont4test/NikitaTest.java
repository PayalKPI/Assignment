package Questiont4test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Nikita;




public class NikitaTest {
	@Test
	public void test1() {
		Nikita n = new Nikita();
		String ans = n.name();
		assertEquals("Nikita",ans); }


}
