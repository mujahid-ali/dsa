

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      String str = br.readLine();
      int even = 0;
      int odd = 0;
      int n = str.length();
      for(int i = 0; i<n; i++){
        if(str.charAt(i) == '1'){
          if(i % 2 == 0)
            odd++;
          else{
            even++;
          }
          }
      }
      int res = Math.abs(even-odd);
      if(res == 0)
        System.out.println("1");
      else
        System.out.println("0");
    }
	}
}
