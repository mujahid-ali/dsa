
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t -- > 0 ){
      String str = br.readLine();

      solve(str);
    }
  }

  static void solve(String str){
    Stack<Integer> stack = new Stack<Integer>();
    int n = str.length();
    int max = 0;
    stack.push(-1);

    for(int i =0; i<n; i++){
      char c = str.charAt(i);
      if(c == '(' ){
        stack.push(i);
      }
      else{
        stack.pop();
        if(stack.isEmpty()){
          stack.push(i);
        }
        else{
          max = Math.max(max,i-stack.peek());
        }
      }
    }
    System.out.println(max);
  }

/*
  static void solve(String str){
    Stack<Character> stack = new Stack<Character>();
    int n = str.length();

    int count = 0;
    int max = 0;
    for(int i = 0; i<n; i++){
      if(stack.isEmpty() && str.charAt(i) == ')'){
        count = 0;
      }
      if(str.charAt(i) == '('){
        stack.push(str.charAt(i));
      }
      else if(!stack.isEmpty() && stack.peek() == '('){
        stack.pop();
        count += 2;
        if(count > max)
          max= count;
      }
      //System.out.println("i = "+ i + " count = " +count + " max = " +max);
    }
    System.out.println(max);
  }
*/
}
