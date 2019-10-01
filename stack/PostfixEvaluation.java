
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{

  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());

    while(t-->0){
      String str = br.readLine();
      int n = str.length();

      evaluate_postfix(str,n);
    }
  }

  static void evaluate_postfix(String arr, int n){

    Stack<Integer> stack = new Stack<Integer>();
    int i =0;
    for(i = 0; i<n; i++){
      char c = arr.charAt(i);
      if(Character.isDigit(c)){
        stack.push(c-'0');
      }
      else{

        int x = stack.pop();
        int y = stack.pop();

        switch(c){

          case '+':
            stack.push( y + x );
            break;

          case '-':
              stack.push( y - x);
              break;

          case '*':
              stack.push( y * x);
              break;

          case '/':
              stack.push( y/x);
              break;
        }

      }
    }
    System.out.println(stack.pop());
  }
}
