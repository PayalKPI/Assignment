package Question_7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetTest {
	@Test
	public void test1() {
		Set1 s = new Set1();
		int ans = s.element();
		assertEquals(10,ans);
	}

}
