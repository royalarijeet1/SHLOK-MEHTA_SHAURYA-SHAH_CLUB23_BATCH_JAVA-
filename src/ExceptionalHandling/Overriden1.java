package ExceptionalHandling;

import java.sql.SQLException;

//if superclass doesnt throw exception
public class Overriden1  extends Parent1{
	static void msg() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("text exception");
	}
	
	
	public static void main(String[] args) {
		Overriden1.msg();
	}
}
