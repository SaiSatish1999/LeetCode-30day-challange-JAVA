class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length==0){return -1;}
       int left=0;
        int right=nums.length-1;
        //find the pivot 
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        
        //in left we have starting index
        
        int start=0;
        int end=nums.length-1;
        
        if(target>=nums[left] && target<=nums[end]){
            start=left;
        }
        else{
            end=left;
        }
        
        while(start<=end){
           int  mid=start+(end-start)/2;
                
                if(nums[mid]==target){return mid;}
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
        return -1;
        
    }
}
