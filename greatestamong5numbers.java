
public class greatestamong5numbers 
{

	public static void main(String[] args) 
	{
java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter the number in a: ");
		int a=sc.nextInt();
		System.out.println("Enter the number in b: ");
		int b=sc.nextInt();
		System.out.println("Enter the number in c: ");
		int c=sc.nextInt();
		System.out.println("Enter the number in d: ");
		int d=sc.nextInt();
		System.out.println("Enter the number in e: ");
		int e=sc.nextInt();
		if (a>b && a>c && a>d && a>e)
		{
			System.out.println("a is greater");
		}
		else if (b>c && b>d && b>e)
		{
			System.out.println(" b is greater");
		}
		else if (c>d && c>e)
		{
			System.out.println("c is greater");
		}
		else if(d>e)
		{
			System.out.println("d is greater");
		}
		else 
		{
			System.out.println("e is greater");
		}

	}

}
