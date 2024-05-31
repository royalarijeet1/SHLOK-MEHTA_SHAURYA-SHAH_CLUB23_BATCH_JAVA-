package ExceptionalHandling;

public class ExceptionPropogation {
	
	static void p()
	{
		try {
			n();
		}catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
	static void n() {
		// TODO Auto-generated method stub
		m();
	}
	 static void m() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		ExceptionPropogation.p();
		System.out.println("normal flow");
	}
}
