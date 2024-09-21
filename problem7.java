package Problem7;

public class problem7 {
	public static void main(String[]args) {
		String str = "abbabbbbbab";
		int l = 4;
		int maxCount=0;
		for(int i=0;i<str.length();i+=l)
		{
			int end = Math.min(i + l, str.length());
			String substr=str.substring(i,end);
			int countA=0;
			for(int j=0;j<substr.length();j++)
			{
				//char s=
				if(substr.charAt(j)=='a')
				{
					countA++;
				}
			}
			if(countA>maxCount)
			{
				maxCount=countA;
			}
		}
		System.out.println(maxCount);
	}

}
