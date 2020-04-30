class FirstUnique {
     HashMap<Integer,Integer> ma;
    Queue<Integer> li;
    public FirstUnique(int[] nums) {
        ma =new  HashMap<Integer,Integer>();
        li = new LinkedList<Integer>();
      for(int i=0; i<nums.length; i++){
          ma.put(nums[i],ma.getOrDefault(nums[i],0)+1);
          li.add(nums[i]);
      }
    }
    
    public int showFirstUnique() {
       while(!li.isEmpty() && ma.get(li.peek())>1){
           li.poll();
       }
        if(li.isEmpty()){
           return -1;
        }
        else{
            return li.peek();
        }
    }
    
    public void add(int value) {
       ma.put(value,ma.getOrDefault(value,0)+1);
       li.add(value);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
