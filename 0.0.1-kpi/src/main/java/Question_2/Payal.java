package Question_2;

public class Payal extends Employee implements Runnable {

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Payal";
	}

	@Override
	
	public int age() {
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
		return 878387;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "Mahalaxminagar";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "Medico1";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "payal2810";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t5 = new Thread("Employee is Python Developer"); }

}
