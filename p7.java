package Problem7;
import java.util.*;
public class p7 {
	static int maxMatch(String a, String b)
	{
		int count =0;
		int k=a.length()-1;
		int l=b.length()-1;
		while(k>= 0 && l >= 0)
		{
			if (a.charAt(k) != b.charAt(l)) {
                break;
            }
            count++;
            k--;
            l--;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str = sc.nextLine();
		HashMap <String,Integer>mp = new HashMap<>();
		
		String []arr = new String[5];
		System.out.println("Enter your Dictionary words");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			int m = maxMatch(str,arr[i]);
			mp.put(arr[i],m);
		}
		System.out.println("Best rhyming word is: "+Collections.max(mp.entrySet(), Map.Entry.comparingByValue()).getKey());

	}

}
