class Solution {
    public int minPathSum(int[][] grid) {
       int[][] me=new int[grid.length][grid[0].length];
        if(grid.length==0){ return 0;}
        return helper(grid,0,0,me);
    }
    
    public int helper(int[][] grid, int i, int j,int [][]me){
        
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        
        if(me[i][j]!=0){
            return me[i][j];
        }
        int min=grid[i][j]+Math.min(helper(grid,i,j+1,me),helper(grid,i+1,j,me));
        me[i][j]=min;
            return  min;
    }
    
    
    
}
