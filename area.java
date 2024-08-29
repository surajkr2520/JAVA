package looseCoupling;

public class area {

	public static void main(String[] args) {
		rectangle r =new rectangle(6,5);
		System.out.println(r.Area);

	}

}
class rectangle{
	public int Area; 
	rectangle(int length, int breadth){
		this.Area =length*breadth;
		
	}
}
