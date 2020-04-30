class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left= new Stack<Integer>();
        Stack<Integer> star= new Stack<Integer>();
        for(int i=0; i<s.length(); i++){
            char temp=s.charAt(i);
            if(temp=='('){
                left.push(i);
            }
            
            else if(temp==')'){
                if(!left.isEmpty()){
                    left.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
                
            }
            else{
                star.push(i);
            }
        }
        
        while (!left.isEmpty()){
            if(star.isEmpty()|| star.pop()<left.pop()){return false;}
        }
        
        return true;
    }       
}
