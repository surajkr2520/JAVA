//Day 02 - 14.10.2024 - Problem Statment 
//
//Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
//
//Note : 1st element of the array should be considered in the count of the result.
//
//For example:
//
//Arr[]={7,4,8,2,9}
//
//As 7 is the first element, it will consider in the result.
//
//8 and 9 are also the elements that are greater than all of its previous elements.
//
//Since total of  3 elements is present in the array that meets the condition.
//
//Hence the output = 3.
//
//Example 1:
//
//Input 
//
//5 -> Value of N, represents size of Arr
//7-> Value of Arr[0]
//4 -> Value of Arr[1]
//8-> Value of Arr[2]
//2-> Value of Arr[3]
//9-> Value of Arr[4]
//
//Output :
//3
//
//Example 2:
//
//5   -> Value of N, represents size of Arr
//3  -> Value of Arr[0]
//4 -> Value of Arr[1]
//5 -> Value of Arr[2]
//8 -> Value of Arr[3]
//9 -> Value of Arr[4]
//
//Output :
// 
//5
import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int N = sc.nextInt();
        
        // Input the elements of the array
        int[] Arr = new int[N];
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }
        
        // Initialize count to 1, because the first element is always counted
        int count = 1;
        int max = Arr[0];  // The first element is the initial max
        
        // Loop through the array starting from the second element
        for (int i = 1; i < N; i++) {
            if (Arr[i] > max) {
                count++;
                max = Arr[i];  // Update max to the current element
            }
        }
        
        // Output the result
        System.out.println(count);
    }
}