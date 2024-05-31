package FileHandling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			FileWriter fw=new FileWriter("text2.txt");
			System.out.println("write a text you want to insert in a file: ");
			String s=sc.nextLine();
			fw.write(s);
			fw.close();
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
