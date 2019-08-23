
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	
	public static void main(String[] args) throws java.lang.Exception{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0){
			int n = Integer.parseInt(br.readLine().trim());
			String str[] = br.readLine().split(" ");
			int i=0;
			int arr[] = new int[n];
			for(i=0; i<n; i++){
				arr[i] = Integer.parseInt(str[i]);
				}
			int max = arr[0];	
			int maxindex = 0;
			for(i=0;i<n;i++){
				if(arr[i] > max){
					max = arr[i];
					maxindex = i;
					}			
				}	
			if(arr[maxindex] == arr[n-1] && arr[0] < arr[1])
				System.out.println(max+ " 1");
			else if(arr[maxindex -1] < arr[maxindex +1] || arr[0]>arr[1])
				System.out.println(max + " 3");
			else if(arr[maxindex] == arr[0])
				System.out.println(max + " 2");
			else if(arr[maxindex -1] > arr[maxindex +1])
				System.out.println(max + " 4");
			}
		
		}
	
	}
