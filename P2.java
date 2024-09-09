import java.util.*;
public class P2 {

	public static void main(String[] args) {
		int num=9;
		int n = num;
		
		List <Integer>L1= new ArrayList<Integer>();
		while(n!=0) {
			L1.add(n%2);
			n=n/2;
		}
		int res=0;
		//Collections.reverse(L1);
		//StringBuilder binaryString = new StringBuilder();
        for (int i=0; i<L1.size();i++) {
            if(L1.get(i)==0) {
            	res= (int)(res+Math.pow(2, i));
            }
        }
        System.out.println(res);
		
		//System.out.println("Binary of "+num+" is "+binaryString);
		
		


	}

}
