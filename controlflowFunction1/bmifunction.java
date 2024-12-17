package controlflowFunction1;

public class bmifunction {
	public static float calbmi(int w,int h)
	{ 
		float wkg = w *  453/1000;
		float hm= h*305/1000;
		float bmi=wkg/(hm*hm);
		return bmi;
		
	}
	public static void main(String args[])
	{
		
		 float b=calbmi(100,60);
         System.out.println(b+"");
	}

}
