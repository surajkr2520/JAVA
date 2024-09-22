package Problem8;

public class problem8 {

	public static void main(String[] args) {
		int member = 4;
		int N = member-1;
		if(member<2 || member>50)
		{
			System.out.println("Invalid number of members");
		}
		int res=2;
		for(int i=1; i<=N;i++)
		{
			res*=i;
		}
		System.out.println(res);
		
		
		

	}

}
