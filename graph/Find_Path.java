
/*https://practice.geeksforgeeks.org/problems/find-whether-path-exist/0/?ref=self  */
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      int row = Integer.parseInt(br.readLine());
      String[] str2 = br.readLine().split(" ");


      int col = row;
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

      boolean local = false;
      for(i = 0; i<row; i++){
        for(j = 0; j<col; j++){
          if(!visited[i][j] && arr[i][j] == 1){
              local = dfs(arr,i,j,row,col,visited);
                  //System.out.println("max is " +max + " local is " + local);
          }
        }
      }
      if(local)
      System.out.println("1");
      else{
        System.out.println("0");
      }
    }
  }

  static boolean dfs(int arr[][], int row, int col, int m, int n, boolean visited[][]){
    if(row < 0 || row >= m || col < 0 || col >= n || arr[row][col] == 0 || visited[row][col])
      return false;

      visited[row][col] = true;
      if(arr[row][col] == 2)
        return true;

      if( dfs(arr,row+1,col,m,n,visited) || dfs(arr,row,col+1,m,n,visited) || dfs(arr,row-1,col,m,n,visited) || dfs(arr,row,col-1,m,n,visited) )
        return true;

     return false;
  }
}
