package Question_5;

public class Joker implements Joker_d {
	String name;
	public Joker() {
}
	public Joker(String Oswald) {
		name = Oswald;
	}
	

	public String dance(String n, String d) {
		// TODO Auto-generated method stub
		return (n + "is dancing" + d);
	}
	public static void main(String[] args) {
		Joker j1 = new Joker();
		Joker j2 = new Joker("Joker2");
		Joker j3 = new Joker();
		Joker j4 = new Joker("Joker4");
		Joker j5 = new Joker();
		Joker j6 = new Joker("Joker6");
		Joker j7 = new Joker();
		Joker j8 = new Joker("Joker8");
		Joker j9 = new Joker();
		Joker j10 = new Joker("Joker10");
		Joker j11 = new Joker();
		Joker j12 = new Joker("Joker12");
		Joker j13 = new Joker();
		Joker j14 = new Joker("Joker14");
		Joker j15 = new Joker();
		Joker j16 = new Joker("Joker16");
		j1.dance("Joker1", "Bharatnatyam");
		j2.dance("Joker2", "Kathak");
		j3.dance("Joker3", "Kathakali");
		j4.dance("Joker4", "Manipuri");
		j5.dance("Joker5", "Kuchipudi");
		j6.dance("Joker6", "Odissi");
		j7.dance("Joker7", "Gidda");
		j8.dance("Joker8", "Garba");
		j9.dance("Joker9", "Rouf");
		j10.dance("Joker10", "Ghoomar");
		j11.dance("Joker11", "Chhau");
		j12.dance("Joker12", "Bihu");
		j13.dance("Joker13", "Lavani");
		j14.dance("Joker14", "Mohiniyattam");
		j15.dance("Joker15", "Sattriya");
		j16.dance("Joker16", "Balltet");
		
		System.out.println(j1.dance("Joker1", "Bharatnatyam"));
		System.out.println(j2.dance("Joker2", "Kathak"));
		System.out.println(j2.dance("Joker3", "Kathakali"));
		System.out.println(j2.dance("Joker4", "Manipuri"));
		System.out.println(j2.dance("Joker5", "Kuchipudi"));
		System.out.println(j2.dance("Joker6", "Odissi"));
		System.out.println(j2.dance("Joker7", "Gidda"));
		System.out.println(j2.dance("Joker8", "Garba"));
		System.out.println(j2.dance("Joker9", "Rouf"));
		System.out.println(j2.dance("Joker10", "Ghoomar"));
		System.out.println(j2.dance("Joker11", "Chhau"));
		System.out.println(j2.dance("Joker12", "Bihu"));
		System.out.println(j2.dance("Joker13", "Lavani"));
		System.out.println(j2.dance("Joker14", "Mohiniyattam"));
		System.out.println(j2.dance("Joker15", "Sattriya"));
		System.out.println(j2.dance("Joker16", "Balltet"));
		
	}
		
	}
	
	


