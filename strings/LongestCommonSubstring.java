
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
  static void LCSS(String str1, String str2){
    int m = str1.length();
    int n = str2.length();

    int i,j;
    int LCSS[][]= new int[m+1][n+1];
    int len = 0;
    int row =0, col = 0;
    for(i=0;i<m;i++)
      LCSS[i][0] = 0;
    for(j=0;j<n;j++)
      LCSS[0][j] = 0;

      for(i=1; i<=m; i++){
        for(j=1; j<=n; j++){
          if( (str1.charAt(i-1) == str2.charAt(j-1)) ){
            LCSS[i][j] = LCSS[i-1][j-1]+ 1;
            if(len<LCSS[i][j]){
              len = LCSS[i][j];
              row = i;
              col = j;
            }
          }
          else{
            LCSS[i][j] = 0;
          }
        }
      }
    if(len == 0)
      return;
    else
      System.out.println(len);

    String sb = "";
    while( LCSS[row][col] !=0 ){
    sb = str1.charAt(row-1) + sb;
    row--; col--;
  }

    /*
    StringBuffer sb = new StringBuffer();
    while(LCSS[row][col] != 0){
      sb.insert(0,str2.charAt(col-1));//sb.append(str1.charAt(row));
      col--;row--;
    }
    */
    System.out.println(sb);
  }

  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      String str = br.readLine();
      String str1 = br.readLine();
      String str2 = br.readLine();
      LCSS(str1,str2);
    }
  }
}
