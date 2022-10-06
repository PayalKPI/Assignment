package Questiont4test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Shivani;



public class ShivaniTest {
	@Test
	public void test1() {
		Shivani s = new Shivani();
		String ans = s.name();
		assertEquals("Shivani",ans); }

}
