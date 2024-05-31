package Strings;

public class StringFunctions {
	
	public static void containsFunction() {
		// TODO Auto-generated method stub
		String a="what do you know about us";
		System.out.println(a.contains("do you"));
		System.out.println(a.contains("Do you"));
		System.out.println(a.contains("doyou")); //false
		System.out.println(a.contains(" "));
		System.out.println(a.contains("  "));//false because 2 spaces 
	}
	
	
	
	
	static void substrFunction()
	{
		String a="Shlok Mehta";
		System.out.println(a.substring(1, 7));  //from 1st to 6th
		System.out.println(a.substring(2));  //by default till last
		//System.out.println(a.substring(1,a.length()+1)); //give exception
		
	}
	static void formatFunction()
	{
		String a="shlok";
		String b="student";
		
		String sf1=String.format("name is %s. He is a %s", a,b);
		System.out.println(sf1);
		String sf2=String.format("value is %d", 32);
		System.out.println(sf2);
		String sf3=String.format("value is %f", 22.0);
		System.out.println(sf3);
	}
	
	
	
	
	static void charAtFunction()
	{
		String a="string";
		System.out.println("character at position 3: "+a.charAt(2));
		System.out.println("character at position 6: "+a.charAt(5));
		System.out.println("character at LAST position: "+a.charAt(a.length()-1));
	}
	
	static void lengthFunction()
	{
		String a="shlok",b=null,c="";
		System.out.println("length of "+a+" is: "+a.length());
//		System.out.println("length of String b is: "+b.length());  //prints exception
		System.out.println("length of String c is: "+c.length()); 
	}




	public static void joinFunction() {
		// TODO Auto-generated method stub
		String js=String.join("-","welcome","to","royal");
		System.out.println(js);
		String js1=String.join("/","28","05","2024");
		System.out.println(js1);
//		String js3=String.join(null,"28","05","2024"); exception
//		System.out.println(js3);
		String js4=String.join(" ",null,"welcome","to","royal");
		System.out.println(js4);
		String js5=String.join("",null,"welcome","to","royal");
		System.out.println(js5);
	}




	public static void equalsFunction() {
		// TODO Auto-generated method stub
		String a="string";
		String b="string";
		String c="STRING";
		String d=new String("string");
		Character e=new Character('s');
		String f="s";
		String g="false";
		Boolean h=false;
		
		System.out.println("a.equals(b) :"+"  "+a.equals(b));
		System.out.println("(a==b) :"+"  "+(a==b));
		System.out.println("a.equals(c) :"+"  "+a.equals(c));
		System.out.println("(a==c) :"+"  "+(a==c));
		System.out.println("a.equals(d) :"+"  "+a.equals(d));
		System.out.println("(a==d) :"+"  "+(a==d));
		System.out.println("e.equals(f) :"+"  "+e.toString().equals(f));
		System.out.println("(e==f) :"+"  "+(e.toString()==f));
		System.out.println("g.equals(h) :"+"  "+g.equals(h.toString()));
		System.out.println("(g==h) :"+"  "+(g==f.toString()));
		
		
	}




	public static void equalsIgnoreCaseFunction() {
		// TODO Auto-generated method stub
		String a="string";
		String b="STRING";
		
		System.out.println("a.equals(b): "+a.equalsIgnoreCase(b));
		System.out.println("a===b : "+(a==b));
	}




	public static void isEmptyFunction() {
		// TODO Auto-generated method stub
		String a=" ",b="",c="string";
		String d=null;
		System.out.println(a.isEmpty());  //space is a character
		System.out.println(b.isEmpty());
		System.out.println(c.isEmpty());
//		System.out.println(d.isEmpty());  //null pointer exception
	}




	public static void concatFunction() {
		// TODO Auto-generated method stub
		String a="Java",b="is a",c="STRING";
		
		System.out.println(a.concat(c));
		System.out.println(a.concat(b).concat(c));
		
		System.out.println(a+" "+b+" "+c);
		
		System.out.println(1+"a");
		System.out.println(1+2+"a");
		System.out.println(1+(2+"a"));
		System.out.println("a"+1+2);
		System.out.println("a"+(1+2));
	}




	public static void replaceFunction() {
		// TODO Auto-generated method stub
		String a="Java is a programming language";
		System.out.println("Original String: "+a);
		String rs=a.replace('o', 'e');
		System.out.println(rs);
		
		String rs1=a.replace("is a", "was");
		
		System.out.println(rs1);
		
		String rs3=a.replace("z", "was");
		
		System.out.println(rs3);
	}




	public static void splitFunction() {
		// TODO Auto-generated method stub
		String a="Java is a programming language";
		String[] words=a.split(" ");
		System.out.println(words);
		
//		System.out.println("returning words:");
//		for(String w:words)
//		{
//			System.out.println(w);
//		}
		System.out.println();
		System.out.println("returning words1:");
		String[] words1=a.split(" ", 1);
		for(String w:words1)
		{
			System.out.println(w);
		}
		
		System.out.println();
		System.out.println("returning words2:");
		String[] words2=a.split(" ", 2);
		for(String w:words2)
		{
			System.out.println(w);
		}
		System.out.println();
		System.out.println("returning words3:");
		String[] words3=a.split(" ",3);
		for(String w:words3)
		{
			System.out.println(w);
		}
		System.out.println();
		System.out.println("returning words6:");
		String[] words6=a.split(" ",6);
		for(String w:words6)
		{
			System.out.println(w);
		}
		System.out.println(words6.length);
		
	}




	public static void indexOfFunction() {
		// TODO Auto-generated method stub
		String a="this is index of function";
		int index1=a.indexOf("is index");
		System.out.println("index1: "+index1);
		
		int index2=a.indexOf("is index for");
		System.out.println("index1: "+index2);   //-1 because this substring is not found 
		
		int index3=a.indexOf("i");
		System.out.println(a.indexOf("i",index3+1));
	}




	public static void toLowerCaseFunction() {
		// TODO Auto-generated method stub
		String a="jaVa is a pROGramminG LANGuagE";
		System.out.println("original String: "+a);
		System.out.println(a.toLowerCase());
	}




	public static void toUpperCaseFunction() {
		// TODO Auto-generated method stub
		String a="jaVa is a pROGramminG LANGuagE";
		System.out.println("original String: "+a);
		System.out.println(a.toUpperCase());
	}




	public static void trimFunction() {
		// TODO Auto-generated method stub
		String a="  java language ";
		System.out.println("original length: "+a.length());
		System.out.println("after using trim function: "+a.trim().length());
		
	}




	public static void valueOfFunction() {
		// TODO Auto-generated method stub
		char ch='a';
		long b=10l;
		String a=String.valueOf(ch);
		System.out.println(a);
		System.out.println("type of ch after using value of: "+a.getClass().getSimpleName());
		
		String c=String.valueOf(b);
		System.out.println(b);
		System.out.println("type of c after using value of: "+((Object) c).getClass().getSimpleName());
		char d='d';
		System.out.println(d+b);
	}




	public static void internFunction() {
		// TODO Auto-generated method stub
			String a=new String("Java");
			String b=new String("Java");
			String c=a.intern();
			String d="Java";
			String e=b.intern();
			
			System.out.println(a==b);
			System.out.println(c==d);
			System.out.println(c==e);
	}
	
	
	
}
