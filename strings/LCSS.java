
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  private static char[] LCSS(String str1, String str2){
    int m = str1.length();
    int n = str2.length();
    int lcss[][] = new int[m+1][n+1];
    int i,j,count;

    for(i=0; i<=m; i++){
      for(j=0; j<=n; j++){
        if( i ==0 || j == 0){
          lcss[i][j] = 0;
        }
        else if( (str1.charAt(i-1) == str2.charAt(j-1))){
          lcss[i][j] = lcss[i-1][j-1] +1;
        }
          else{
            lcss[i][j] = Math.max(lcss[i-1][j], lcss[i][j-1]);
          }
      }
    }
    count = lcss[m][n];
    System.out.println(count);
    char arr[] = new char[count+1];
    i=m;
    j=n;
    arr[count] = 0;
    while(i>0 && j>0){
      if(str1.charAt(i-1) == str2.charAt(j-1)){
        arr[count-1] = str1.charAt(i-1);
        i--;
        j--;
        count--;
      }
      else if(lcss[i-1][j] > lcss[i][j-1]){
        i--;
      }
      else{
        j--;
      }
    }
    return arr;
  }

  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t= Integer.parseInt(br.readLine());

    while(t-->0){
      String str1 = br.readLine();
      String str2 = br.readLine();
      char[] str = LCSS(str1, str2);
      for(char c:str)
        System.out.print(c);
    }
  }
}
