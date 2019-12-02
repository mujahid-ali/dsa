
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
      int res = get_int(str);
      System.out.println(res);
    }
	}

  static int get_int(String str){
    int n = str.length();
    int res = 0, x, y;
    char arr[] = str.toCharArray();
    for(int i = 0; i<n; i++){
      if(i == n-1){
        x = value(arr[i]);
        res += x;
        return res;
      }
      else{
        x = value(arr[i]);
        y = value(arr[i+1]);
        if( x >= y ){
          res += x;
          //System.out.println(" res = "+res + " x = " +x + " y = "+y);
        }
        else{
          res -= x;
        }
      }
    }
    return -1;
  }

  static int value(char c){
    switch(c){
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      }
      //System.out.println("c is = " + c);
      return -1;
  }
}
