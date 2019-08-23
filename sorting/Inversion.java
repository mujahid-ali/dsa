import java.util.Arrays;

class Inversion{
	
	int mergesort(int arr[], int l, int h){
		int inver = 0;
		if(h>l) {
		int mid = (l+h) / 2 ;
		
		inver = mergesort(arr,l,mid);
		inver += mergesort(arr,mid+1,h);
		
		inver+= merge(arr, l, mid, h);
	    }
		return inver;
		}
	
	int merge(int arr[], int l, int mid, int h){
		
		int n1= mid -l +1;
		int n2 = h - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		int i ,j ,k,inv=0;
		for(i=0; i<n1; i++)
			L[i] = arr[i];
		
		for(j=0; j<n2; j++)
			R[j] = arr[j+mid+1];
			
		i=0; j=0; k=l;	
		while( i< n1 && j<n2){
			
			if(L[i]< R[j]){
			    arr[k++] = arr[i++];
				}
			else{
				arr[k++] = arr[j++];
				inv = mid -i;
				
				}
			}
				
		return inv;
		}
	
	public static void main(String args[]){
		int arr[] = {1, 20, 6, 4, 5 };
		
		int n = arr.length;
		
		Inversion in = new Inversion();
		int inver = in.mergesort(arr,0,n-1);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Inversion = " + inver);
		}
	}
