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
    private List<List<Integer>> res;
    private Integer h;
    public List<List<Integer>> levelOrder(TreeNode root) {
        res = new ArrayList<>();
        int i = 0;
        h = height(root,0);
        while(i<h){
            res.add(new ArrayList<>());
            i++;
        }
        if(h>0) res.get(0).add(root.val);
        bfs(root,1); 
        return res;
    }
    public int height(TreeNode node,int h) {
        if(node == null) return h;
        int left = height(node.left,h+1);
        int right = height(node.right,h+1);

        return left>right?left:right;
    }
    public void bfs(TreeNode node,int index) {
        if(index<h){
            if(node.left != null){
                res.get(index).add(node.left.val);
                bfs(node.left,index+1);
            }
            if(node.right != null) {
                res.get(index).add(node.right.val);
                bfs(node.right,index+1);
            }
        }
    }
}