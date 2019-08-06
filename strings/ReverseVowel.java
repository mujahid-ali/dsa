
/*
Given a string, reverse only the vowels present in it and print the resulting string.

*/
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
  public static void reverse(String str){
    int n = str.length()-1;
    int low =0;
    boolean flag1 = false;
    boolean flag2 = false;
    StringBuffer sb = new StringBuffer();
    sb.append(str);
    while(low<=n){
      if( !(str.charAt(low) == 'a' || str.charAt(low) == 'i' || str.charAt(low) == 'e' || str.charAt(low) == 'o' || str.charAt(low) == 'u')){
        low++;
      }
      else{
        flag1 = true;
      }
      if( !(str.charAt(n) == 'a' || str.charAt(n) == 'i' || str.charAt(n) == 'e' || str.charAt(n) == 'o' || str.charAt(n) == 'u')){
        n--;
      }
      else{
        flag2 = true;
      }
      if(flag1 && flag2){
        char temp = sb.charAt(low);
        sb.setCharAt(low, sb.charAt(n))  ;
        sb.setCharAt(n, temp);
        n--;
        low++;
      }
    }
    System.out.println(sb);
  }
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-->0){
      String str = br.readLine();
      reverse(str);
    }
  }
}
