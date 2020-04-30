class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0){return 0;}
        int[][] res= new int[matrix.length][matrix[0].length];
        int ma=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==0||j==0){res[i][j]=Integer.parseInt(""+matrix[i][j]);}
                else if(matrix[i][j]=='0'){res[i][j]=0;}
                else{
                    int temp=Math.min(Math.min(res[i-1][j],res[i][j-1]),res[i-1][j-1]);
                    res[i][j]=temp+Integer.parseInt(""+matrix[i][j]);
                     
                }  
               ma=Math.max(ma,res[i][j]);
            }
        }
        
        return ma*ma;
    }
}
