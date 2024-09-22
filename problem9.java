package Problem9;

public class problem9 {

	public static void main(String[] args) {
		int N = 1234;
		int R = 2;
		int sum = 0;
		while(N>0)
		{
			sum +=( N % 10);
			N/=10;
		}
		int res=R * sum;
		int result = 0;
		while(res>0)
		{
			result +=(res%10);
			res/=10;
		}
		System.out.println(result);
	}

}
