
class HeapSort{
	
	void heapsort(int arr[], int n){
		
		for(int i = (n/2-1); i>=0; i--){
			heapify(arr, n, i);
			
			}
		for(int i= n-1; i >=0; i--){
			int temp = arr[0];
			arr[0]= arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
			
			}	
		
		}
	void heapify(int arr[], int n, int i){
		
		int l = 2*i +1;
		int r = 2*i +2;
		int largest = i;
		
		if(l<n && arr[l] > arr[largest])
			largest = l;
			
		if(r<n && arr[r] > arr[largest])
			largest = r;
		
		
		if(largest != i){
			
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr,n, largest);
			
			}
		}		
	void printarray(int arr[], int n){
		for(int i =0; i<n; i++)
			System.out.println(arr[i]);
		
		}
	
	public static void main(String args[]){
		int arr[] ={12, 11, 13, 5, 6, 7}; 
		int n = arr.length;
		
		HeapSort hs = new HeapSort();
		
		hs.heapsort(arr,n);
		hs.printarray(arr,n);
		
		}
	
	}
