public class AvgofArray {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 1, 4 };
    int n = arr.length;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

    }
    System.out.println(sum / n);
  }
}
