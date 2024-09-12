//Problem Statement: Convert a binary number to an octal number


package numberSystem;

public class binaryToOctal {

	public static void main(String[] args) {
		String bin="11111";
		int n=bin.length();
		if(n%3==1) {
			bin="00"+bin;
			
		}
		else if(n%3==2) {
			bin="0"+bin;
		}
		String ans="";
		for(int i=0;i<n;i+=3) {
			int temp=(bin.charAt(i)-'0')*4+(bin.charAt(i+1)-'0')*2+(bin.charAt(i+2)-'0')*1;
			ans=ans+Integer.toString(temp);
		}
		System.out.println(ans);

	}

}
