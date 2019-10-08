
//Convert infix into postfix

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      String str = br.readLine().trim();

      convert(str);
    }
  }

  static int prec(char c){
    switch(c){
      case '^':
        return 3;

      case '*':
      case '/':
          return 2;

    case '+':
    case '-':
          return 1;
        }
        return -1;

  }


  static void convert(String str){
    int n = str.length();

    String result = "";
    Stack<Character> stack = new Stack<Character>();

    for(int i = 0; i<n; i++){
      char c = str.charAt(i);

      if(Character.isLetterOrDigit(c)){
        result += c;
      }
      else if( c == '(' ){
        stack.push(c);
      }
      else if(c == ')'){
        while( !stack.isEmpty() && stack.peek() != '('){
            result += stack.pop();
        }
        if(!stack.isEmpty())
          stack.pop();
      }
      else {
        while(!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
          result += stack.pop();
          }
        stack.push(c);
        }
      }
    while(!stack.isEmpty()){
      result += stack.pop();
    }
    System.out.println(result);
  }
}
