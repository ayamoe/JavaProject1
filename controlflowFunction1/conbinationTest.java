package controlflowFunction1;

public class conbinationTest {
	public static int fact(int x)
	{
		int ans=1;
		int i=x;
		for(i=x;i>=1;i--)
		{
			ans*=i;
		}
		return ans;
	}
	public static int conbination(int n,int r)
	{
		return fact(n)/fact(n-r);
	}
	public static void main(String args[])
	{
		int fact=fact(5);
		System.out.println(""+fact);
		int con=conbination(3,2);
		System.out.println(""+con);
	}

}
