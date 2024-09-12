//Problem Statement: Given a string, write a program to remove all the whitespaces from the string.
package String;

public class removeSpace {

	public static void main(String[] args) {
		String str = "Take you forward";
		for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch==' ') {
			str=str.substring(0,i)+str.substring(i+1);
		}
		}
		System.out.println(str);
		
	}

}
