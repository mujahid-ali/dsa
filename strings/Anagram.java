import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while(t-- >0){
      String str[] = br.readLine().split(" ");
      String str1 = str[0];
      String str2 = str[1];
      find_Anagram(str1, str2);
      //using_xor(str1, str2);
    }
	}

  static void using_xor(String str1m String str2){
    int n1 = str1.length();
    int n2 = str2.length();

    if(n1 != n2){
      System.out.println("NO");
      return;
    }
    int xor = 0;
    for(int i = 0; i<n; i++){
      xor = xor ^ str1.charAt(i);
      xor = xor ^ str2.charAt(i);
    }
    if(xor == 0)
      System.out.println("YES");
    else
      System.out.println("NO");
  }

  static void find_Anagram(String str1, String str2){
    int n1 = str1.length();
    int n2 = str2.length();
    if(n1 != n2){
      System.out.println("NO");
      return;
    }

    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();

    for(char c: arr1){
      if(hm.containsKey(c)){
        hm.put(c,hm.get(c) + 1);
      }
      else{
        hm.put(c,1);
      }
    }

    for(char c: arr2){
      if(hm.containsKey(c)){
        hm.put(c, hm.get(c) - 1);
      }
    }
    for(char c: arr1){
      if(hm.containsKey(c)){
        int x = hm.get(c);
        if(x != 0){
          System.out.println("NO");
        }
      }
    }

    System.out.println("YES");

  }
}
