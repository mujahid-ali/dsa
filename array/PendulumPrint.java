import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	
	public static void main(String[] args) throws java.lang.Exception{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			int n = Integer.parseInt(br.readLine().trim());
			
			int i=0;
			
			String[] str = br.readLine().split(" ");
			
			int arr[] = new int[n];
			for(i=0;i<n; i++){
				arr[i] = Integer.parseInt(str[i]);
				}
			Arrays.sort(arr);
			
			int result[] = new int[n];
			if(n%2 == 0){
				int mid = (n-1)/2;
				int j =1;
				result[mid] = arr[0];
				for(i=1;i<=mid;i++){
					result[mid+i] = arr[j++];
					result[mid-i] = arr[j++];
					}
				result[mid+i] = arr[j];	
				}	
			else{
				int mid = (n)/2;
				int j =1;
				result[mid] = arr[0];
				for(i=1;i<=mid;i++){
					result[mid+i] = arr[j++];
					result[mid-i] = arr[j++];
					
					}
				
				}	
			for(int k : result)
				System.out.print(k + " ");
			System.out.println();	
			
			
			}
		
		}
	
	}
