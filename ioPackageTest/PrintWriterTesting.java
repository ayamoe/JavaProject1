package ioPackageTest;
import java.io.*;
public class PrintWriterTesting {
	public static void main(String args[]) throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter("data/one.txt");
		pw.println("hello");
		pw.print(true);
		pw.println(2);
		pw.close();
	}

}
