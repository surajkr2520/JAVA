package numberSystem;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=371;
		int digitCount=0;
		int m=n;
		
		while(m!=0)
		{
			m/=10;
			digitCount++;
		}
		
		int dup=n;
		double sum=0;
		while(n>0)
		{
			int ld=n%10;
			sum+=Math.pow(ld,digitCount);
			n/=10;
			
		}
		
		if(dup==sum) {
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}

	}

}
