public class checkPalindrome {
  public static void main(String[] args) {
    int n = 442445;
    int revNum = 0;
    int duplicate = n;

    while (n > 0) {
      int lastDigit = n % 10;
      revNum = (revNum * 10) + lastDigit;
      n = n / 10;

    }
    if (duplicate == revNum) {
      System.out.println("The number is palindrome");

    } else
      System.out.println("The number is not Palindrome");

  }

}
