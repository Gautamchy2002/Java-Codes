import java.util.Scanner;
import java.io.*;
public class FileIOEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		sc.close();
		byte b[]=s.getBytes();
		
		try {
			//Byte Stream
//			FileOutputStream f=new FileOutputStream("D:\\JavaCodes\\abc.txt");//write mode
			FileOutputStream f=new FileOutputStream("D:\\JavaCodes\\abc.txt",true);//append mode
			f.write('\n');
			f.write(b);
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}