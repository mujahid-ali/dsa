

/* https://en.wikipedia.org/wiki/Dynamic_programming#Egg_dropping_puzzle */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- >0){
      String str[] = br.readLine().split(" ");
      int n = Integer.parseInt(str[0]);
      int k = Integer.parseInt(str[1]);

      int res = egg_drop_dp(n,k);
      //int res = binary_search_sol(n,k); //to-do

      System.out.println(res);
    }
	}

  public static int egg_drop_dp(int n, int k){
    int eggFloor[][] = new int[n+1][k+1];
    int res,i,j,x;

    for(i=1;i<=n;i++){
      eggFloor[i][0] = 1;
      eggFloor[i][1] = 1;
    }
    for(j=1; j<=k; j++){
      eggFloor[1][j] = j;
    }

    for(i=2; i<=n; i++){
      for(j=2; j<=k; j++){
        eggFloor[i][j] = Integer.MAX_VALUE;
        for(x = 1; x<j; x++){
          res = 1 + Math.max(eggFloor[i-1][x-1],eggFloor[i][j-x]);
          if(res<eggFloor[i][j])
            eggFloor[i][j] = res;
        }
      }
    }
    return eggFloor[n][k];
  }
}
