
/*
Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
1. The amount of petrol that every petrol pump has.
2. Distance from that petrol pump to the next petrol pump.

Your task is to complete the function tour() which returns an integer denoting the first point
 from where a truck will be able to complete the circle (The truck will stop at each petrol pump
  and it has infinite capacity).

Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.
Input:
1
4
4 6 6 5 7 3 4 5
Output:
1

Explanation:
Testcase 1: there are 4 petrol pumps with amount of petrol and distance to next
petrol pump value pairs as {4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point
from where truck can make a circular tour is 2nd petrol pump. Output in this case is 1 (index of 2nd petrol pump).
*/
{
import java.util.*;
class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}

			System.out.println(new GfG().tour(p,d));
		t--;
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
// In java function tour() takes two arguments array of petrol
// and array of distance
class GfG
{
    int tour(int petrol[], int distance[])
    {
	// Your code here

        int n = petrol.length;
        int start = 0;
        int end = 1;
        cp = petrol[start] - distance[start];

        while(end != start || cp < 0 ){

          while(end != start && cp < 0){
            cp -= petrol[start] - distance[start];

            start = (start+1) %n;

            if(start == 0)
              return -1;
          }

          cp += petrol[end] - distance[end];
          end = (end+1)%n;
        }

        return start;
    }
}
