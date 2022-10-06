package Questiont4test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question_2.Aashita;



public class AashitaTest {
	@Test
	public void test1() {
		Aashita a = new Aashita();
		String ans = a.name();
		int ans1 = a.age();
		int ans2 = a.salary();
		String ans3 = a.address();
		String ans4 = a.mail_id();
		String ans5 = a.insurance_name();
		int ans6 = a.mob_no();
		
		assertEquals("Aashita",ans);
		assertEquals(20,ans1);
		assertEquals(20000,ans2);
		assertEquals("Palasia",ans3);
		assertEquals("Aashit10",ans4);
		assertEquals("Medi",ans5);
		assertEquals(2746682,ans6);
		}

}
