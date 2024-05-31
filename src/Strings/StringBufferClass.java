package Strings;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("String Buffer");
		System.out.println("original string: "+sb);
		sb.append(" is a part of string concept");
		System.out.println(sb);
		
		System.out.println();
		String s="String";
		s.concat("is a part of java");
		System.out.println(s);
	}
}
