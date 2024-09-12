//Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.


package String;
public class removeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Take @ u forward is $Awesome.";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int ascii=ch;
			
			if(ascii>=65 && ascii<=90 || ascii>=97 &&ascii<=122) {
				sb.append(ch);
			}
		}
		//sb.toString();
		System.out.println(sb);

	}

}
