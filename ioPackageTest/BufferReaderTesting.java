package ioPackageTest;
import java.io.*;
public class BufferReaderTesting {
	public static void main(String args[]) throws IOException 
	{ 
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String name;
//		int age;
//		System.out.println("Enter your name");
//		name =br.readLine();
//		System.out.println("Enter your age");
//		age = br.read();
//		System.out.println(name+":"+age);
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/OneDrive/Documents/Test file/data.txt"));
		String line;
		while ((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
	}

}
