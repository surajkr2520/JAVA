import java.util.*;

public class medianofArray {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 1, 7 };
    Arrays.sort(arr);
    int n = arr.length;
    if (n % 2 != 0) {
      System.out.println(arr[n / 2]);
    } else {
      int ind1 = (n / 2) - 1;
      int ind2 = n / 2;
      double result = (double) (arr[ind1] + arr[ind2]) / 2;
      System.out.println(result);
    }
  }

}
