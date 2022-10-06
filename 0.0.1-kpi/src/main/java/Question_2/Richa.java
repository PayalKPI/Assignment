package Question_2;

public class Richa extends Employee implements Runnable{

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Richa";
	}

	@Override
	int age() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	int mob_no() {
		// TODO Auto-generated method stub
		return 76277;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "Shivajivatika";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "prefer34";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "Richa05";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t6 = new Thread("Employee is FullStack Developer"); }

}
