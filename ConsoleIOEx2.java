import java.util.Scanner;
public class ConsoleIOEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s=sc.nextLine(); 
		System.out.println("Entered String: "+s);
		
		System.out.println("Enter a Integer:");
		int a=sc.nextInt();
		System.out.println("Entered Integer: "+a);
		
		System.out.println("Enter a Floating-Point:");
		double b=sc.nextDouble();
		System.out.println("Entered Floating-Point: "+b);
		
		sc.close();
		
		
	}

}