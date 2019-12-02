
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      String str = br.readLine();

      int n = str.length();
      int hash[] = new int[256];
      for(int i = 0; i<n; i++){
        if(hash[str.charAt(i)] == 0){
          System.out.print(str.charAt(i));
          hash[str.charAt(i)]++;
        }
      }
      System.out.println();
    }
	}
}
