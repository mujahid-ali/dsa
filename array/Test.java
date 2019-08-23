/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
		    int N = Integer.parseInt(br.readLine());
		    String str[] = br.readLine().split(" ");
		    int arr[] = new int[N];
		    for(int j=0;j<N;j++){
		        arr[j] = Integer.parseInt(str[j]);
		    }
		    int ascCount = 0;
		    int descCount = 0;
		    int max = arr[0];
		    for(int j=0;j<N-1;j++){
		        if(arr[j+1]>max){
		            max = arr[j+1];
		        }
		        if(arr[j] > arr[j+1]){
		            descCount++;
		        }else if(arr[j]<arr[j+1]){
		            ascCount++;
		        }
		    }
		    //System.out.println(ascCount);
		    if(ascCount == N-1 ){
		        System.out.println(max+" "+1);
		    }else if(descCount == N-1 ){
		        System.out.println(max+" "+2);
		    }else if(ascCount == 1 && descCount != 0){
		        System.out.println(max+" "+3);
		    }else if(descCount == 1 && ascCount != 0){
		        System.out.println(max+" "+4);
		    }
		}	
	}
}
