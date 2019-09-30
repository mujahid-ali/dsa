/*package whatever //do not write package name here */


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{

  static boolean compare(char c1, char c2){
    if( (c1 == '{' && c2 == '}') || (c1 == '(' &&  c2 == ')') || (c1 == '[' && c2 == ']')  )
      return true;
    else
    return false;
  }

  public static void main(String[] args) throws java.lang.Exception{
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    int t = Integer.parseInt(br.readLine().trim());

    while(t-->0){
      String s = br.readLine();
      char[] str = s.toCharArray();
      int n = str.length;
      boolean result = false;

      Stack<Character> stack = new Stack<Character>();
      for(int i =0; i<n; i++){

        if(str[i] == '(' || str[i] == '{' || str[i] == '['){
          stack.push(str[i]);
        }
        else{
          if(str[i] == ')' || str[i] == '}' || str[i] == ']'){
            if(!stack.isEmpty()){
            Character c = stack.pop();

            result = compare(c.charValue(),str[i]);
            }
            if(result == false)
              break;
          }
        }
      }
      if(result  && stack.isEmpty())
        System.out.println("balanced");
      else
        System.out.println("not balanced");
    }


  }
}
