
/*
Given an array A of size N having distinct elements,
 the task is to find the next greater element for each element of the array in order of their appearance in the array.
 If no such element exists, output -1
 Input
2
4
1 3 2 4
4
4 3 2 1
Output
3 4 4 -1
-1 -1 -1 -1
*/

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine().trim());

    while(t-->0){
      int n = Integer.parseInt(br.readLine().trim());
      String str[] = br.readLine().split(" ");
      Long arr[] = new Long[n];

      for(int i =0; i<n; i++){
        arr[i] = Long.parseLong(str[i]);
      }

      nge(arr,n);
      System.out.println();
    }
  }

  static void nge(Long arr[], int n){
    Stack<Long> stack = new Stack<>();
    Long ans[] = new Long[n];
    int i;

    //stack.push(arr[0]);
    for(i=n-1; i>=0; i--){
      while( !stack.isEmpty() && arr[i]>stack.peek()){
        //System.out.print(arr[i] + " ");
        stack.pop();
        }
        if(stack.isEmpty()){
            ans[i] = Long.valueOf(-1);
        }else{
            ans[i] = stack.peek();
        }
        //ans[i] = stack.isEmpty() ? -1 : stack.peek();
          stack.push(arr[i]);

    }

    for(i = 0; i<n; i++ ){
      System.out.print(ans[i] + " ");
    }
  }
}
