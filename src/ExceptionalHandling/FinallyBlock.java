package ExceptionalHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		try
		{
//			String s=null;
//			s.length();
			System.out.println("Here the execution starts");
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}finally
		{
			System.out.println("finally block is executed");
		}
		System.out.println("rest of the code");
	}
}
