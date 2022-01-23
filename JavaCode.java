public class JavaCode
{
	public static void main(String args[])
	{
		add(5,6);
		sub(15,6);
	}
	
	public static void add(int a, int b)
	{
		System.out.println("Sum is : "+(a+b));
	}
	
	public static void sub(int a, int b)
	{
		System.out.println("Sum is : "+(a-b));
	}
	
	
	
	class InnerClass
	{
		int c = 10;
		public void addInner(int a, int b)
		{
			System.out.println("Sum is : "+(c+a+b));
		}
	}
}