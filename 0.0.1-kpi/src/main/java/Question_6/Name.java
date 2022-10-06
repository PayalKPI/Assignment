package Question_6;
import java.util.ArrayList;
public class Name {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(); //ArrayList1
		list1.add("Hello");
		list1.add("my");
		list1.add("name");
		list1.add("is");
		list1.add("Payal");
		
		System.out.println("List1" + list1);
		
		ArrayList<String> list2 = new ArrayList<String>(); //ArrayList2
		list2.add("Hello");
		list2.add("How");
		list2.add("are");
		list2.add("you");
		list2.add("all");
		
		System.out.println("List2" + list2);
		
		ArrayList<String> list3 = new ArrayList<String>(); //ArrayList3
		list3.add("Hello");
		list3.add("GoodMorning");
		
		System.out.println("List3" + list3);
		
		ArrayList<String> list4 = new ArrayList<String>(); //ArrayList4
		list4.add("Hello");
		list4.add("Happy Diwali");
		
		System.out.println("List4" + list4);
		
		ArrayList<String> list5 = new ArrayList<String>(); //ArrayList5
		list5.add("Hello");
		list5.add("Have");
		list5.add("a");
		list5.add("goodday");
		
		list1.retainAll(list2);
		list1.retainAll(list3);
		list1.retainAll(list4);
		list1.retainAll(list5);
		System.out.println("Common element" + list1);
		String a = list1.get(0);
		int index = list3.indexOf(a);
		System.out.println(index); 
		}
}
			
		
		
		
	
		

