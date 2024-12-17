package controlflowFunction1;

public class prinenumber {
	public static boolean isPrime(int n)
	{
		int div =2;
		while(n%div>0)
		{
			div++;
		}
		return(div==n);
	
	}
	public static void main(String args[])
	{
	//	boolean p=isPrime(7);
		if (isPrime(23))
		{
		System.out.println("is prime");
		}
		else
		System.out.println("not prime");
	}

}
