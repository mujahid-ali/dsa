
/*
o-1 knapsack
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      int n = Integer.parseInt(br.readLine());
      int w = Integer.parseInt(br.readLine());

      String str1[] = br.readLine().split(" ");
      String str2[] = br.readLine().split(" ");
      int i =0;
      int items[] = new int[n];
      int weight[] = new int[n];
      for(i=0; i<n; i++){
        items[i] = Integer.parseInt(str1[i]);
        weight[i] = Integer.parseInt(str2[i]);
       }

       int cache[] = new int[w+1];
       for(i=0;i<n;i++){
         int newcache[] = new int[w+1];
         for(int j=0;j<=w;j++){
           if(weight[i] > j){
             newcache[j] = cache[j];
           }
           else{
             newcache[j] = Math.max(cache[j], cache[j-weight[i]] + items[i] );
           }
         }
         cache = newcache;
       }
       System.out.println(cache[w]);
    }
	}
}
