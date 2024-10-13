//Day - 01 Problem statement - ( 13.10.2024 )
//
//Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
//
//For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
//[Assume the number of inputs should be always 4 ]
//
//Sample Input 1:
//
//Enter the digits:
//65
//66
//67
//68
//Sample Output 1:
//
//65-A
//66-B
//67-C
//68-D
//
//Sample Input 2:
//
//Enter the digits:
//115
//116
//101
//112
//
//Sample Output 2:
//
//115-s
//116-t
//101-e
//112-p
import java.util.*;
public class d1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		int arr[]=new int[4];
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			char alphabet =(char)arr[i];
			System.out.println(arr[i]+"-"+alphabet);
		}

	}

}





















