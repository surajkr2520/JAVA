package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr= {5,7,2,3,8,1};
		int n=arr.length;
		for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){  
                            //swap elements  
                            int temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }  
                     
            }  
    }  
		
		/*for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
			}
		}*/	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
