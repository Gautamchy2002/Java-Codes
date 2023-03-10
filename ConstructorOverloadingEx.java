
class Animal{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Animal(String n,int a){
		System.out.println("Hello Animal");
		name=n;
		age=a;
	}
	Animal(){
		System.out.println("Hi Animal");
	}
	Animal(String n){
		System.out.println("Ok Animal");
		name=n;
	}
}
public class ConstructorOverloadingEx {
	public static void main(String[] args) {
		Animal a1=new Animal("Gogo",45);
		Animal a2=new Animal();
		Animal a3=new Animal("Jojo",12);
		Animal a4=new Animal("KK");
		a1.show();
		a2.show();
		a3.show();
		a4.show();
	}
}
