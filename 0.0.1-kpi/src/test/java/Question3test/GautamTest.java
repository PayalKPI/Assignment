package Question3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Gautam;



public class GautamTest {
	@Test
    public void test1() {
	    Gautam g = new Gautam();
		String ans = g.emp_name();
		assertEquals("Gautam", ans) ;
	}

}
