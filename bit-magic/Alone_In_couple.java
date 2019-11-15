import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String str1[] = br.readLine().split(" ");
      int arr[] = new int[n];
      for(int i = 0; i<n; i++){
        arr[i] = Integer.parseInt(str1[i]);
      }
      int num = 0;
      for(int j = 0; j<n; j++){
        num = num^arr[j];
      }
      System.out.println(num);
    }
	}
}
