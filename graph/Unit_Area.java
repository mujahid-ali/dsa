
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      String[] str1 = br.readLine().split(" ");
      String[] str2 = br.readLine().split(" ");

      int row = Integer.parseInt(str1[0]);
      int col = Integer.parseInt(str1[1]);
      int i,j,k;
      k = 0;
      int arr[][] = new int[row][col];
      boolean visited[][] = new boolean[row][col];
      for(i = 0; i<row; i++){
        for(j= 0; j<col; j++){
          visited[i][j] = false;
          arr[i][j] = Integer.parseInt(str2[k]);
          k++;
        }
      }
      int max = 0;
      int local = 0;
      for(i = 0; i<row; i++){
        for(j = 0; j<col; j++){
          if(!visited[i][j] && arr[i][j] == 1){
              local = 0;
              local += dfs(arr,i,j,row,col,visited);
              if(local > max)
                max = local;
                  //System.out.println("max is " +max + " local is " + local);
          }
        }
      }
      System.out.println(max);
    }
  }

  static int dfs(int arr[][], int row, int col, int m, int n, boolean visited[][]){
    if(row < 0 || row >= m || col < 0 || col >= n || arr[row][col] == 0 || visited[row][col])
      return 0;

      visited[row][col] = true;
      int count = 1;
      count += dfs(arr,row+1,col,m,n,visited);
      count += dfs(arr,row,col+1,m,n,visited);
      count += dfs(arr,row+1,col+1,m,n,visited);
      count += dfs(arr,row-1,col,m,n,visited);
      count += dfs(arr,row,col-1,m,n,visited);
      count += dfs(arr,row-1,col-1,m,n,visited);
      count += dfs(arr,row+1,col-1,m,n,visited);
      count += dfs(arr,row-1,col+1,m,n,visited);

      return count;
  }
}
