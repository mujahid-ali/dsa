
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine().trim());
      String str[] = br.readLine().split(" ");
      int arr[] = new int[n];
      for(int i = 0; i<n; i++)
        arr[i] = Integer.parseInt(str[i]);

        int k = Integer.parseInt(br.readLine());

        GFG obj = new GFG();

        obj.solve(arr,n,k);
    }
}
     private void solve(int arr[], int n, int k){

      LinkedList<Integer> Dq = new LinkedList<Integer>();
      int i = 0;
      //Parsing first window
      //-8 2 3 -6 10
      //k =2
      for(i=0; i<k; i++){
        if(arr[i]<0)
          Dq.add(i);
      }
      //Parsing remaining array
      for(;i<n;i++){
        if(!Dq.isEmpty())
          System.out.print(arr[Dq.peek()] + " ");
        else
          System.out.print("0" + " ");


      //Remove the element that are out of window
      //i-k will give the window range and +1 bcz we started from 0

      while(!Dq.isEmpty() && Dq.peek() < (i-k+1)) {
        Dq.remove();
      }
      if(arr[i]<0){
        Dq.add(i);
      }
    }
      // Printing the negative element from last window
      if(!Dq.isEmpty())
        System.out.println(arr[Dq.peek()]);
      else{
        System.out.println("0");
      }
    }
}
