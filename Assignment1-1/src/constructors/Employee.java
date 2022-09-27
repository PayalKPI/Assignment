package constructors;

public class Employee{
	

	public Employee() {
		// TODO Auto-generated constructor stub
		
	}
	public Employee(int n1, int n2) {
		int num1 = n1;
		int num2 = n2;
	}
	public Employee(double x, double y) {
		double num1 = x;
		double num2 = y;
		
		
	}
	public void display() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee();
		Employee obj2 = new Employee(10,15);
		Employee obj3 = new Employee(1.5,2.5);
		Employee obj4 = new Employee(3,7);
		Employee obj5 = new Employee();
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
		obj5.display();
	
		
	}
	

}
