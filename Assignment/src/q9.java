import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the column character: ");
		char c= sc.next().charAt(0);
		int x=c-'A'+1;
		System.out.println("Column "+c+" is encoded to  "+x);


	}

}
