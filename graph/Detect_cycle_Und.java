
/*Detec cycle in undirected graph */

class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
       // add your code here
       boolean visited[] = new boolean[V];
       for(int i=0; i<V; i++)
        visited[i] = false;

        for(int i = 0; i<V; i++){
            if(!visited[i]){
                if(isCyclicUtil(list,i,-1,visited))
                    return true;
            }
        }
        return false;
    }

    public static boolean isCyclicUtil(ArrayList<ArrayList<Integer>> list, int v, int parent, boolean visited[]){

        visited[v] = true;
        Iterator it = list.get(v).listIterator();
        while(it.hasNext()){
            int k = (int) it.next();
            if(!visited[k]){
                if(isCyclicUtil(list,k,v,visited))
                    return true;
            }
            else{
                if(k != parent)
                    return true;
            }
        }
        return false;
    }
}
