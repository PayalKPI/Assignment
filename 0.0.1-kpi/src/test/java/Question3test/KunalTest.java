package Question3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Kunal;



public class KunalTest {
	@Test
    public void test1() {
		Kunal k = new Kunal();
		String ans = k.emp_name();
		assertEquals("Kunal", ans) ;
	}
	

}
