package Question_2;

public class Shivani extends Employee implements Runnable {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Shivani";
	}

	@Override
	int age() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	int mob_no() {
		// TODO Auto-generated method stub
		return 7648726;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "nano";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "medico28";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "shivani23";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t7 = new Thread("Employee is Backend Developer"); }

}
