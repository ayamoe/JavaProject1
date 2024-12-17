package controlflowFunction1;
//output 1-1/2+1/3-1/4+1/5
public class fibonacciTest1 {
/*	public static float harmonic(int a)
	{
		float ft=1.f;
		int i=2;
		while(i<=a)
		{
			ft=1.f/i;
			i++;
			System.out.print("harmonic series"ft+"+");
		}
		return ft;
	}*/
	public static float sum(int a)
	{
		float sum=0;
		int count=1;      // for convert to sign(+-)
		float ft=0;
		int i=1;
		while(i<=a)
		{
			ft=1.f/i;
			i++;
			count++;
			if(count%2==0)
			{
				sum=sum+ft;
				
				System.out.print(ft+"-");
			}
			else
			{
			    sum=ft-sum;
			    System.out.print(ft+"+");
			}
			
		}
		return sum;
	}
	
	public static void main(String args[])
	{
	//	float h=harmonic(5);
		float f=sum(5);
		System.out.println("the sum of total="+f);
	}

}
