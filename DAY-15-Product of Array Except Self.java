class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[][]res= new int[3][nums.length];
        int sum=1;
        for(int i=0; i<nums.length; i++){
            res[0][i]=sum;
            sum=sum*nums[i];
        }
        sum=1;
        for(int j=nums.length-1; j>=0; j-- ){
            res[1][j]=sum;
            sum=sum*nums[j];
        }
        
        for(int k=0; k<nums.length; k++){
            res[2][k]=res[0][k]*res[1][k];
        }
        
        return res[2];
    }
}
