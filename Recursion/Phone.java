
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
	public static void main(String[] args)throws java.lang.Exception{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());

	while(t-->0){
		int n = Integer.parseInt(br.readLine().trim());

		String str[] = br.readLine().split(" ");
		int i=0;
		int arr[] = new int[n];
		for(i=0; i<n; i++){
			arr[i] = Integer.parseInt(str[i]);
		}
		ArrayList<String> ar = new ArrayList<String>();
		String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 

		print(arr, 0, "",ar, map);
		StringBuffer sb = new StringBuffer();
		for(i=0;i<ar.size();i++)
		    sb.append(ar.get(i)+" ");
		    
		System.out.print(sb);
		System.out.println();

	}

}
	static void print(int arr[], int i, String str, ArrayList<String> ar, String[] map ){
		if( i == arr.length){

			ar.add(str);
			return;
		}
		String s2 = map[arr[i]];
		for(int j=0; j<s2.length(); j++){
			print(arr, i+1, str+s2.charAt(j),ar,map);	
		}


	}
}