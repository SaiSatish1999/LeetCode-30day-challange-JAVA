class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> a= new HashSet<Integer>();
        for(int i: nums){
            if(!a.add(i)){
                a.remove(i);
            }
        }
        
        return a.iterator().next();
    }
}
