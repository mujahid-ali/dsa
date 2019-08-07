
import java.io.*;
import java.io.*;
import java.lang.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-->0){
      int n = Integer.parseInt(br.readLine());
      String str = br.readLine();
      int i = 0;
      int count = 0;
      for(i=0; i<n; i++){
        if(str.charAt(i) == '1')
          count++;
      }
      System.out.println( ((count)*(count-1)/2) );
    }
  }
}
