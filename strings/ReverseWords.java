
/**
Reverse words in  a String
I:  i.like.this.program.very.much
O:  much.very.program.this.like.i
*/

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  /*
  public static void reverseWord(String str){
    Stack<String> stack = new Stack<String>();
    int n = str.length();
    StringBuffer sb = new StringBuffer();
    sb.append(str);
    for(int i = n-1; i>0; i--){
      if( ( str.charAt(i) != '.' ) ){
        stack.push(str.charAt(i));
      }
      else{
        while(stack.isEmpty()){
          String s = stack.peek();
          System.out.println(s);
        }
      }
    }
  }
  */
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-->0){
      //String str[] = br.readLine().split("[.]"); this can also be used, . is a special delimeter and can not be used as ".".
      //Another approach would be to store it in a stack until '.' and then print.
      String str[] = br.readLine().split("\\.");
      int i = 0;
      for( i = str.length-1; i>0; i--){
        System.out.print(str[i]+".");
      }
      System.out.println(str[i]);
    }
  }
}
