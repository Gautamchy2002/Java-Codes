import java.io.*;
import java.util.Scanner;
public class FileIOEx10 {

	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("D:\\JavaCodes\\abc.txt");
			PrintStream p=new PrintStream(f);
			PrintStream pp=System.out;
			
			String s="hello INCAPP";
			p.println(s);
			
			System.out.println(s);
			System.setOut(p);
			System.out.println(s);
			System.out.println(78);
			System.setOut(pp);
			System.out.println(78);
			p.close();
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}