//Problem Statement: Given a String, write a program to remove vowels from a given String.


package String;

public class removeVowel {

	public static void main(String[] args) {
		String str="take u forward";
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				str = str.substring(0,i)+str.substring(i+1);
			}
		}
		System.out.println(str);

	}

}