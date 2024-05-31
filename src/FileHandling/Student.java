package FileHandling;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	String name;
	int std, rno;
	public Student(String name, int std, int rno) {
		
		this.name = name;
		this.std = std;
		this.rno = rno;
	}
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollnumber:");
		rno=sc.nextInt();
		System.out.println("Enter standard:");
		std=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
		
	}
	void display()
	{
		System.out.println(rno+" "+name+" "+std);
	}
}
