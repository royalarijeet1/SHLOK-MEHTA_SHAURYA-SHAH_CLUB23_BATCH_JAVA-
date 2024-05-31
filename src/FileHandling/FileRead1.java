package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		int i=0;
		try {
			FileInputStream fin=new FileInputStream("test1.txt");
			try {
				while((i=fin.read())!=-1)
				{
					sb.append((char)i);
				}
				fin.close();
				System.out.println("Final String: "+sb);
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
