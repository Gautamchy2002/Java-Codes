class Student{
	private int age;
	public void setAge(int a) {
		if(a>0) {
			age=a;
		}else {
//			ArithmeticException a=new ArithmeticException("Invalid Age");
//			throw a;
			
			//or
			
			throw new ArithmeticException("Invalid Age");
		}
	}
	public int getAge() {
		return age;
	}
}
public class ExceptionHandlingEx13 {
	public static void main(String[] args) {
		try {
			Student s=new Student();
			s.setAge(-12);
			System.out.println("Your age: "+s.getAge());
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}