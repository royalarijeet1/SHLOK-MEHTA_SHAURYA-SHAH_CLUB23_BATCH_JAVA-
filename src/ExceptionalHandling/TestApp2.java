package ExceptionalHandling;

import java.util.Scanner;

public class TestApp2 {
	
	public static void main(String[] args) {
		
			
				
					TestApp2.eligibletovote();
				
			
		
	}

	public static void eligibletovote()  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age for voting:");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			throw new InvalidAgeException("Invalid age!!!\n please enter the age above 18");
		}
	}
}
