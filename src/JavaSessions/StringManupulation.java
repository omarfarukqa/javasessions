package JavaSessions;

public class StringManupulation {

	public static void main(String[] args) {
		
		
		String str = "This is my java code that I have written";
		System.out.println(str.length());
		
		System.out.println("Li=" + 0);
		System.out.println("Len =" + str.length());
		System.out.println("hi =" +(str.length() -1));
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(39));
		//System.out.println(str.charAt(40)); //StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('j', str.indexOf('i') +1));
		
		String messg = "product macbook has been added to card";
		if (messg.indexOf("macbook") != -1) {
			System.out.println("pass");
		}
		else {
			System.out.println("FAIL");
		}
		
		//trim:
		String s1 = "              hello world       ";
		System.out.println(s1.trim().replace(" ", ""));
		
		//Replace 
		String dob = "01-01-20121";
		System.out.println(dob.replace("-", "/"));
		
		//uppercase and lowercase
		String s2 = "I have automation Engineer";
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		
		

	}

}
