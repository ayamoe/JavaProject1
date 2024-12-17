package ioPackageTest;
import java.io.*;
public class FileWriterTesting {
	public static void main(String args[]) throws IOException
	{
		FileWriter fw=new FileWriter("C:/Users/lenovo/OneDrive/Documents/Test file/myFile.txt",true);
		fw.write("\nWelcome to FIleWriter");
		fw.close();
	}

}
