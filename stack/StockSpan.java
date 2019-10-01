/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine().trim());

    while(t-->0){
      int n = Integer.parseInt(br.readLine().trim());
      String str[] = br.readLine().split(" ");
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = Integer.parseInt(str[i]);
      }
      int res[] = new int[n];
      stock_span(arr,res,n);

      for(int x:res)
        System.out.print(x + " ");

        System.out.println();
    }
	}

  static void stock_span(int arr[], int res[], int n){

    int i=0;
    res[0] = 1;
    for(i=1; i<n; i++){
      int count = 1;
      while( ((i - count) >= 0)  && ( arr[i] >= arr[i - count] ) ){
        count += res[i - count];
      }
      res[i] = count;
    }
  }
}
