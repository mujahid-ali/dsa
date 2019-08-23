import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.HashMap;
class Count
{	
	    public static void countDistinct(int A[], int k, int n)
    {
		int i,j,count=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		//System.out.println("Size of map is= " +map.size());
		for(i=0;i<n-k;i++){
			count = 0;
			for(j=i;j<k+i;j++){
				map.put(A[j],A[j]);
				}
		System.out.print(map.size()+" ");
		map.clear(); 		
			}
		
		for(j=n-k;j<n;j++)
			map.put(A[j],A[j]);	
		System.out.print(map.size());
			
    }

	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			//int k = sc.nextInt();
			
			//GfG g = new GfG();
			countDistinct(a,k,n);			
			//System.out.println();
		
		t--;
		}
	}
}

