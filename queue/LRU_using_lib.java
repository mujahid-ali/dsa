{
import java.util.Scanner;
import java.util.*;
class LRU_Cache
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Set<Integer> s = new HashSet<Integer>() ;
				int n = sc.nextInt();
				LRUCache g = new LRUCache(n);
			int q = sc.nextInt();

			while(q>0)
			{

				String c = sc.next();
			//	System.out.println(c);
				if(c.equals("GET"))
				{
					int x = sc.nextInt();
					System.out.print(g.get(x)+" ");
				}
				if(c.equals("SET"))
				{
					int x = sc.nextInt();
					int y  = sc.nextInt();
					g.set(x,y);
				}

			q--;
			//System.out.println();
			}
		t--;
		System.out.println();
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
/*You are required to complete below class */
class LRUCache {

   //Map<Integer,Integer> map;
   LinkedHashMap<Integer, Integer> map;
    int capacity;
    /*Inititalize an LRU cache with size N */
    public LRUCache(int N) {
       //Your code here LinkedHashMap(int capacity, float fillRatio, boolean Order)
       map = new LinkedHashMap<Integer, Integer>( N, 0.75f,  true){
            public boolean removeEldestEntry(Map.Entry eldest)
            {
                return size() > N;
            }
        };

    }

    /*Returns the value of the key x if
     present else returns -1 */
    public int get(int x) {
       //Your code here set lru getOrDefault(x,-1);
       /*if(map.contains(x)){
           return x;
       }
       else{
           return -1;
       }
       */
       return map.getOrDefault(x,-1);
    }

    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
       //Your code here
       map.put(x,y);
    }
}
