
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      long n = Long.parseLong(br.readLine());

      int i = 0;
      long result = 0;
      long rem = 0;
      while(i++<32){
        rem = n%2;
        n = n/2;
        result = (2*result + rem);
      }
      System.out.println(result);
    }
	}
}
