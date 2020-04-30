class Solution {
    public int subarraySum(int[] nums, int k) {
       int res=0;
        HashMap<Integer,Integer> a= new HashMap<Integer,Integer>();
        a.put(0,1);
        int sum=0;
        for(int i=0; i<nums.length; i++){
             sum+=nums[i];
            
            if(a.containsKey(sum-k)){
                res+=a.get(sum-k);
            }

            a.put(sum,a.getOrDefault(sum,0)+1);
            
        }
        
        return res;
    }
}
