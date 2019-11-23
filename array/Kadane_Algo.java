
//Contigous max subarray or kadane's algo
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().split(" ");
      int arr[] = new int[n];
      int i = 0;
      for(i=0; i<n; i++){
        arr[i] = Integer.parseInt(str[i]);
      }
      int sum = kadane(arr, n);
      System.out.println(sum);
    }
  }

  static int kadane(int arr[], int n){
    int gmax = arr[0];
    int lmax = arr[0];
    for(int i = 1; i<n; i++){
      lmax = Math.max(arr[i], lmax + arr[i]);
      gmax = Math.max(gmax,lmax);
    }
    return gmax;

  }
}
