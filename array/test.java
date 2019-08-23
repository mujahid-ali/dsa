/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws java.lang.Exception {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		int t=0, N=0,G=0;
		
		t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			String arr[] = br.readLine().split(" ");
			N = Integer.parseInt(arr[0]);
			G = Integer.parseInt(arr[1]);
			
			int Array[] = new int[N];
			String[] a = br.readLine().split(" ");
			
			//Array = br.readLine();
			for(int i = 0; i<N; i++){
				Array[i] = Integer.parseInt(a[i]);
				
				}
			if(G>N){
				int start = 0, end = N-1;
				while(start<=end){
					int tmp = Array[start];
					Array[start] = Array[end];
					Array[end] = tmp;
					start++; end--;
					
					}
				/*
			    for(int k = 0; k<N;k++){
			        int tmp = Array[k];
			        Array[k] = Array[N-1-k];
			        Array[N-1-k] = tmp; 
			       
			    } */
			 System.out.println(Arrays.toString(Array));   
			   
			}
			else {    
			int i,j,g;	
			for(i=0; i<N; i+=G ){		
				 j=i;
				 if( (G+i)<N ){
					g = G +i;
					while(j<(g)){
					int temp = Array[j];
					Array[j] = Array[g-1];
					Array[g-1] = temp;
					j++;
					g--;
					//System.out.println("i= " + i + "j= "+j+ "G=" +G+ "g=" +g+ " N= "+N);					
					}
				
				}
				
				else{
					g = N-1;
					int temp = Array[j];
					Array[j] = Array[g];
					Array[g] = temp;
					j++; g--;
					}
				//System.out.println(" g = " +g);	
				 
				 //System.out.println("i = " +i);  	
				}
			}	
				StringBuffer sb = new StringBuffer();	
			for(int i =0; i<N; i++)
					sb.append(Array[i] + " ");
			
			System.out.println(sb);
			
			}
			
		br.close();	
	}
}

