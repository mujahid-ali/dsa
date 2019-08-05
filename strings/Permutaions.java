
/*
Given a string S. The task is to print all permutations of a given string.
i: ABC
O:  ABC ACB BAC BCA CAB CBA 
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	static ArrayList<String> al = new ArrayList<String>();
	public static String sortString(String str){
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);

	}
	public static void helper(String str, String res){
		int n = str.length();
		if(n == 0){
			al.add(res);
			System.out.print(res + " ");
			return;
		}

		int i =0;
		for(i=0; i<n; i++){
			char c = str.charAt(i);
			helper(str.substring(0,i) + str.substring(i+1,n), res+c);
		}
	}

	public static void main(String[] args)throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-->0){
			String str = br.readLine();
			String str2 = sortString(str);
			helper(str2,"");
			StringBuffer sb = new StringBuffer();
			for(String s:al)
				sb.append(s + " ");

			//System.out.println(sb); It's not working while submitting
			System.out.println();
		}
	}
}