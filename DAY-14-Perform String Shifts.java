class Solution {
    public String stringShift(String s, int[][] shift) {
        String res=s;
        for(int[] x: shift){
          /*if(x[0]==0){
              res=lhelper(res,x[1]);
          }
           else if(x[0]==1){
                res=rhelper(res,x[1]);
            }*/
            
          res=(x[0]==0)? lhelper(res,x[1]) : rhelper(res,x[1]);
        }
            
        return res;
        
    }
    
    public String rhelper(String a, int n){
        
        String temp=a.substring(a.length()-n,a.length());
        String temp1=a.substring(0,a.length()-n);
        return temp+temp1;
        
    
    }
    
    public String lhelper(String a, int n){
         
        String temp=a.substring(n,a.length());
        String temp1=a.substring(0,n);
        return temp+temp1;
        
    }
}
