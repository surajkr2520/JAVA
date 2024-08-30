
public class Main {
  static void countFreq(int arr[], int n) {
    boolean visited[] = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (visited[i] == true)
        continue;
      int count = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          visited[j] = true;
          count++;
        }
      }
      System.out.println(arr[i] + " " + count);
    }
  }

  public static void main(String[] args) {
    int n = 5;
    int array[] = { 5, 3, 5, 2, 2 };
    countFreq(array, n);
  }
}