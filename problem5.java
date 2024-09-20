package Problem5;

public class problem5 {

	public static void main(String[] args) {
		int arr[]= {7,4,8,2,9};
		int count=1;
		int n=arr.length;
		
		for(int i=1;i<n;i++) 
		{
			boolean greater =true;
			for(int j=i-1; j>=0;j--) 
			{
				if(arr[j]>=arr[i])
				{
					greater=false;
					break;
				}
			}
			if(greater) {
				count++;
			}
		}
		
//		while(i>n)
//		{
//			int greater=1;
//			for(int j=i-1;j>=0;j--) {
//				if(arr[j]>=arr[i])
//				{
//					greater=0;
//					break;
//				}
//				if(greater==1 && i != 0) 
//				{
//					count++;
//				}
//			}
//			i++;
//		}
		System.out.println(count);

	}

}
