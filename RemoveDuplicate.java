package Array;
import java.util.HashMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {2,4,5,3,2,7,4,5,9};
		HashMap <Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!mp.containsKey(arr[i]))
			{
				System.out.println(arr[i]+" ");
			}
			mp.put(arr[i],1);
		}


	}

}
