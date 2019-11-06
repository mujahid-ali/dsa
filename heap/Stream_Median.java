

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void main(String args[])throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n];
    int t = n;
    int i =0;
    while(t-- > 0){
      arr[i] = Integer.parseInt(br.readLine());
      i++;
    }
    find_median(arr);
    //for( i =0; i<n; i++){
      //System.out.print(arr[i] + " ");
    //}
  }

  public static void find_median(int arr[]){
    int med = arr[0];
    System.out.println(med);

    PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> greater = new PriorityQueue<>();
    smaller.add(med);

    for(int i = 1; i<arr.length; i++){
      int x = arr[i];
      if(smaller.size() > greater.size()){
        if(x < med){
          greater.add(smaller.remove());
          smaller.add(x);
        }
        else{
          greater.add(x);
        }
        med = (smaller.peek() + greater.peek())/2;
      }
      else if(smaller.size() == greater.size()){
        if(x < med){
          smaller.add(x);
          med = smaller.peek();
        }else{
          greater.add(x);
          med = greater.peek();
        }
      }
        else{
          if( x < med){
            smaller.add(x);
          }
          else{
            smaller.add(greater.remove());
            greater.add(x);
          }
          med = (smaller.peek() + greater.peek())/2;
        }

      System.out.println(med);
  }
}
}
