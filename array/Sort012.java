
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    int t  = Integer.parseInt(br.readLine());

    while(t-- >0){
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().split(" ");
      int arr[] = new int[n];
      for(int i = 0; i<n; i++){
        arr[i] = Integer.parseInt(str[i]);
      }
      sort012(arr,n);
    }
	}

  static void sort012(int arr[], int n){
    int low = 0;
    int high = n-1;
    int mid = 0;
    int temp = 0;

    while(mid <= high){
      switch(arr[mid]){
        case 0:{
          temp = arr[mid];
          arr[mid] = arr[low];
          arr[low] = temp;
          low++;
          mid++;
          break;
        }
        case 1:{
          mid++;
          break;
        }
        case 2:{
          temp = arr[mid];
          arr[mid] = arr[high];
          arr[high] = temp;
          high--;
          break;
        }
      }
    }
    for(int i = 0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}
