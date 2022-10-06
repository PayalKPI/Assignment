package Question_2;

public class Vaishnavi extends Employee implements Runnable {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Vaishnavi";
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
		return 87384;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "navi";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 3500;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "Medico";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "Vaishnavi10";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t9 = new Thread("Employee is Data Analyst"); }

}
