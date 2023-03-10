import java.util.Scanner;
import java.io.*;
public class FileIOEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		sc.close();
		
		try {
			//Character Stream
			FileWriter f=new FileWriter("D:\\JavaCodes\\abc.txt"); //write mode
			//FileWriter f=new FileWriter("D:\JavaCodes\\abc.txt",true); //append mode
			f.write(c);
			//f.write(s);//allowed
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}