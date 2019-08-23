import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public static void main(String[] args) throws java.lang.Exception{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			
			int n = Integer.parseInt(br.readLine().trim());
			String[] str = br.readLine().split(" ");
			
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
				arr[i] = Integer.parseInt(str[i]);
			
			ArrayList<Integer> odd = new ArrayList<Integer>();
			ArrayList<Integer> even = new ArrayList<Integer>();
			 
			int i=0;
			for(i=0; i<n; i++ ){
				if(arr[i]%2 == 0)
					even.add(arr[i]);
				else
					odd.add(arr[i]);
				}
			Collections.sort(odd, Collections.reverseOrder());
			Collections.sort(even);
			
			for(int k : odd)
				System.out.print(k + " ");
			for(int j : even)
				System.out.print(j + " ");
			System.out.println();	
				 
			}
		
		}
	
	
	}
