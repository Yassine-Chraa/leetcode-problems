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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(insert(root,val)){
            return new TreeNode(val);
        }else{
            return root;
        }  
    }

    public Boolean insert(TreeNode root, int val) {
       TreeNode newTreeNode = new TreeNode(val);
        if(root != null){
            if(root.val > val){
                if(insert(root.left,val)){
                    root.left = newTreeNode;
                }
                return false;  
            }else{
                if(insert(root.right,val)){
                    root.right = newTreeNode;
                }
                return false;
            }
        }else{
            return true;
        }
    }
}
