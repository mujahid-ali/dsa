
//Majority element occur more than n/2 times in array 
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
		    for(int i = 0; i<n; i++){
		        arr[i] = Integer.parseInt(str[i]);
		    }

		    find_Majority(arr,n);
		}
	}

	static void find_Majority(int arr[], int n){
	    int count = 1;
	    int candid = arr[0];
	    int i =0;
	    for(i=1;i<n;i++){
	        if(arr[i] == candid){
	            count++;
	        }
	        else{
	            count--;
	        }
	       if(count == 0){
	           candid = arr[i];
	           count = 1;
	       }
	    }
	    int majority = 0;
	    for(i = 0; i<n; i++ ){
	        if(arr[i] == candid){
	            majority++;
	            if(majority > (n/2))
	                break;
	        }
	    }
	    if(majority > (n/2))
	        System.out.println(candid);
	   else
	        System.out.println("-1");

	}
}
