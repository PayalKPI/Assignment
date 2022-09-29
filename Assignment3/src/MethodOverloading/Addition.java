package MethodOverloading;
//Changing the number of parameters is the way of method overloading



public class Addition {
	public int Addition(int x, int y) { //Taking two parameters
		return (x + y); }
	
	public int Addition(int x, int y, int z) { //Taking three parameters
		return (x + y + z); }
	
	public double sum(double x, double y) { //Taking two double parameters
		return (x+y); }
	
	public static void main(String args[]) {
		Addition a = new Addition();
		System.out.println(a.Addition(5, 10));
		System.out.println(a.Addition(5, 10, 15));
		System.out.println(a.sum(5.5, 6.5));
	
		
	}

}
