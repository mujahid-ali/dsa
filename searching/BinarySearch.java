
class BinarySearch{
	
	int binarysearch(int arr[], int low, int high, int key){
		
		if (high >= low){
		 
		int mid = low + (high-low) /2;
		if (arr[mid] == key)
			return mid;
			
			
		if ( arr[mid] > key )
			return binarysearch(arr, low, mid - 1, key);
			
		
		return binarysearch(arr, mid + 1, high, key);
		
		
			}
		return -1;	
		}
	
	
	public static void main(String args[]){
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,};
		int n = arr.length;
		int key = -1;
		
		BinarySearch bs = new BinarySearch();
		int index = bs.binarysearch(arr,0,n-1,key);
		
		if (index != -1)
		System.out.println("found at index = " + index);
		
		else
			System.out.println("Not found");
		
		}
	
	}
