
public class greatestamong3numbers {

	public static void main(String[] args) {
java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter the number in a: ");
		int a=sc.nextInt();
		System.out.println("Enter the number in b: ");
		int b=sc.nextInt();
		System.out.println("Enter the number in c: ");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else 
			System.out.println("c is greater");
	}

}
