
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t  = Integer.parseInt(br.readLine());

    while(t-- >0){
      String str1 = br.readLine();
      String str2 = br.readLine();

      without_rotation(str1,str2);

      /*
      boolean rotated = check_left_rotate(str1, str2);
      if(!rotated)
        rotated = check_righ_rotate(str1, str2);

      if(rotated)
          System.out.println("1");
      else
        System.out.println("0");
        */
    }
	}

  static void without_rotation(String str1, String str2){
    String str3 = str2 + str2;

    int ind = str3.indexOf(str1);
    if(ind == 2 || ind == str2.length() -2)
      System.out.println("1");
    else
      System.out.println("0");
  }

  static boolean check_left_rotate(String str1, String str2){
    char a = str1.charAt(0);
    char b = str1.charAt(1);
    int n = str1.length();
    char arr1[] = str1.toCharArray();

    for(int i = 2; i<n; i++){
      arr1[i-2] = arr1[i];
    }
    arr1[n-2] = a;
    arr1[n-1] = b;

  String rotated = arr1.toString();
  if(rotated.equals(str2))
    return true;
  else
    return false;
  }

  static boolean check_righ_rotate(String str1, String str2){
    int n = str1.length();
    char a = str1.charAt(n-1);
    char b = str1.charAt(n-2);

    char arr[] = str1.toCharArray();

    for(int i = n-1; i>2; i--){
      arr[i] = arr[i-2];
    }
    arr[0] = a;
    arr[1] = b;

    String rotated = arr.toString();
    if( rotated.equals(str2))
      return true;
    else
      return false;
  }
}
