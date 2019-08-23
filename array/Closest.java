
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main(String[] args) throws java.lang.Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0){
			String[] str1 = br.readLine().split(" ");
			int n = Integer.parseInt(str1[0]);
			int d = Integer.parseInt(str1[1]);
			//int n = Integer.parseInt(br.readLine());
			
			String[] str = br.readLine().split(" ");
			int i=0;
			int arr[] = new int[n];
			//int temp[] = new int[n];
			for(i=0; i<n; i++){
				arr[i] = Integer.parseInt(str[i]);
				}
			StringBuffer sb= new StringBuffer();
			//sb.append(arr[n-1] + " ");
			//int max = arr[n-1];
			//temp[0] = max;
			int count =0;
			int min = Math.abs(d-arr[0]);
			for(i=1; i<n; i++){
				if( Math.abs(d - arr[i]) <= min ){
					count = i;
					min = Math.abs(d - arr[i]);
					}
								
				}
			System.out.println(arr[count]);	
			}
		
		}
	
	
	}


