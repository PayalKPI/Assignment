package Question_2;

public class Ayushi extends Employee implements Runnable {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Ayushi";
	}

	@Override
	int age() {
		// TODO Auto-generated method stub
		return 21;
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	int mob_no() {
		// TODO Auto-generated method stub
		return 287474;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "SouthTukoganj";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "Medi1";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "Ayushi11";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t2 = new Thread("Employee is Sr.Data Engineer");
	}

}
