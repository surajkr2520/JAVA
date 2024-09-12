package String;
//import java.util.*;
import java.util.Stack;
public class reverseString {

	public static void main(String[] args) {
		String str="HELLO";
		Stack <Character>s = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			s.push(ch);
		}
		int i=0;
		String str1="";
		while(!s.isEmpty())
		{
			str1=str1+s.pop();		}
		
		System.out.println(str1);
		

	}
	

}
