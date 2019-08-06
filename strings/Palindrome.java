
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void palindrom(String str){
    int n = str.length();
    int low = 0;
    int high = n-1;
    boolean flag = true;
    while(low<=high){
      if( !( str.charAt(low) == str.charAt(high)  ) ){
        flag = false;
        break;
      }
      else{
        low++;
        high--;
        }
    }
    if(flag)
      System.out.println("Yes");
    else
      System.out.println("No");
  }

  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      int n = Integer.parseInt(br.readLine().trim());
      String str = br.readLine();
      palindrom(str);
    }
  }
}
