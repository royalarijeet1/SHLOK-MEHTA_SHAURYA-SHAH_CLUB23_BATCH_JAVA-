package ExceptionalHandling;

public class TestApp1 {
	public static void main(String[] args) {
		int a=100,b=0;
		String s=null,t="123A";
		float f=12f;
		int arr[]= {1,2,3,4,6,10};
		
		System.out.println("1st statement");
		System.out.println("2st statement");
		//System.out.println( a/b);  //arithmetic
		System.out.println(s);
		//System.out.println(s.concat("a"));  //null pointer
		//int i=Integer.parseInt(t);    //NUMBERFORMAT EXCEPTION
		//System.out.println(arr[6]);   //arrayIndexOutOfBound
		System.out.println("2nd Last statement");
		System.out.println("last statement");
	}
}
