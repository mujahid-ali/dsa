
/**
Reverse words in  a String
I:  i.like.this.program.very.much
O:  much.very.program.this.like.i
*/

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  public static void reverseWord(String str){
    Stack<String> stack = new Stack<String>();
    int n = str.length();
    for(int i = n-1; i>0; i--){
      if(str.charAt(i) == '.'){
        print();
      }
      else{
        stack.push(str.charAt(i));
      }
    }
  }
  public static void main(String[] args)throws java.lang.Exception{
    
  }
}
