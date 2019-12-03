/*
Given a string S, find length of the longest substring with all distinct characters.
  For example, for input "abca", the output is 3 as "abc" is the longest substring with
  all distinct characters.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- > 0){
      String str = br.readLine();

      //int res = longest_diff_char(str);//not working for aewergrththy
      //int res = longest_diff_char_2(str);// not working for aewergrththy
      int res = longest_diff_char_3(str);
      System.out.println(res);
    }
	}

  static int longest_diff_char_3(String str){
    int local = 0, max = 0, i;
    HashMap<Character, Integer> hm = new HashMap<Character,Integer>();

    for(i = 0; i<str.length(); i++){
      char c = str.charAt(i);
      if(!hm.containsKey(c)){
        hm.put(c,i);
        local++;
        max = Math.max(local,max);
      }
      else{
        i = hm.get(c);
        hm.clear();
        local = 0;
      }
    }
    return max;
  }

  static int longest_diff_char_2(String str){
    int local = 0;
    int max = -1;
    int i;
    int visited[] = new int[256];

    for(i = 0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(visited[ch - 'a'] == 1){
        visited = new int[256];
        visited[ch - 'a'] = 1;
        local = 1;
      }
      else{
        visited[ch - 'a'] = 1;
        local++;
      }
      max = Math.max(local,max);
    }
    return max;
  }

  static int longest_diff_char(String str){
    int n = str.length();
    int max = 1;// glabal max
    int lmax = 1;//local max
    int prev,i;
    int visited[] = new int[256];
    for(i = 0; i<256; i++){
      visited[i] = -1;
    }
    visited[str.charAt(0)] = 1;

    for(i = 1; i<n; i++){
      prev = visited[str.charAt(i)];

      if(prev == -1 || i - lmax > prev){
        lmax++;
      }
      else{
        if(lmax > max)
          max = lmax;

        lmax = i - prev;
      }

      visited[str.charAt(i)] = i;
    }
    if(lmax > max)
      max = lmax;

    return max;
  }
}
