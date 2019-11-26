
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t  = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().split(" ");
      int arr[] = new int[n];
      for(int i = 0; i<n; i++){
        arr[i] = Integer.parseInt(str[i]);
      }
      find_equilib(arr,n);
    }
	}

  static void find_equilib(int arr[], int n){
    int sum =0;
    int leftsum = 0;
    int i =0;
    for(i=0; i<n; i++){
      sum += arr[i];
    }

    for(i=0; i<n; i++){
      sum = sum - arr[i];

      if(leftsum == sum){
        System.out.println(i+1);
        return;
      }
        leftsum = leftsum + arr[i] ;
    }
    System.out.println("-1");
  }
}
