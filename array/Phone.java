import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	static final String[] hashTable = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static void main(String[] args)throws java.lang.Exception{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
			
		int t = Integer.parseInt(br.readLine());
	/*	
		String a2[] = {a,b,c};
		String a3[] = {d,e,f};
		String a4[] = {f,g,i};
		String a5[] = {j,k,l};
		String a6[] = {m,n,o};
		String a7[] = {p,q,r,s};
		String a8[] = {t,u,v};
		String a9[] = {w,x,y,z};
		*/
		//int num = {2,3,4,5,6,7,8,9};
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			int i=0;
			
			String[] str = br.readLine().split(" ");
			int arr[] = new int[n];
			for(i=0;i<n;i++){
				arr[i] = Integer.parseInt(str[i]);
				}
			print(arr,n);	
			
			}
		}
	static void print(int arr[], int n){
		char[] result = new char[n+1];
		result[n] = '\0';
		printUtils(arr, 0, result, n); 
		
		}	
	
	static void	printUtils(int[] number, int curr_digit, char[] output, int n){
		int i=0;
		//base case
		if(curr_digit == n){
			System.out.print(output);
			System.out.print(" ");
			return;
			}
		
		while(curr_digit<n){
			while(i<hashTable[number[curr_digit]].length()){
				
				if( number[curr_digit] == 0 || number[curr_digit] == 1){
					curr_digit++;
					continue;
					}
				output[curr_digit] = hashTable[number[curr_digit]].charAt(i);
				printUtils(number, curr_digit+1, output, n);
				i++;
				}
				
			curr_digit++;
			}
		
		}
	
}
