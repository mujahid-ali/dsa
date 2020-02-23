/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws java.lang.Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    String str[] = br.readLine().split(" ");

		    int arr[] = new int[n];
		    for(int i = 0 ; i<n; i++){
		        arr[i] = Integer.parseInt(str[i]);
		    }

		   int result = waterTrapped(arr,n);
		   System.out.println(result);
		}
	}

	public static int waterTrapped(int arr[], int n){
	    int lo = 0;
	    int hi = n-1;
	    int leftMax = 0;
	    int rightMax =0;
	    int result = 0;

	    while(lo <= hi){
	        if(arr[lo] < arr[hi]){
	            if(arr[lo] > leftMax){
	                leftMax = arr[lo];
	            }
	            else{
	               result += leftMax - arr[lo];
	               lo++;
	            }
	        }

	        else{
	            if(arr[hi] > rightMax){
	                rightMax = arr[hi];
	            }
	            else{
	                result += rightMax - arr[hi];
	                hi--;
	            }
	        }
	    }

	    return result;
	}

}
