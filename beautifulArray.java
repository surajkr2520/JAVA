package tcs;

import java.util.Scanner;

public class beautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input validation to ensure N is positive
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;  // Exit if invalid array size
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int ascSwaps = countSwaps(arr, true);
        int descSwaps = countSwaps(arr, false);

        System.out.println(Math.min(ascSwaps, descSwaps));
        sc.close();
    }

    private static int countSwaps(int[] arr, boolean isAscending) {
        int swaps = 0;
        int[] tempArr = arr.clone();  // Make a copy to avoid modifying the original array

        // Perform Bubble Sort and count swaps
        for (int i = 0; i < tempArr.length - 1; i++) {
            for (int j = 0; j < tempArr.length - i - 1; j++) {
                // Check based on ascending or descending order
                if ((isAscending && tempArr[j] > tempArr[j + 1]) || 
                    (!isAscending && tempArr[j] < tempArr[j + 1])) {
                    swaps++;
                    // Swap elements
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                }
            }
        }

        return swaps;
    }
}