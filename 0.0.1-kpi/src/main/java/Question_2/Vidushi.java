package Question_2;

public class Vidushi extends Employee implements Runnable {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		return "Vidushi";
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
		return 8897238;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "KrishiVihar";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "Prefer34";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "Vidushi03";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t10 = new Thread("Employee is developer"); }

}
