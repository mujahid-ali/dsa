
class QuickSort{
	void quicksort(int arr[], int low, int high ){
		
		if( low < high){
		  int pi = partition(arr, low, high);
		
		  quicksort(arr, low, pi-1);
		  quicksort(arr, pi+1, high);
	      }
		}
	
	void iterativeqs(int arr[], int low, int high){
		
		int stack[] = new int[high -low-1];
		int top = -1;
		
		stack[++top] = low;
		stack[++top] = high;
		
		while(top >= 0 ){
			
			high = stack[top--];
			low = stack[top--];
			
			int p = partition(arr, low,high);
			
			if(p-1 > low ){
				stack[++top] = low;
				stack[++top] = p-1;
				
				}
			if( p+1 < high ){
				stack[++top] = p +1;
				stack[++top] = high;
				
				}
			
			}
		
		
		}	
		
	int partition(int arr[], int low, int high){
		
		int pivot = arr[high];
		
		int i = (low-1);
		
		for(int j = low; j<high; j++){
			
			if(arr[j] <= pivot){
				
				i++;
				
				swap(arr,i, j);
				
				}
			
			
			}
		swap(arr,i+1,high);
		return (i+1);
		
		}	
	
	void swap(int arr[], int a, int b){
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		}
	void printarray(int arr[], int n){
		for(int i = 0; i<n; i++){
			
			System.out.println(arr[i]);
			}
		
		}	
	
	public static void main(String args[]){
		
		int arr [] = {10, 7, 8, 9, 1, 5,2,4, 25,3,6};
		int n = arr.length;
		QuickSort qs = new QuickSort();
		//qs.quicksort(arr,0,n-1);
		System.out.println("Array before sorting");
		qs.printarray(arr,n);
		System.out.println("Array after sorting");
		qs.iterativeqs(arr,0,n-1);
		qs.printarray(arr,n);
		
		}
	}
