class Solution {
    public int numIslands(char[][] grid) {
        int num=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    num++;
                    find (grid, i, j);
                }
            }
        }
        
        return num;
    }
    
    
    public void find(char [][] grid,int i, int j){
        if((i<0 || i>=grid.length) || (j<0 || j>=grid[0].length)){
            return;
        }
        if(grid[i][j]=='1'){
             grid[i][j]='X';
            find(grid,i+1,j);
            find(grid,i-1,j);
            find(grid,i,j-1);
            find(grid,i,j+1);
        }
            return ;
    }
}
