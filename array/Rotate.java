/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public static void reverse(int arr[], int start, int end){
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++; end--;
			
			}
		}
	
	public static void main (String[] args) throws java.lang.Exception {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		int t=0, N=0;
		
		t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			N = Integer.parseInt(br.readLine());
			int Array[] = new int[N];
			String[] a = br.readLine().split(" ");
			
			int d = Integer.parseInt(br.readLine());
			//Array = br.readLine();
			for(int i = 0; i<N; i++){
				Array[i] = Integer.parseInt(a[i]);
				
				}
			
			reverse(Array,0,d-1);
			reverse(Array,d,N-1);
			reverse(Array,0,N-1);	
			StringBuffer sb = new StringBuffer();
			for(int i =0; i<N; i++){
				sb.append(Array[i]+" ");
				}
				
			//sb.append("-1");	
			System.out.println(sb);	
			//sb.close();	
			//System.out.println(Arrays.toString(Array));	
			
			
			}
	}
}

