import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String[] args) throws java.lang.Exception{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0){
			int n = Integer.parseInt(br.readLine().trim());
			
			String[] str = br.readLine().split(" ");
			
			int arr[] = new int[n];
			
			int i =0;
			for(i=0;i<n;i++){
				arr[i] = Integer.parseInt(str[i]);
				}
			int m = Integer.parseInt(br.readLine().trim());
			
			if( n== m){
				int min = arr[0],max = arr[0];
				for(i=1; i<n; i++){
					if(arr[i] < min)
						min = arr[i];
					if(arr[i] > max)
						max = arr[i];
					}
				System.out.println(max-min);
				
				}
			else{
				Arrays.sort(arr);
				//for(i=0;i<n;i++)
					//System.out.print(arr[i] + " ");
				//System.out.println(arr[m]);	
				int diff= arr[m-1] - arr[0];
				
				for(i=1; (m-1+i)<n; i++){
					if((arr[m-1+i] - arr[i]) <= diff){
						//System.out.println("diff before = " + diff);
						diff = arr[m-1+i] - arr[i];
						//System.out.println(" dif after = "+diff);
						
						}
					
					}
				System.out.println(diff);
				}	
			
			
			}
		
		}
	
	
	}

