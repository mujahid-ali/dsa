
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			long n = Long.parseLong(br.readLine().trim());
			
			//long rev = 0;
			while(n%10 == 0){
				n = n/10;
				}
			
			reverse(n);
			System.out.println();
			
			}
		
		}
		/*
		 * def reverse(n,a):
if n==0:
print(a)
return
a=(a*10)+(n%10)
reverse(n//10,a)

t=int(input())
for y in rang
		 * 
		 * /
	static void reverse(long n){
			
			if(n == 0)
			return;
			
			System.out.print(n%10);
			reverse(n/10);
			
			}	
			
	
	}
