import java.util.Arrays;

class SelectionSort{
	
	void selectionsort(int arr[], int n){
		
		int i,j,k,min;
		for(i=0;i<n-1; i++){
			min =i;
			for(j=i+1; j<n; j++){
				
				if(arr[j] < arr[min]){
					min = j;
					}
				}
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min] = temp;
			
			}
		
		
		}
	
	
	public static void main(String args[]){
		int arr[] = {12, 11, 13, 5, 6, 7,3,2,10,1,8};
		//int arr[] = {3,2,1};
		int n = arr.length;
		
		SelectionSort ss = new SelectionSort();
		ss.selectionsort(arr,n);
		
		System.out.println(Arrays.toString(arr));
		
		
		}
	}
