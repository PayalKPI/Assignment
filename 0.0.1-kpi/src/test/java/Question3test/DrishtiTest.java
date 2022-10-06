package Question3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Drishti;




public class DrishtiTest {
	@Test
    public void test1() {
	    Drishti d = new Drishti();
		String ans = d.emp_name();
		assertEquals("Drishti", ans) ;
	}

}
