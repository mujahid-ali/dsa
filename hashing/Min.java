
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
		static void helper(String str, String pat ){
		int n = str.length();
		int n2 = pat.length();
		int i=0;
		boolean flag = false;
		for(i=0;i<n2; i++){
			 for(int j =0; j<n; j++){
				if( pat.charAt(i) == str.charAt(j));
				{
				flag = true;
				System.out.println(str.charAt(j));
				break;
				}
			 }
		}
		if(!flag){
			System.out.println("$");
		}
	}
	
	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t-->0){
			String str = br.readLine();
			String pat = br.readLine();
			helper(str,pat);
		}
	}
			
}
