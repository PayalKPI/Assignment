package Question_2;

public class Nikita extends Employee implements Runnable {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Nikita";
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
		return 4872874;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "NewPalasia";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 2500;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "PREFER2";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "Nikita13";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t4 = new Thread("Employee is java developer"); }

}
