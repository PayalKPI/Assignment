package Question3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Yatharth;


public class YatharthTest {
	@Test
     public void test1() {
		Yatharth y = new Yatharth();
		String ans = y.emp_name();
		assertEquals("Yatharth", ans) ;
	}
		
}	


