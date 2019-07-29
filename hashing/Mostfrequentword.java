
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
	static void helper(String str[], int n){
		HashMap<String, Integer>HM = new HashMap<String, Integer>();
		int i =0,count=0,max=0;
		for(i=0;i<n;i++){
			if(HM.containsKey(str[i])){
				HM.put(str[i],HM.get(str[i])+1);
				}
			else{
				HM.put(str[i],1);
				}	
			}
		for(i=0;i<n;i++){
			if(HM.get(str[i])>= max){
				max = HM.get(str[i]);
				count = i;
				}
			}
		System.out.println(str[count]);		
		}
	
	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader
		(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			int n = Integer.parseInt(br.readLine().trim());
			String str[] = br.readLine().split(" ");
			helper(str,n);
			}
		
		}	
	}
