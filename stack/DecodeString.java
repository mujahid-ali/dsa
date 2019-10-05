
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int t = Integer.parseInt(br.readLine().trim());

  while(t-->0){
    String str = br.readLine().trim();

    decode_string(str);
  }
}

  static void decode_string(String str){
    int n = str.length();
    //Stack<Character> stack = new Stack<Character>();
    Stack<String> stack = new Stack<String>();
    //StringBuilder result = new StringBuilder();
    String result = "";

    for(int i =0; i<n; i++){
      char c = str.charAt(i);

      if( (Character.isDigit(c)) || (c == '[') || Character.isLetter(c) ){
        stack.push(Character.toString(c));
      }
      else if( c == ']' ){
        //pop until digit.
        //StringBuilder sb = new StringBuilder();
        String sb = "";
        while(!Character.isDigit(stack.peek().charAt(0))) {
          String temp = stack.pop();
          //System.out.println("temp is = "+ temp);
          char c1 = temp.charAt(0);
          if(Character.isLetter(c1)){
            //sb = Character.toString(c1) + sb;
            sb = temp + sb;
          }
        }

        String temp_dig = "";
        while(!stack.isEmpty() && (Character.isDigit(stack.peek().charAt(0)))){
          temp_dig =  stack.pop() + temp_dig;
          //System.out.println("temp dig = "+temp_dig);
        }
        //String c2 = stack.pop();
        //int x = Integer.parseInt(Character.toString(c2));
        int x = Integer.parseInt(temp_dig);
        result = expand(sb,x);
        stack.push(result);
      }
    }
    System.out.println(result);
  }

  static String expand(String str, int x){
    String result = str;

    while(--x>0){
        result = result + str;
    }
    return result;
  }
}
