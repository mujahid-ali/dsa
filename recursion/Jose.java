
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Josephus obj=new Josephus();
		    
		    int n,k;
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //System.out.println(obj.josephus(n,k));
		    System.out.println(obj.itr(n,k));
		    
		}
		
	}
}


/*This is a function problem.You only need to complete the function given below*/
class Josephus
{
	
	public int itr(int n, int k){
		int temp =1, result = 1;
		while(temp<= n){
			result = (result+k-1) %temp +1;
			temp++;
			
			}
		return result;	
		}
   public int josephus(int n, int k)
    {
        //Your code here
        if (n == 1)
			return 1;
		
		return (josephus(n-1,k) + k-1)%n+1 ;	
			
			
    }
}
