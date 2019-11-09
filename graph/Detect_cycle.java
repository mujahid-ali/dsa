
/* DetectCycle in directed graph*/
{
import java.util.*;
import java.io.*;
import java.lang.*;
class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
/*
ArrayList<ArrayList<Integer>> list: to represent graph containing 'v'
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        // add your code here
        //int n = list.size();
        boolean vis[] = new boolean[V];
        boolean cyc[] = new boolean[V];
        int i = 0;
        for(i=0;i<V; i++){
            vis[i] = false;
            cyc[i] = false;
        }
        for(i=0; i<V; i++){
            if(isCyclicUtil(list,vis,cyc,i))
                return true;
        }
        return false;
    }

    static boolean isCyclicUtil(ArrayList<ArrayList<Integer>> list, boolean vis[], boolean cyc[], int i){

        if(cyc[i])
            return true;

        if(vis[i])
            return false;
        vis[i] = true;
        cyc[i] = true;

        Iterator it = list.get(i).listIterator();
        while(it.hasNext()){
            int k = (int) it.next();
            if( isCyclicUtil(list,vis,cyc,k)){
                return true;
            }
        }
        cyc[i] = false;
        return false;
    }
}
