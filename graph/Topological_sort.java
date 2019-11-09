
class TopologicalSort
{
    static int[] topoSort(ArrayList<ArrayList<Integer>> list, int N)
    {
       // add your code here
       Stack<Integer> stack = new Stack<Integer>();

       boolean visited[] = new boolean[N];
       for(int i = 0; i<N; i++){
           visited[i] = false;
       }

       for(int i = 0; i<N; i++){
           if(!visited[i])
            top_Util(i,stack,visited,list);
       }

       int res[] = new int[N];
       int i = N-1;
       while(!stack.isEmpty()){
           res[i] = stack.pop();
           i--;
       }
       return res;
    }

    public static void top_Util(int i, Stack<Integer> stack, boolean visited[], ArrayList<ArrayList<Integer>> list){

        visited[i] = true;
        Iterator it = list.get(i).listIterator();

        while(it.hasNext()){
            int k = (int) it.next();
            if(!visited[k])
                top_Util(k, stack, visited, list);
        }

        stack.push(i);
    }
}
