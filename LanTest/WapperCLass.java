package LanTest;
public class WapperCLass {

	public static void main(String[] args) {
		String s="192.168.10.2";
		String arr[]=s.split("\\.");
		for(String part:arr)
		{
			System.out.println(part);
		}
//		String s="08-07-2025";
//		String arr[]=s.split("-");
//		System.out.println(arr.length);
//		for(String part:arr)
//		{
//			System.out.println(part);
//		}
//        String no=String.format("%.3f",300.12453678); 
//        System.out.println(no);

	}

}
