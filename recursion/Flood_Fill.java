
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

  static void flood_fill(int matrix[][], int i, int j, int value, int m, int n, int current){
    if(i>=m || i<0 || j>=n || j<0)
      return;
    else if(matrix[i][j] == value)
      return;
    else if(matrix[i][j] != current)
      return;
    else
    matrix[i][j] = value;
    flood_fill(matrix,i+1,j,value,m,n,current);
    flood_fill(matrix,i,j+1,value,m,n,current);
    flood_fill(matrix,i-1,j,value,m,n,current);
    flood_fill(matrix,i,j-1,value,m,n,current);
  }
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      String str1[] = br.readLine().split(" ");
      int m = Integer.parseInt(str1[0]);
      int n = Integer.parseInt(str1[1]);

      String str2[] = br.readLine().split(" ");
      String str3[] = br.readLine().split(" ");
      int i = 0, j = 0,k=0;
      int x = Integer.parseInt(str3[0]);
      int y = Integer.parseInt(str3[1]);
      int value = Integer.parseInt(str3[2]);
      int matrix[][] = new int[m][n];
      for(i=0;i<m;i++){
        for(j=0;j<n;j++){
          matrix[i][j] = Integer.parseInt(str2[k++]);
        }
      }

      //for(i=0; i<m; i++){
        //for(j=0; j<n; j++){
          flood_fill(matrix,x,y,value,m,n,matrix[x][y]);
        //}
      //}
      for(i=0; i<m; i++){
        for(j=0; j<n; j++){
          System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
      }
    }
	}
}
