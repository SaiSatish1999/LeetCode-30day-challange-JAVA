class Solution {
    public int maxSubArray(int[] nums) {
       int localmax=nums[0];
        int globalmax=nums[0];
        
        for(int i=1; i<nums.length; i++){
            localmax=Math.max(localmax+nums[i],nums[i]);
            globalmax=Math.max(localmax,globalmax);
        }
        return globalmax;
    }
}
