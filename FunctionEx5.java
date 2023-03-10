
public class FunctionEx5 {
	static void add(int a,int b) {
		int r=a+b;
		if(r>100) {
			return;
		}
		System.out.println("Sum: "+r);
	}
	public static void main(String[] args) {
		add(65,48);
		add(5,48);
	}
}
