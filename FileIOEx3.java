import java.util.Scanner;
import java.io.*;
public class FileIOEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			FileOutputStream f=new FileOutputStream("D:\\JavaCodes\\abc.txt"); 
			
			String s;
			do {
				System.out.println("Enter a String:");
				s=sc.nextLine();
				byte b[]=s.getBytes();
				f.write(b);
				f.write('\n');
			}while(!s.equalsIgnoreCase("stop"));
			
			sc.close();
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}