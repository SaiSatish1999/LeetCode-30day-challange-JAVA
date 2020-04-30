class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>h= new HashMap<String,List<String>>();
        for(int i=0; i<strs.length; i++){
            char[] ar=strs[i].toCharArray();
            Arrays.sort(ar);
            String temp= new String(ar);
            if(!h.containsKey(temp)){
                List<String> te=new ArrayList<String>();
                te.add(strs[i]);
                h.put(temp,te);
            }
            else{
                h.get(temp).add(strs[i]);
            }
        }
      ArrayList<List<String>> res= new ArrayList<List<String>>();
        for(String a: h.keySet()){
            res.add(h.get(a));
        }
        
        return res;
    }
}
