
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- >0){
      String str1[] = br.readLine().split(" ");
      String str2[] = br.readLine().split(" ");
      int n = Integer.parseInt(str1[0]);
      int sum = Integer.parseInt(str1[1]);
      int arr[] = new int[n];

      for(int i = 0; i<n; i++){
        arr[i] = Integer.parseInt(str2[i]);
      }

      helper(arr,n,sum);
    }
	}

  static void helper(int arr[], int n, int sum){
    int localsum = 0;
    for(int i = 0; i<n; i++){
      localsum = 0;
      for(int j=i; j<n; j++){
        localsum+= arr[j];
        if(localsum == sum){
          System.out.println(i+1 + " " + ++j );
          return;
        }
        if(localsum > sum){
          break;
        }
      }
    }
  }
}
