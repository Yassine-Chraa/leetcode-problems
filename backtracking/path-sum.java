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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return backTracking(root,targetSum-root.val);
    }
    public boolean backTracking(TreeNode node, int targetSum) {
        boolean temp;
        if(targetSum == 0 && node.left == null && node.right == null){
            return true;
        }
        if(node.left != null){
            temp = backTracking(node.left,targetSum-node.left.val);
            if(temp) return temp;
        }
        if(node.right != null) {
            temp = backTracking(node.right,targetSum-node.right.val);
            if(temp) return temp;
        }
        return false;
    }
}