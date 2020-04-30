class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> a= new PriorityQueue<Integer>((x,y)-> y-x);
        for(int i: stones){
            a.add(i);
        }
        
        while(a.size()>=2){
            int x=a.remove();
            int y=a.remove();
            if(x!=y){
                int res=(x>y)? x-y: y-x;
                a.add(res);
            }
        }
        
        return (a.size()==1)? a.remove(): 0;
    }
}
