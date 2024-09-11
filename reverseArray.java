public class reverseArray {
  static void printArray(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" " + arr[i]);
    }
  }

  static void reverse(int arr[], int n) {
    int arr1[] = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      arr1[n - i - 1] = arr[i];

    }
    printArray(arr1, n);
  }

  public static void main(String[] args) {
    int n = 5;
    int arr2[] = { 3, 2, 6, 1, 8 };
    reverse(arr2, n);
  }

