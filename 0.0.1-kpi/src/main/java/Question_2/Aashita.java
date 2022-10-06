package Question_2;

public class Aashita extends Employee implements Runnable {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Aashita";
	}

	@Override

	public int age() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public int mob_no() {
		// TODO Auto-generated method stub
		return 2746682;
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "Palasia";
	}

	@Override
	public int pf() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public String insurance_name() {
		// TODO Auto-generated method stub
		return "Medi";
	}

	@Override
	public String mail_id() {
		// TODO Auto-generated method stub
		return "Aashit10";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
		
	}
	public static void main(String args[]) {
		Thread t1 = new Thread("Employee is data engineer"); 
	}

}
