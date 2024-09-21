package Problem6;

public class problem6 {

	public static void main(String[] args) {
		int N = 5244;
		int res=1;
		while(N>0)
		{
			int digit=N%10;
			res*=digit;
			N/=10;
		}
		System.out.println(res);

	}

}
