public class palindromeinSeries {
  public static void main(String[] args) {
    int m = 10;
    int n = 50;
    for (iint i = m; i <= n; i++) {
      int revnumber = 0;
      int dup = i;
      while (i > 0) {
        int lastDigit = i % 10;
        revnumber = (revnumber * 10) + lastDigit;
        i = i / 10;
      }
      if (revnumber == dup)
        System.out.println(i);
    }
  }

}