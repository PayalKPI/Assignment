//Write program to handle exceptions while dividing the no. by zero 


package Exception;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Dividing by zero operation can't possible");
		}

	}

}
