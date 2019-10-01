
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine().trim());

    while(t--> 0){
      String str = br.readLine();

      print_bracket(str);
      System.out.println();
    }
  }

  static void print_bracket(String str){
    int n = str.length();

    Stack<Character> stack1 = new Stack<Character>();
    Stack<Integer> digit = new Stack<Integer>();

    int count = 0;
    for(int i =0; i<n; i++){
      char c = str.charAt(i);

      if( c == '('){
        stack1.push(c);
        count++;
        digit.push(count);
        System.out.print(count + " ");
      }
      else{
        if(c == ')' ){
          if(!stack1.isEmpty()){
            stack1.pop();
            System.out.print(digit.pop() + " ");
          }
        }
      }
    }
  }
}
