import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- >0){
      long n = Long .parseLong(br.readLine());
      long a = n-1;
      long res = n & a;

      if(res == 0 && n != 0)
        System.out.println("YES");
      else
        System.out.println("NO");

    }
	}
}
