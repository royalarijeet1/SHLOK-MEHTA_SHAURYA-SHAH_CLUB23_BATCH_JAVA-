package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite2 {
	public static void main(String[] args) {
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			s[i].scan();
		}
		try {
			FileOutputStream fout=new FileOutputStream("text4.txt");
			try {
				ObjectOutputStream obj=new ObjectOutputStream(fout);
				obj.writeObject(s);
				obj.close();
				fout.close();
				System.out.println("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
