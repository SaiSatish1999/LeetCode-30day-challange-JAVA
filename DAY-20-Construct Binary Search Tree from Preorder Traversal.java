/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){return null;}
        TreeNode root= new TreeNode(preorder[0]);
        for(int i=1; i<preorder.length; i++){
            root=construct(root,preorder[i]);
        }   
         return root;
    }
    
      public TreeNode  construct(TreeNode root, int val){
          if(root==null){
              return new TreeNode(val);
          }
          else if(root.val>val){
              TreeNode leftx=construct(root.left,val);
              root.left=leftx;
              return root;
          }
              TreeNode rightx=construct(root.right,val);
              root.right=rightx;
              return root;
          }
      }
