package Question3test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Manvi;


public class ManviTest {
	@Test
    public void test1() {
		Manvi m = new Manvi();
		String ans = m.emp_name();
		assertEquals("Manvi", ans) ;
	}

}
