package numberSystem;

public class checkPrime {
	public static boolean isPrime(int num) {
		//Your code goes here
		int count=0;
		for(int i=1;i<=num;i++){
			if(num % i==0)
			count++;
		}
		if(count>2)
		return false;
		else
		return true;
	}
	
	

}