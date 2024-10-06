package Problem2;

public class p2 {
	static void veichcleProduction(int v, int w)
	{
		int fw=(w-2*v)/2;
		int tw=v-fw;
		System.out.println(fw);
		System.out.println(tw);
	}

	public static void main(String[] args) {
		veichcleProduction(200,540);

	}

}
