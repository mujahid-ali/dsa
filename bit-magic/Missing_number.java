
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().split(" ");
      int temp = 0;
      for(int i = 0; i<n-1; i++){
        temp += Integer.parseInt(str[i]);
      }
      int sum = n*(n+1)/2;
      System.out.println(sum - temp);
    }
	}
}
