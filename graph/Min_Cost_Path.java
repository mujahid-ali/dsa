
import java.lang.*;
import java.util.*;
import java.io.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().split(" ");
      int arr[][] = new int[n][n];
      int i,j,k;
      k = 0;
      for(i=0; i<n;i++){
        for(j=0; j<n; j++){
          arr[i][j] = Integer.parseInt(str[k]);
          k++;
        }
      }

      int res = dp(arr,n,n);
      System.out.println(res);
    }
  }

  static int min(int x, int y, int z){
    if(x<y)
      return (x<z)?x:z;
      else
        return (y<z)?y:z;
  }

  static int dp(int arr[][], int m, int n){
    int i,j;
    int dp[][] = new int[m][n];
    dp[0][0] = arr[0][0];
    for(i = 1; i<m; i++){
      dp[i][0] = dp[i-1][0] + arr[i][0];
    }
    for(j=1; j<n; j++){
      dp[0][j] = dp[0][j-1] + arr[0][j];
    }

    for(i=1; i<m; i++){
      for(j=1; j<n; j++){
        //dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1) + arr[i][j];
        dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + arr[i][j];
      }
    }

    return dp[m-1][n-1];
  }
}
