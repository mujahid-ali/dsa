
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
  Bufferedreader br = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(br.readLine().trim());

  while(t-->0){
    String str = br.readLine().trim();

    decode_string(str);
  }
}

  static void decode_string(String str){
    int n = str.length();
    Stack<Character> stack = new Stack<Character>();
    StringBuilder result = "";

    for(int i =0; i<n; i++){
      char c = str.charAt(i);

      if( (Character.isDigit(c)) || (c == '[') || Character.isLetter(c) ){
        stack.push(c);
      }
      else if( c == ']' ){
        //pop until digit.
        StringBuilder sb = "";
        while(!Character.isDigit(stack.peek())) {
          char c1 = stack.pop();
          if(Character.isLetter(c1)){
            sb = c1 + sb;
          }
        }
        char c2 = stack.pop();
        int x = Integer.parseInt(c2);
        result = expand(sb,x);
        stack.push(result);
      }
    }
  }

  static String expand(String str, int x){

    while(--x>0){
        str += str;
    }
    return str;
  }
}
