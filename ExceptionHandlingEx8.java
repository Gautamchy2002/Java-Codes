public class ExceptionHandlingEx8 {

	public static void main(String[] args) {
		try {
			String s="56vmghf";
			int a=Integer.parseInt(s);
			System.out.println(a);
		}catch (NumberFormatException ex) {
			System.out.println(ex);
		}
	}

}