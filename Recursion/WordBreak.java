
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	static TreeSet<String> t=new TreeSet<>();
	
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		while(test-->0){
            t=new TreeSet<String>();
			int n = Integer.parseInt(br.readLine().trim());
			String str[] = br.readLine().split(" ");
			int i=0;
			HashMap<String, Integer> h = new HashMap<>();
			for(i=0;i<n;i++){
				h.put(str[i],str[i].length());
			}
			String pattern = br.readLine();
			//Input end

			//calling helper function to get the desired sentence
			helper(h,pattern," ");

			//Writing ouput to StringBuffer for fast processing to console.
            StringBuffer b=new StringBuffer();
           
           for(String str1:t)
           b.append("("+str1+")");
           System.out.println(b);
		}

	}

	static void helper(HashMap<String, Integer> h, String pat, String res){
		int n = pat.length();
		if(n == 0){
		    res = res.trim();
			t.add(res);
			return;
		}

		for(String k:h.keySet()){
			int m = h.get(k);
			if(m>n)
				continue;
			else if(n>=m){
				if(pat.substring(0,m).equals(k))
					helper(h,pat.substring(m),res+" "+k);
				else
					continue;
			}
		}
	}

}