
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
	public static void main(String[] args)throws java.lang.Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-->0){

			String str = br.readLine();

			removeduplicate(str);
		}
	}

	static void removeduplicate(String str){
		int i=0;
		char arr[] = new char[n];
		for(i=0;i<str.length();i++){
			temp = str.charAt(i);

			while( (i+1)<str.length() && temp == charAt(i+1) ){
				i++;
			}
			arr = str.charAt(i);
		}
		System.out.println(arr);
	}


}