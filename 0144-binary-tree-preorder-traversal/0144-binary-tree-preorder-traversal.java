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
    public List<Integer> preorderTraversal(TreeNode root) {
        // visiting every node once
        // stack first store root then right and then left because we have to return left value first.
        
        List <Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> rights = new Stack<TreeNode>();
        while (root != null){
            list.add(root.val);
            if (root.right != null){
                rights.push (root.right);
            }
            if (root.left == null && !rights.isEmpty()){
                root = rights.pop();
            }
            else{
                root = root.left;
            }
        }
        return list;
    }
}