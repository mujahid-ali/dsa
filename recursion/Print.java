
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	
	static boolean flag = false;
	public static void main(String[] args)throws java.lang.Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			flag = false;
			int temp=n-5;
			System.out.print(n+ " ");
			print(n,temp);
			
			}
		
		}
	
	public static void print(int n, int temp){
		
		if(temp == n){
			System.out.println(temp);
			return;
		}
		
		if( temp >0 && !flag){
			System.out.print(temp + " ");
			 print(n,temp-5);
			 return;
			}
		if(temp<=0){
			flag = true;
			System.out.print(temp + " ");
			print(n,temp+5);
			return;
			}	
		if(temp>0 && flag){
			System.out.print(temp + " ");
			print(n, temp+5);
			return;
			}
		}
	
	}
