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
      if(!isPalindrome(str))
        dp(str);
      else{
        System.out.println("0");
      }
    }
	}

  static boolean isPalindrome(String str){
    int n = str.length();
    int i = 0;
    int j = n-1;
    while(i<j){
      if(str.charAt(i) != str.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  static void dp(String str){
    int n = str.length();
    int dp[][] = new int[n][n];
    int gap,l,h;

    for(gap = 1; gap<n; ++gap){
      for(l=0, h=gap; h<n; ++h,++l){
        dp[l][h] = (str.charAt(l) == str.charAt(h))?
                    dp[l+1][h-1] : (Integer.min(dp[l][h-1],dp[l+1][h]) + 1);

      }
    }
    System.out.println(dp[0][n-1]);
  }
}
