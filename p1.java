
package Problem1;
public class p1 {
	public static int minHouse(int rat, int unit, int[]house)
	{
		if(house.length ==0)
			return -1;
		int totalUnit = rat * unit;
		int count =0;
		int food=0;
		for(int i=0;i<house.length;i++)
		{
			food+=house[i];
			count++;
			if(i==house.length-1 && food<totalUnit)
				return 0;
			else if(food>=totalUnit)
				break;
		}
		return count;
		
	}

	public static void main(String[] args) {
		int arr[]={2,8,3,5,7,4,1,2};
		int n = minHouse(7,2,arr);
		System.out.println(n);

	}

}
