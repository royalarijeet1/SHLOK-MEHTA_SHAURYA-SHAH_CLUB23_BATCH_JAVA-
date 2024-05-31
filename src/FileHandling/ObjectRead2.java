package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead2 {
	public static void main(String[] args) {
		try {
			ObjectInputStream oin=new ObjectInputStream(new FileInputStream("text4.txt"));
			
			try {
				Student s[]=(Student[]) oin.readObject();
				for(int i=0;i<s.length;i++)
				{
					s[i].display();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
