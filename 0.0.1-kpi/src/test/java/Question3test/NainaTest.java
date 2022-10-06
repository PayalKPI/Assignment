package Question3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_1.Naina;



public class NainaTest {
	@Test
    public void test1() {
		Naina n = new Naina();
		String ans = n.emp_name();
		assertEquals("Naina", ans) ;
	}

}
