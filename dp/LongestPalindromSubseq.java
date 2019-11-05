
/*Given a String, find the longest palindromic subsequence */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-- >0){
		    String str = br.readLine();
		    LPS(str);
		}

	}
	static void LPS(String str){
    int n = str.length();
    int L[][] = new int[n][n];
    int i,j,c;

    for(i=0;i<n;i++){
        L[i][i] = 1;
    }

    for(c=2; c<=n; c++){
        for(i=0; i<n-c+1; i++){
            j = i+c-1;

            if(str.charAt(i) == str.charAt(j) && c == 2)
                L[i][j] = 2;
            else if(str.charAt(i) == str.charAt(j))
                L[i][j] = 2 + L[i+1][j-1];
            else
                L[i][j] = Math.max(L[i+1][j],L[i][j-1]);        }
    }
    System.out.println(L[0][n-1]);

  }


}
