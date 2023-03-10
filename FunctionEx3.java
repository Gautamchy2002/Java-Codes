
public class FunctionEx3 {
	static int add() {
		int a=10, b=20;
		int r=a+b;
		return r;
		//return (r); //allowed
		//return 5;   //allowed
		//System.out.println("bye");//error
	}
	public static void main(String[] args) {
		int result=add();
		System.out.println("Sum: "+result);
	}
}
