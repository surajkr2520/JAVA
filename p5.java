//You are required to implement the following function, Int Calculate(int m, int n);
//The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive and return the same.
package Problem5;
import java.util.*;
public class p5 {
	static int Calculate(int m, int n)
	{
		int sum = 0;
		for(int i=m;i<=n;i++)
		{
			if((i%3==0) && (i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Calculate(100,160));
	}

}
