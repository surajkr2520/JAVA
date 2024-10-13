package Problem6;
import java.util.*;
public class p6 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int sum = 0;
		for(int i=arr.length-1;i>=0;i-=2)
		{
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
