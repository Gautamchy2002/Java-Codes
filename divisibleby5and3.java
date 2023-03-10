
public class divisibleby5and3 
{

	public static void main(String[] args) 
	{
java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		if( a%3==0 && a%5==0)
		{
			System.out.println("The given number is divisible by both");
		}
		else 
			System.out.println("The given number is not divisible by both");

	}

}
