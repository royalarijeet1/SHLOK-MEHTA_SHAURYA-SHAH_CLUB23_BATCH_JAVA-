package ExceptionalHandling;

public class NestedTryBlock {
	public static void main(String[] args) {
		try {
			try
			{
				System.out.println("outside index range");
				int a[]=new int[5];
				a[5]=4;
				try
				{
					System.out.println("going to divide by zero");
					int b=12/0;
				}catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			}catch(NullPointerException e)
			{
				System.out.println(e);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
