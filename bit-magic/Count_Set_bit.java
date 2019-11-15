
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{

  static int helper(int x){
    int count = 0;
    while( x != 0 ){
      x = x&(x-1);
      count++;
    }
    return count;
  }
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int count = 0;
      for(int i=1; i<= n; i++){
        count += helper(i);
      }
      System.out.println(count);
    }
  }
}
