package Question_5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class JokerTest {
	@Test
	public void test1() {
		Joker j1 = new Joker();
		Joker j2 = new Joker();
		Joker j3 = new Joker();
		String ans = j1.dance("Joker1", "Bharatnatyam");
		String ans1 = j2.dance("Joker2", "Kathak");
		String ans2 = j3.dance("Joker3", "Kathakali");
		
		assertEquals("Joker1is dancingBharatnatyam", ans);
		assertEquals("Joker2is dancingKathak", ans1);
		assertEquals("Joker3is dancingKathakali", ans2);
	
	}
	

}
