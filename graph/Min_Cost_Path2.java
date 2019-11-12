
import java.lang.*;
import java.util.*;
import java.io.*;

class Grid{
  int x;
  int y;
  Grid(int x, int y){
    this.x = x;
    this.y = y;
  }
}

class GFG{

  static int dx[]={0,0,1,-1};
  static int dy[]={1,-1,0,0};

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
    for(i=0;i<m;i++)
      for(j=0;j<n;j++)
        dp[i][j] = Integer.MAX_VALUE;

    dp[0][0] = arr[0][0];
    Deque<Grid> dq = new ArrayDeque<>();
    dq.add(new Grid(0,0));
    int len = 1;

    while(!dq.isEmpty()){
      for(i=0; i<len; i++){
        Grid temp = dq.removeFirst();
        for(j=0; j<4; j++){
          int a = temp.x + dx[j];
          int b = temp.y + dy[j];

          if(a >= 0 && b >= 0 && a < m && b < n){
            if(dp[temp.x][temp.y] + arr[a][b] < dp[a][b]){
              dp[a][b] = dp[temp.x][temp.y] + arr[a][b];
              dq.addLast(new Grid(a,b));
            }
          }

        }
      }
      len = dq.size();
    }
    return dp[m-1][n-1];
  }
}
