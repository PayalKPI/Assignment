package Super;

public class Student extends Person{
	void message() {
		System.out.println("This is student class");
	}
	void display() {
		message();
		
		super.message();
	}

}
