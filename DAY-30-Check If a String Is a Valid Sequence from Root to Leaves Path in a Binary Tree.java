/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if(root==null){return false;}
        return helper(root,arr,0);
    }
    
    public boolean helper(TreeNode root, int[]arr, int cur){
      if(root==null || arr.length==0 || cur>=arr.length){return false;}
        
        if((root.left==null && root.right==null) && (root.val==arr[arr.length-1])){ return true;}
         boolean ans=false;
        if(root.val==arr[cur]){
            ans=helper(root.left,arr,cur+1) || helper(root.right,arr,cur+1);
        }
        
        return ans;
        
    }
}
