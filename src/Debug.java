

public class Debug 

{
	
	static int i=0;
	
	public static void print()
	{
		i++;
		
		System.out.println(i);
	}
	
	
	public static void main(String a[])
	{
	
		
		System.out.println("vino start");
		
		for(int m=0;m<5;m++) print();
		
		
	}
}