package IfExample;

public class IfEx1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		if(age>=10 && age<=16) {
			System.out.println("You are Teenager.");
		}
		System.out.println("Thanks for using App.");
	}
}
