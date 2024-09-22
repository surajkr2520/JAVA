package Problem10;
import java.util.Scanner;
public class problem10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cars");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter car numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter date");
		int d = sc.nextInt();
		System.out.println("Enter fine amount");
		int f = sc.nextInt();
		int totalFine=0;
		for(int i=0;i<arr.length;i++)
		{
			if(d%2==0)
			{
				if(arr[i]%2!=0)
				{
					totalFine+=f;
				}
			}
			else if(d%2!=0)
			{
				if(arr[i]%2==0)
				{
					totalFine+=f;
				}
			}
		}
		System.out.println("Your total fine is : "+totalFine);
	}

}
