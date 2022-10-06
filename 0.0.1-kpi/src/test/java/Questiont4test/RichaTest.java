package Questiont4test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Richa;




public class RichaTest {
	@Test
	public void test1() {
		Richa r = new Richa();
		String ans = r.name();
		assertEquals("Richa",ans); }


}
