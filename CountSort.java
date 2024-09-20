//count sort
package sorting;
import java.util.*;
public class CountSort {

	public static void main(String[] args) {
		int arr[]= {1,2,0,1,2};
		int n=arr.length;
		int countArray[]= {0,0,0};
		for(int i=0;i<n;i++) {
			countArray[arr[i]]++;
		}
		
		int countIndex=0;
		for(int i=0;i<n;i++) {
			if(countArray[countIndex]!=0) {
				arr[i]=countIndex;
				countArray[countIndex]--;
			}
			if(countArray[countIndex]==0) {
				
				countIndex++;
			}
		}
		for(int j=0;j<n;j++) {
		System.out.println(arr[j]);
		}


	}

}
