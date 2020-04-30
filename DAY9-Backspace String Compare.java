class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> a1= new Stack<Character>();
        for(char a: S.toCharArray()){
            if(a=='#'){
               if(!a1.isEmpty()) {a1.pop();}
            }
            else{
                a1.push(a);
            }
        }
         Stack<Character> b1= new Stack<Character>();
        for(char b: T.toCharArray()){
            if(b=='#'){
               if(!b1.isEmpty()) {b1.pop();}
            }
            else{
                b1.push(b);
            }
        }
        String x="";
          String y="";
        for(char i : a1){x+=i;}
        for(char j: b1){y+=j;}    
        return (x.equals(y))? true: false;
    
    }
}
