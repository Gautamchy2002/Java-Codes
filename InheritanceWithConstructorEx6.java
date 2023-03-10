package Inheritancewithconstructor;

class MMM{  //class MMM extends Object{
	int a=10;
	MMM(int x) { 
		a=x;
		System.out.println("Hello M");
	}
	MMM() { //super();
		System.out.println("Hi M");
	}
}
class NNN extends MMM {
	int b=20;
	NNN() {  
		System.out.println("Hi N");
	}
	NNN(int y) { //super(y);
		b=y;
		System.out.println("Hello N");
	}
}
public class InheritanceWithConstructorEx6 {
	public static void main(String[] args) {
		NNN n=new NNN(5);
		System.out.println(n.a+" "+n.b);
	}
}
