package ExceptionalHandling;

import java.io.IOException;
import java.sql.SQLException;

public class Overriden2 extends Parent2 {
	static void msg() throws ArithmeticException
	{
		System.out.println("test exception");
	}
	
//	static void msg() throws Exception
//	{
//		System.out.println("test exception");
//	}
	
	public static void main(String[] args)    {
		
	}
}
