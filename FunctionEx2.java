
public class FunctionEx2 {
	static void add(int a,int b) {
		int r=a+b;
		System.out.println("Sum: "+r);
	}
	public static void main(String[] args) {
		int x=9,b=8;
		add(x,b);
		add(x,45);
		add(8,7);
		add('a',7);
		//add(8,7.0);//error
		//add(7);//error
		//add();//error
		//add(7,5,6);//error
		add(7,0);
	}

}
