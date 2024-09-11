package Array;

public class rotateKarray {

	public static void main(String[] args) {
		int arr[]= {2,1,3,5,4,5,8,45,9,3,5};
		int k=6;
		for(int i=k;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		for(int i=0;i<k;i++) {
			System.out.print(" "+arr[i]);
		}

	}
}


