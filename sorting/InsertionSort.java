
class InsertionSort{
	
	void recursiveis(int arr[], int n){
		
		if (n<=1)
			return;
			
		recursiveis(arr, n-1);
		
		int j = n-2;
		int key = arr[n-1];
		
		while(j>=0 && arr[j] > key){
			arr[j+1] = arr[j];
			j--;
			}
		arr[j+1] = key;	
		//recursiveis(arr,n-1); 
		
		}
	void reverserecursiveis(int arr[], int i, int n){
		
		if (i>=n)
			return;
			
		
		
		int j = i-1;
		int key = arr[i];
		
		while(j>=0 && arr[j] > key){
			arr[j+1] = arr[j];
			j--;
			}
		arr[j+1] = key;	
		reverserecursiveis(arr, i+1,n);
		//recursiveis(arr,n-1); 
		
		}
		
	
	void insertionsort2(int arr[], int n){
		int i;
		for(i=1; i<n; ++i){
			int key = arr[i];
			int j = i-1;
			
			while( j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
				}
			arr[j+1] = key;
			
			}
		
		}
	
	void insertionsort(int arr[], int n){
		
		int i;
		
		for(i=1; i<n; i++){
			int key = arr[i];
			int j= i -1;
			
			while( j>=0 && arr[j] > arr[j+1] ){
				
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
				}
				
				}
			}
		
		
			
	void printarray(int arr[], int n){
	for(int i =0; i<n; i++)
		System.out.println(arr[i]);
	}
	public static void main(String args[]){
		
		int arr[] ={12, 11, 13, 5, 6, 7,3,2,10,1,8}; 
		int n = arr.length;
		
		InsertionSort is = new InsertionSort();
		
		//is.insertionsort2(arr,n);
		//is.recursiveis(arr,n);
		is.reverserecursiveis(arr,0,n);
		is.printarray(arr,n);
		}
	}
