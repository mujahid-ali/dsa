
/*https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph*/
class Traversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
       // add your code here
       LinkedList<Integer> q = new LinkedList<Integer>();
       q.add(s);
       vis[s] = true;
       while(q.size() != 0){
           int x = q.poll();
           System.out.print(x + " ");

           Iterator it = list.get(x).listIterator();
           while(it.hasNext()){
               int new_vertex = (int)it.next();
               if(!vis[new_vertex]){
                   vis[new_vertex] = true;
                   q.add(new_vertex);
               }
           }
       }
    }
}
