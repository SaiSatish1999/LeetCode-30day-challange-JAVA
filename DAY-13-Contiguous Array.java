class Solution {
    public int findMaxLength(int[] nums) {
        int dif=0;
        HashMap<Integer,Integer> a= new HashMap<Integer,Integer>();
        a.put(0,-1);
        int ml=0;
        for(int i=0; i<nums.length; i++){
            dif+=(nums[i]==0)? -1: 1;
            if(a.containsKey(dif)){
               ml=Math.max(ml,i-a.get(dif));
            }
            else{
                a.put(dif,i);
            }
        }                                                                                                                                                                                                                                                                                                                                                       
        return ml;
    }
}
