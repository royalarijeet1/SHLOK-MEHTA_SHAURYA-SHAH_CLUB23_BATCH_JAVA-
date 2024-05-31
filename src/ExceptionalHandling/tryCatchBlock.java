package ExceptionalHandling;

public class tryCatchBlock {
	public static void main(String[] args) {
		try
		{
		
		String s=null;
		int[] a=new int[4];
		System.out.println(a[6]);
		System.out.println(10/0);
		System.out.println(s.charAt(0));
		System.out.println("inside try block lines");
		}
		catch(ArithmeticException e)
		{
			System.out.println("number must not be divided by zero");
		}catch(NullPointerException e)
		{
			System.out.println("string should not be null");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("rest of the lines");
	}
}
