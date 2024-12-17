package ioPackageTest;
import java.io.*;
public class FileOutPutStream {
	public static void main(String args[]) throws IOException 
	{
	FileOutputStream fos=new FileOutputStream("C:/Users/lenovo/OneDrive/Documents/Test file/data.txt",true);
	byte [] barr= {97,98,99,100,101};
	fos.write(barr,1,3);
	System.out.println("Finished");
	}

}
