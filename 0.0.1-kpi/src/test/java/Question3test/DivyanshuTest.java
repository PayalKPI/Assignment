package Question3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Divyanshu;



public class DivyanshuTest {
	@Test
    public void test1() {
	    Divyanshu d1 = new Divyanshu();
		String ans = d1.emp_name();
		assertEquals("Divyanshu", ans) ;
	}

}
