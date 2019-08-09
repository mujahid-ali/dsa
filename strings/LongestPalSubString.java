
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{

  static int DP(String str){
    int n = str.length();
    int i=0,max=0, start = 0;

    //Create a boolean array, if str is palindrom then true else false
    boolean dp[][] = new boolean[n][n];
    //all string of lenght 1 are palindroem :)
    for(i=0; i<n-1; i++)
      dp[i][i] = true;

    //palindrome of length=2
    for(i=0; i<n-2; i++){
      if( (str.charAt(i) == str.charAt(i+1) )){
        dp[i][i+1] = true;
        max = 2;
        start = i;
      }
    }

    // palindrom of length >2
    for(int k=3; k<n; k++){
      for( i = 0; i<n-k; i++){
        int j = i + k -1 ;
        if( (str.charAt(i) == str.charAt(j)) && (dp[i+1][j-1]) ){
          dp[i][j] = true;
          if(k>max){
            start = i;
            max = k;
          }
        }
      }
    }
  System.out.println(str.substring(start,(start+max)));
  return max;
  }

  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      String str = br.readLine();

      int max = DP(str);
      System.out.println(max);

    }
  }
}
