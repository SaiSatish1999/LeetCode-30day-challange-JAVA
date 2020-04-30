class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int[]max=new int[1];
        helper(root,max);
        return max[0];
    }
     
    public int helper(TreeNode root,int[]max){
       if(root==null){
           return 0;
       }
        int left=helper(root.left,max);
        int right=helper(root.right,max);
        max[0]=Math.max(max[0],left+right);
        return  1+Math.max(left,right);
    }
}
