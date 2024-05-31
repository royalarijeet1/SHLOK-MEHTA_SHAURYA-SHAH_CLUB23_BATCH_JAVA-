package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		try {
			FileReader fr=new FileReader("text2.txt");
			int i;
			try {
				while((i=fr.read())!=-1)
				{
					sb.append((char)i);
				}
				fr.close();
			System.out.println("FinalString by FileWriter: "+sb);		
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
