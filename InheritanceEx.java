
class A {
	int x=10;
	static int h=10;
	private int g=50;
	void m1() {
		System.out.println("Hello A");
	}
	void showG() {
		System.out.println(g);
	}
}
class B extends A{
	int y=20;
	void m2() {
		System.out.println("Hello B");
		System.out.println(x);
		//System.out.println(g);//error
		showG();
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		A a=new A();
		a.x=15;
		a.h=15;
		System.out.println(a.x);//15
		System.out.println(a.h);//15
		a.m1();
		B b=new B();
		System.out.println(b.x);//10
		System.out.println(b.h);//15
		//System.out.println(b.g);//error
		b.showG();
		System.out.println(b.y);
		b.m1();
		b.m2();
		
	}
}