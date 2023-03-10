
public class FunctionEx7 {
	static double si() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter Principle Amount: ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate Of Interest: ");
		double r=sc.nextDouble();
		System.out.println("Enter Time Period: ");
		int t=sc.nextInt();
		
		return p*r*t/100;
	}
	public static void main(String[] args) {
		double result=si();
		System.out.println("Simple Interest: "+result);
	}
}
