//Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.
package String;

public class countInString {

	public static void main(String[] args) {
		String str="Take u forward is Awesome";
		int length=str.length();
		str=str.toLowerCase();
		int vowel = 0;int consonant=0;int whitespace=0;
		for(int i=0; i<length;i++) {
			char ch= str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowel++;
				
			}
			else if(ch>='a'&&ch<='z') {
				consonant++;
			}
			else if(ch==' ') {
				whitespace++;
			}
		}
		System.out.println( "Vowels: "+vowel);
		System.out.println("Consonant: "+consonant);
		System.out.println("whitespace: "+whitespace);

	}

}
