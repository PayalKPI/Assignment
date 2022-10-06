package Question_7;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Set1 {
	public int element() {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		hs.add(10);
		hs.add(8);
		hs.add(7);
		hs.add(6);
		hs.add(5);
		hs.add(4);
		hs.add(3);
		hs.add(2);
		hs.add(1);
		hs.add(9);
		hs.add(10);
		int last = 0;
		for(int i:hs) {
			last=i;
		}
		return last;
	}
	public static void main(String[] args) {
		Set1 s = new Set1();
		int ans = s.element();
		System.out.println(ans);
		}
	}


		
			
		

	


