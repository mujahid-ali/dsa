
static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M)
{

    // Your code here
    int count = 0;

    for(int i = 0; i<N; i++){
        for(int j = 0; j<M; j++){
            if(list.get(i).get(j) == 1){
                count+= dfs(list,i,j);
            }
        }


        }
        return count;
    }

static int dfs(ArrayList<ArrayList<Integer>> list, int i, int j){
    if( i<0 || i>= list.size() || j < 0 || j >= list.get(i).size() || list.get(i).get(j) == 0)
        return 0;
        list.get(i).set(j,0);
        dfs(list, i, j + 1);
        dfs(list, i, j - 1);
        dfs(list, i - 1, j);
        dfs(list, i - 1, j + 1);
        dfs(list, i - 1, j - 1);
        dfs(list, i + 1, j + 1);
        dfs(list, i + 1, j - 1);
        dfs(list, i + 1, j);

        return 1;

}



}
