
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			String str[] = br.readLine().split(" ");
			int m = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);
			
			int result = paths(m,n);
			System.out.println(result);
					
			}
		}
	
	static int paths(int m, int n){
		if( m==1 || n==1)
		return 1;
		
		return (paths(m-1,n) +  paths(m, n-1));
		
		}	
	
	}
