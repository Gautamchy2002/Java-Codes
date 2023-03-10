class A{
	//members
}
class B extends A{
	//members
}
public class ExceptionHandlingEx10 {

	public static void main(String[] args) {
		try {
			A a=new A();
			B b=(B)a;
		}catch (ClassCastException ex) {
			System.out.println(ex);
		}
	}

}