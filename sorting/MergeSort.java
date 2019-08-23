
class MergeSort{
	
	void mergesort(int arr[], int l, int r){
		
		if(r>l){
			int m = (l+r)/2;
			
			mergesort(arr,l,m);
			mergesort(arr,m+1,r);
			merge(arr,l,m,r);
			
			}
		
		}
		
	void iterativems(int arr[], int l, int n){
		 int curr_size;  
                      
        // For picking starting index of  
        // left subarray to be merged 
        int left_start; 
                          
          
        // Merge subarrays in bottom up  
        // manner. First merge subarrays  
        // of size 1 to create sorted  
        // subarrays of size 2, then merge 
        // subarrays of size 2 to create  
        // sorted subarrays of size 4, and 
        // so on. 
        for (curr_size = 1; curr_size <= n-1;  
                      curr_size = 2*curr_size) 
        { 
              
            // Pick starting point of different 
            // subarrays of current size 
            for (left_start = 0; left_start < n-1; 
                        left_start += 2*curr_size) 
            { 
                // Find ending point of left  
                // subarray. mid+1 is starting  
                // point of right 
                int mid = left_start + curr_size - 1; 
          
                int right_end = Math.min(left_start  
                             + 2*curr_size - 1, n-1); 
          
                // Merge Subarrays arr[left_start...mid] 
                // & arr[mid+1...right_end] 
                merge(arr, left_start, mid, right_end); 
            } 
        } 
		
		}	
		
	void merge(int arr[], int l, int m, int r){
		
		int n1 = m - l +1;
		int n2 = r -m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		
		for(int i =0; i<n1; i++)
			L[i] = arr[l+i];
		
		for(int j = 0; j < n2; j++)
			R[j] = arr[m + 1 +j];
			
		int i=0, j=0;
		
		int k =l;
		
		while(i<n1 && j < n2 ){
			
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
				}
			else{
				arr[k] = R[j];
				j++;
				}
			k++;
			}
		while( i<n1){
			arr[k] = L[i];
			i++; k++;
			}		
		while( j< n2){
			
			arr[k] = R[j];
			j++;
			k++;
			}
		}	
	void printarray(int arr[], int n){
		for(int i =0; i<n; i++){
			System.out.println(arr[i]);
			}
		
		}
	
	public static void main(String args[]){
		//int arr[] = {10, 7, 8, 9, 1, 5,2,4, 25,3,6};
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		int n = arr.length;
		
		MergeSort ms = new MergeSort();
		//ms.mergesort(arr,0,n-1);
		ms.iterativems(arr,0,n-1);
		ms.printarray(arr,n);
		
		
		}
	}
