import java.io.IOException;

public class ConsoleIOEx1 {

	public static void main(String[] args) {
		try {
			System.out.println("Enter a character!");
			int a=System.in.read();
			System.out.println("Entered Character: "+ (char)a);
		}catch (IOException e) {
			System.out.println(e);
		}
	}

}