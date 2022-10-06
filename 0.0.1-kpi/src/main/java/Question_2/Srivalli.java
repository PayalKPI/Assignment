package Question_2;

public class Srivalli extends Employee implements Runnable{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Srivalli";
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

	public int mob_no() {
		// TODO Auto-generated method stub
		return 863864;
	}

	@Override
	String address() {
		// TODO Auto-generated method stub
		return "nayanO";
	}

	@Override
	int pf() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	String insurance_name() {
		// TODO Auto-generated method stub
		return "Medico78";
	}

	@Override
	String mail_id() {
		// TODO Auto-generated method stub
		return "Srivalli09";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		
	}
	public static void main(String args[]) {
		Thread t8 = new Thread("Employee is ios developer"); }

}
