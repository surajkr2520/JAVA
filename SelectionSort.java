package sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		int arr1[]= {5,2,7,3,8};
		int n=arr1.length;
		for (int i=0;i<n;i++) {
			int min=i;
			for(int j=i;j<n-1;j++) {
				if(arr1[j]<arr1[min]) {
					
					min=j;
					
				}
				int temp=arr1[min];
				arr1[min]=arr1[i];
				arr1[i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}

	}

}
