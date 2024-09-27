//Red Pen Green Pen Problem statement :
//
//You are a teacher creating an engaging math activity for your students by writing N numbers on the classroom 
//whiteboard.You use a green pen for odd numbers and a red pen for even numbers.Your task is to find and return 
//an integer value representing the number of times you need to switch from the green pen to the red pen while 
//writing these numbers.
//Sample Input 01 :
//sample input : [1,2,3,4,5]
//sample output : 4
//Sample Input 02
//sample input : [1,2,1,2,3]
//sample output : 3
import java .util.*;
public class Problem {
	public static int countSwitch(int[]arr, int n)
	{
		if(n==0 || n==1)
		{
			System.out.println("No Switch");
			return 0;
		}
		else
		{
			int res=0;
			for(int i=0;i<arr.length-1;i++)
			{
				if((arr[i]%2!=0 && arr[i+1]%2==0) || (arr[i]%2!=0 && arr[i+1]%2==0))
				res++;
			}
			return res;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N= sc.nextInt();
		int []arrr=new int[N];
		for(int i=0;i<N;i++)
		{
			arrr[i]=sc.nextInt();
		}
		System.out.println(countSwitch(arrr,N));

	}

}
