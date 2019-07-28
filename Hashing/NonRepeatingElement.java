
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{

	public static boolean helper(long arr[], int n){
		HashMap<Long,Long> hm = new <Long,Long>();
		int i;
		boolean flag = false;
		for(i=0;i<n;i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i],hm.get(arr[i])+1)
			}else
				hm.put(arr[i],1);
		}
		for(i=0;i<n;i++){
			if(hm.get(arr[i]==1)){
				flag = true;
				System.out.println(arr[i]);
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Interger.parseInt(br.readLine());

		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split();
			int i =0;
			long arr[] = new long[n];
			for(i=0;i<n;i++){
				arr[i] = Long.parseLong(str[i]);
			}
			boolean flag = helper(arr,n);

			if(!flag)
				System.out.println("0");
		}
	}
}
