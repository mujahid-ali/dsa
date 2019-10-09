
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
      int arr[] = new int[n];

      for(int i =0; i<n; i++){
        arr[i] = Integer.parseInt(str[i]);
      }

      nge(arr,n);
      System.out.println();
    }
  }

  static void nge(int arr[], int n){
    Stack<Integer> stack = new Stack<>();
    int ans[] = new int[n];
    int i,next,element;

    stack.push(arr[0]);
    for(i=1; i<n; i++){
      while( !stack.isEmpty() && arr[i]>stack.peek()){
        //System.out.print(arr[i] + " ");
        ans[i-1] = arr[i];
        stack.pop();
        }

        //else{
          stack.push(arr[i]);
        //}
    }

    while(!stack.isEmpty()){
      System.out.print("-1 ");
      stack.pop();
    }
  }
}
