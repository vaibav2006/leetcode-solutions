class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int cnt=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    fun(grid,i,j);
                }
            }
        }
        return cnt;
    }
    public static void fun(char[][] grid,int a,int b){
        if(a<0 || b<0 || a>=grid.length || b>=grid[0].length || grid[a][b]=='0'){
            return;
        }
        else{
            grid[a][b]='0';
            fun(grid,a+1,b);
            fun(grid,a-1,b);
            fun(grid,a,b+1);
            fun(grid,a,b-1);
        }
    }
}
