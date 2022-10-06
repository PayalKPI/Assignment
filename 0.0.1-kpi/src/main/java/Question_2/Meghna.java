package Question_2;

public class Meghna extends Employee implements Runnable {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Meghna";
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
		return 376846;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "Tilaknagar";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 2500;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "Medico98";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "Meghna01";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t3 = new Thread("Employee is Data Scientist"); }
}


