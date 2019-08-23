
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			
			String str = br.readLine();
			System.out.println(str);
			
			printDistinctPermutn(str,"");
			System.out.println();
			//permutation("",str);
			
			}
		}
		
		static void permutation(String prefix, String str) {
int n = str.length();
if (n == 0)
System.out.print(prefix + " ");
else {
for (int i = 0; i < n; i++)
permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
}
}
		
		static void printDistinctPermutn(String str,  
                                     String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
  
            // print ans 
            System.out.print(ans + " "); 
            return; 
        } 
  
        // Make a boolean array of size '26' which 
        // stores false by default and make true  
        // at the position which alphabet is being 
        // used 
        boolean alpha[] = new boolean[26]; 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // If the character has not been used  
            // then recursive call will take place.  
            // Otherwise, there will be no recursive 
            // call 
            if (alpha[ch - 'a'] == false) 
                printDistinctPermutn(ros, ans + ch); 
            alpha[ch - 'a'] = true; 
        } 
    } 
  
		/*
		static void permute(String s, String chosen){
			if(s.length() == 0){
				System.out.println(chosen);
				return;
				}
			
			boolean alpha[] = new boolean[26];	
				
				for(int i=0; i<s.length(); i++){
					char c = s.charAt(i);
					
					//Might need to use SringBuffer or StringBuilder
					String str = s.substring(0,i) + s.substring(i+1);					
					if( alpha[c - 'a'] == false )
						{
							permute(str,chosen+c);
						}
					alpha[c - 'a'] = true;	
					
					}
					
			
			}
			*/ 
	
	}
