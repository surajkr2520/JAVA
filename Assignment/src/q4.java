import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//StringBuilder s=new StringBuilder("hello");
		
		
		
//		int p=s.capacity();
//		int q=s.length();
//		StringBuilder r=s.reverse();
//		
//		System.out.println(p);
//		System.out.println(q);
//		System.out.println(r);
		 int a=sc.nextInt();
		 int b=3;
		 int result=0;
		 while(b>0)
		 {
			if((b&1)==1)
			{
				result=result+a;
				a=a<<1;
				b=b>>1;
			}
			
		 }
		 System.out.println(result);

	}

}
