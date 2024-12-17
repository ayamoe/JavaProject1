package controlflowFunction1;

public class powerfunction {
	public static int calPower(int a,int b)
	{
		int p=1;
		int i=1;
	   for (i=1;i<=b;i++)
	   {
		    p=p*a;
		   
	   }
	   return p;
	}
	public static void main(String args[])
	{
		int ans=calPower(2,3);
		System.out.println(""+ans);
	}

}
