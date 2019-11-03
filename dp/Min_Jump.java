
/*
Given an array of integers where each element represents the max number
of steps that can be made forward from that element. The task is to find
the minimum number of jumps to reach the end of the array (starting from the first element).
If an element is 0, then cannot move through that element.

Example:
Input:
2
11
1 3 5 8 9 2 6 7 6 8 9
6
1 4 3 2 6 7
Output:
3
2

Explanation:
Testcase 1: First jump from 1st element, and we jump to 2nd element with value 3. Now, from here we jump to 5h element with value 9. and from here we will jump to last.

*/
import java.io.*;
import java.lang.*;
import java.io.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().split(" ");
      int arr[] = new int[n];
      int i = 0;
      for(i=0; i<n; i++){
        arr[i] = Integer.parseInt(str[i]);
      }

      min_jump(arr,n);
    }
  }

  public static void min_jump(int arr[], int n){

    if(arr[0] == 0){
      System.out.println("-1");
      return;
    }
    int maxreach = arr[0];
    int step = arr[0];
    int jump = 1;

    for(int i = 1; i<n; i++){
      if(i == n-1 ){
        System.out.println(jump);
        return;
      }
      maxreach = Math.max(maxreach, i + arr[i]);
      step--;

      if(step == 0){
        jump++;
        if(i >= maxreach){
          System.out.println("-1");
          return;
        }
        step = maxreach - i;
      }
    }
    System.out.println("-1");
  }
}
