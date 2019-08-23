
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main(String[] args) throws java.lang.Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			
			String[] str = br.readLine().split(" ");
			int i=0;
			int arr[] = new int[n];
			int temp[] = new int[n];
			for(i=0; i<n; i++){
				arr[i] = Integer.parseInt(str[i]);
				}
			StringBuffer sb= new StringBuffer();
			//sb.append(arr[n-1] + " ");
			int max = arr[n-1];
			temp[0] = max;
			int count =1;
			for(i=n-2; i>=0; i--){
				if(arr[i] >= max){
					
					max = arr[i];
					temp[count] = max;
					count++;
					//sb.append(max + " ");
					}			
				}
			for(i=count-1;i>=0;i--){
				sb.append(temp[i]+ " ");
				}	
			System.out.println(sb);
			
			}
		
		}
	
	
	}

