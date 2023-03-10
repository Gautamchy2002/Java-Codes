
public class FindEvenOrOdd {
	static boolean findEvenOdd(int n) {
		boolean a;
		if(n%2==0) {
			a=true;
		}else {
			a=false;
		}
		return a;
		
//		if(n%2==0) {
//			return true;
//		}else {
//			return false;
//		}
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter a no.: ");
		int n=sc.nextInt();
		boolean r=findEvenOdd(n);
		if(r) {
			System.out.println(n+" is Even");
		}else {
			System.out.println(n+" is ODD");
		}
	}
}
