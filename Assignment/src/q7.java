import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Name: ");
	    String x = sc.nextLine();
	    System.out.println("Date of birth: DD MM YYYY");
	    String str = sc.nextLine();
	    x = x.substring(0, 2);
	    String[] string_array = str.split(" ");
	    
	    System.out.println(x + string_array[1]);
	    sc.close();


	}

}
