
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- >0){
      int n = Integer.parseInt(br.readLine());
      int i,j,k;
      int arr[][] = new int[4*n][4*n];
      for(i=0; i<4*n; i++){
        for(j=0; j<4*n; j++){
          arr[i][j] = i*4*n + (j+1);
          //System.out.print(arr[i][j] + " ");
        }
        //System.out.println();
      }
      //print clockwise
      int h = 2;
      n = 4*n;
      i = n/2;
      j = n/2 -1;
      while(h<=n){
        for(int r = i; r>=0 && r > i-h; r--)
          System.out.print(arr[r][j] + " ");
        i -= h;

        if(i<0)
          break;
        for(int c = j; c<n && c<j+h; c++)
            System.out.print(arr[i][c] + " ");
        j += h;
        h = h + 2;

        if(j >= n)
          break;

        for( int r = i; r<n && r < i + h; r++ )
            System.out.print(arr[r][j] + " ");
        i += h;

        if(i >= n)
          break;

        for(int c = j; c>0 && c>j-h; c--)
            System.out.print(arr[i][c] + " ");
        j -= h;
        h = h+2;
        if(j<0)
          break;
      }
      // print anti-clockwise
      System.out.println();
      h = 2;
      i = n/2-1;
      j = n/2;

      while( h<=n){
        for(int r = i; r<n && r<i+h; r++)
          System.out.print(arr[r][j] + " ");
        i += h;

        if(i>n)
          break;

        for(int c = j; c>0 && c > j-h; c--)
            System.out.print(arr[i][c] + " ");
        j -= h;
        h = h+2;

        if(j<0)
          break;

        for(int r = i; r>=0 && r > i-h; r--)
            System.out.print(arr[r][j] + " ");
        i -= h;

        if(i<0)
          break;

        for(int c = j; c<n && c< j+h; c++)
            System.out.print(arr[i][c] + " ");
        j += h;
        h = h+2;

        if(j>n)
            break;
      }
      System.out.println();
    }
  }
}
