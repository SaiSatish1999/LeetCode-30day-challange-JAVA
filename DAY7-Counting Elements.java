class Solution {
    public int countElements(int[] arr) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        int res=0;
        for(int i : arr){
            a.add(i);
        }
        
        for(int j: a){
            int temp=j+1;
            if(a.contains(temp)){res+=1;}
        }
        
        return res;
        
    }
}
