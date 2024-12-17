package controlflowFunction1;

public class fibonacciTest {
	public static void main(String args[])
	{
		int f=1,s=2,c=20;
		int i=0;
		while(i<c)
		{
		   i=f+s;
		   f=s;
		   s=i;
		   System.out.println(""+i);
		   
		}
//		System.out.println(""+i);
	}
/*	public static int fibo(int a,int b,int g)
	
	{
		int f=a,s=b;
		int i=a;
		while(i<=g)
		{
			i=f+s;
			f=s;
			s=i;
		}
		return i;
	}
	public static void mian(String args[])
	{
		int ans=fibo(1,2,20);
		System.out.println(""+ans);
	}*/

}
