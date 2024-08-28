import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		
		int x=sc.nextInt();
		int count=0;
		while(x>0)
		{
			
			if((x&1)==1) 
			count++;
			x=x>>1;
		}
		if((count&1)==1) {
	System.out.println("odd");
	}
		else if((count&1)==0) {
			System.out.println("even");

	

}}}
