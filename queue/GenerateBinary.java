
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
  public static void main(String[] args)throws java.lang.Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t -- > 0 ){
      int n = Integer.parseInt(br.readLine());

      Queue<String> q = new LinkedList<>();
      q.add("1");
      while(n-- > 0){
        String s1 = q.peek();
        q.remove();

        System.out.print(s1 + " ");
        String s2 = s1;
        s1 = s1 + "0";
        q.add(s1);
        s2 = s2 + "1";
        q.add(s2);
      }
      System.out.println();
    }
  }
}
