import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
	
	static void printmax(int arr[], int n, int k){
		
		Deque<Integer> Qi = new LinkedList<Integer>();
		
		int i;
		for(i=0;i<k;++i){
			while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();
				
			Qi.addLast(i);	
			}
		for(; i<n; ++i){
			System.out.print(arr[Qi.peek()] + " ");
			
			while((!Qi.isEmpty()) && Qi.peek() <= i-k )
				Qi.removeFirst();
				
			while((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();
				
			Qi.addLast(i);		
			}	
		System.out.println(arr[Qi.peek()]);	
		}
	
	public static void main(String[] args) throws java.lang.Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			
			String str2[] = br.readLine().split(" ");
			int i =0;
			int arr[] = new int[n];
			for(i=0;i<n;i++){
				arr[i] = Integer.parseInt(str2[i]);
				}
				
			printmax(arr, n, k);	
			/*
			int j=0;
			for(i=0;i<n-k;i++){
				int max = arr[i];
				for(j=i;j<k+i;j++){
					if(arr[j] >= max){
						max = arr[j];
						}
					}
				System.out.print(max +" ");	
				}
			int max = arr[i];	
			for(j=i;j<k+i;j++){
				
				if(arr[j] > max)
					max =arr[j];
				}
			System.out.println(max);	
			
			*/ 
			}
		}
	
	}
