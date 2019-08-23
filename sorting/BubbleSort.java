import java.util.Arrays; 

class BubbleSort{
	
	
	void recursivebs(int arr[], int n){
		
		if(n==1)
			return;
		
		
		for(int i =0; i<n-1; i++){
			if(arr[i]> arr[i+1]){
				//System.out.println("i is= " + i + " n is " +n );
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
				}
			
			}
		recursivebs(arr,n-1);		
		
		}
	
	void bubblesort(int arr[], int n){
		
		boolean pass;
		int i,j;
		for(i=0; i<n; i++){
			pass = false;
			for(j=0; j<n-i-1;j++){
				
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					pass = true;
					
					
					}
				}
			if( pass == false)
					break;
				
			
			}
		
		}
	
	void printarray(int arr[], int n){
		for(int i =0; i<n; i++)
			System.out.println(arr[i]);
		}
	
	public static void main(String args[]){
		
		int arr[] = {12, 11, 13, 5, 6, 7,3,2,10,1,8};
		//int arr[] = {3,2,1};
		int n = arr.length;
		
		BubbleSort bs = new BubbleSort();
		//bs.bubblesort(arr,n);
		bs.recursivebs(arr,n);
		//bs.printarray(arr,n);
		System.out.println(Arrays.toString(arr));
		}



}
