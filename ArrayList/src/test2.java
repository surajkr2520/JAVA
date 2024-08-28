import java.util.ArrayList;
public class test2 {

	public static void main(String[] args) {
		ArrayList<Integer>L= new ArrayList();
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(40);
		L.add(50);
		int sum=0;
		for(int i=0;i<L.size();i++)
		{
			sum=sum+L.get(i);
		}
		System.out.println(sum);

	}

}
