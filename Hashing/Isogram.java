
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-->0){

			String str = br.readLine();
			//HashMap<String> hm = new HashMap<String>();
			int i=0;
			boolean flag = false;
			int n = str.length();
			int HM[] = new int[26];
			for(i=0;i<n;i++){
				HM[str.charAt(i)-'a']++;

				if(HM[str.charAt(i)-'a'] >1){
					flag = true;
					break;
					}
				}
			
			if(!flag)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}
}