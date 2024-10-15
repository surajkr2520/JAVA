package Problem8;

public class p8 {

	public static void main(String[] args) {
		int arr[] = {4,5,7,2,15,20};
		int m = 6;
		int count=0;
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] % 5==0)
			{
				count++;
			}
			else if(arr[i]<=m)
			{
				count++;
				m-=arr[i];
			}
		}
		System.out.println(count);

	}

}
