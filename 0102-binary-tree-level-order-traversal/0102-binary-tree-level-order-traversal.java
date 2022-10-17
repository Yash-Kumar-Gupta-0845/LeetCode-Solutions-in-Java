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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelHelper(list, root, 0);
        return list;
    }
    public void levelHelper(List<List<Integer>> res, TreeNode root, int height){
        if ( root == null)
            return;
        if ( height >= res.size()){
            List<Integer> newLevel = new LinkedList<Integer>();
            res.add(newLevel);
        }
        res.get(height).add(root.val);
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
    } 
}