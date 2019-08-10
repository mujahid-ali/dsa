
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{

  // Method1 DP O(n^2) time & O(n^2) space
  static int DP(String str){
    int n = str.length();
    int i=0,max=1, start = 0;

    //Create a boolean array, if str is palindrom then true else false
    boolean dp[][] = new boolean[n][n];
    //all string of lenght 1 are palindroem :)
    for(i=0; i<n; i++)
      dp[i][i] = true;

    //palindrome of length=2
    for(i=0; i<n-1; i++){
      if( (str.charAt(i) == str.charAt(i+1) )){
        dp[i][i+1] = true;
        if( max ==1 )
          start = i;
        max =2;
      }
    }

    // palindrom of length >2
    for(int k=3; k<=n; k++){
      for( i = 0; i<n-k+1; i++){
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

  //Method 2 wihtout extra space and O(n^2) time
  static void LP(String str){
    int n = str.length();
    if(n < 1) return;
    int i,start =0, end =0, max = 1;
    for(i =1; i<n; i++){

      int len1 = ExpandAroundCentre(str, i-1, i); //even length palindrom
      int len2 = ExpandAroundCentre(str, i-1, i+1); //odd length palindrom
      int len = Math.max(len1,len2);
      if(len> max){
        max = len;
        start = i - 1;
      }
    }
    System.out.println("Max = "+max + "start = " +start + "i = "+i);
    System.out.println(str.substring(start, start+max-1));
  }

  private static int ExpandAroundCentre(String str, int low, int high){
    while( (low>=0 && high<str.length()) && (str.charAt(low) == str.charAt(high)) ){
      low--;
      high++;
    }
    return high - low  ;
  }

  static void Manacher(String str){
    //
  }

  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-->0){
      String str = br.readLine();

      //int max = DP(str);
      LP(str);
      //System.out.println(max);

    }
  }
}
