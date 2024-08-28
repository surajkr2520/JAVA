import java.util.ArrayList;
public class test {

	public static void main(String[] args) {
		ArrayList<String> L=new ArrayList();
		L.add("Sumraj");
		L.add("Pramtyush");
		L.add("Bimky");
		L.add("Natis");
		L.add("Anubhaba");
		for(int i=0;i<L.size();i++) 
		{
		String s=L.get(i);
		System.out.println(s.length());
		}

	}

}
