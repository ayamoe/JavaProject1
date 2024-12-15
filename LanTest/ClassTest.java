package LanTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ClassTest {
	public static void main(String args[])
	{
		Student2 st= new Student2(); 
		Class c=st.getClass(); 
//		Constructor[] carr=c.getConstructors();
//		for(Constructor con:carr)
//		{
//			Parameter parr[]=con.getParameters();
//			System.out.println(parr.length+"parameters");
//		}
		Field farr[]=c.getDeclaredFields();
	 	for(Field f:farr)
		{
			System.out.println(f.getModifiers()+":"+f.getName()+":"+f.getType());
		}
		Method marr[]=c.getDeclaredMethods();
		for(Method m:marr)
		{
			System.out.println(m.getModifiers()+";"+m.getReturnType()+":"+m.getName());
			Parameter p[]=m.getParameters();
			for(Parameter par:p)
			{
				System.out.println(par.getType());
			}
		}
	}

}
