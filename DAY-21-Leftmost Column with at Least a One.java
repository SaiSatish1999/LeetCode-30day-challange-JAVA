/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> a=binaryMatrix.dimensions();
        
           TreeSet<Integer> res= new TreeSet<Integer>();
        
            for(int j=a.get(1)-1; j>=0; j--){
                boolean flage=true;
                for(int i=a.get(0)-1; i>=0; i--){
                    if(binaryMatrix.get(i,j)==1){
                        res.add(j);
                        flage=false;
                        break;
                    }
                }
                if(flage){
                    break;
                }
            }
        
           if(res.isEmpty()){
                return -1;
           }
        
       return res.iterator().next();
        
    }
}
