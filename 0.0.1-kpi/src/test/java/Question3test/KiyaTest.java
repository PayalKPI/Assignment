package Question3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Kiya;




public class KiyaTest {
	@Test
    public void test1() {
	    Kiya k1 = new Kiya();
		String ans = k1.emp_name();
		assertEquals("Kiya", ans) ;
	}

}
