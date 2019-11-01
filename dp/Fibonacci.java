
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-- >0){
		    int n = Integer.parseInt(br.readLine());

		    BigInteger prev = BigInteger.valueOf(0);
		    BigInteger res= BigInteger.valueOf(1);
        BigInteger temp = BigInteger.valueOf(1);

        System.out.print(res + " ");
		    for(int i=0; i<n-1; i++){
		        res = prev.add(temp);
            prev = temp;
            temp = res;
		        System.out.print(res + " ");
		    }
		    System.out.println();
		}
	}
}
