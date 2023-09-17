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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root != null && root.val == key){
            TreeNode temp = root;
            if(root.right != null){
                temp = root.right;
                while(temp.left != null){
                    temp = temp.left;
                }
                temp.left = root.left;
            
                return root.right;
            }else{
                if(root.left != null){
                    return root.left;
                }else{
                    return null;
                }
            }
        }else{
            RecurDelete(root,key);
            return root;
        }
    }

    public Boolean RecurDelete(TreeNode root, int key) {
       TreeNode temp,c;
        if(root != null){
            if(root.val == key){
                return true;
            }else{
                if(RecurDelete(root.left,key)) {
                    c = root.left;
                    if(c.right != null) {
                        root.left = c.right;
                        temp = root.left;
                        while(temp.left != null){
                            temp = temp.left;
                        }
                        temp.left = c.left;
                    }
                    else{
                        root.left = c.left;
                    }
                    return false;
                }
                if(RecurDelete(root.right,key)) {
                    c = root.right;
                    if(c.right != null) {
                        root.right = c.right;
                        temp = root.right;
                        while(temp.left != null){
                            temp = temp.left;
                        }
                        temp.left = c.left;
                    }
                    else{
                        root.right = c.left;
                    }
                    return false;
                }
            }
        }
        return false; 
    }
}