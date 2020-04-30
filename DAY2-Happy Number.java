class Solution {
    public boolean isHappy(int n) {
        
        int slow= n;
        int fast=n;
         
        do{
            slow=findsq(slow);
            fast=findsq(findsq(fast));
        }
        while(slow!=fast);
            
        return (slow==1);
    }
    
    public int findsq(int n){
          int temp=0;
        while(n>0){
    		    temp+=(n%10)*(n%10);
    		    n=n/10;
            }
             return temp;
    }
}
