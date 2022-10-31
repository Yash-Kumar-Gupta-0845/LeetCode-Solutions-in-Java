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
    int nodeIdx;
    public TreeNode bstFromPreorder(int[] preorder) {
        if ( preorder == null)
             return null;
        nodeIdx = 0;
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private TreeNode helper(int[] preorder, int minR, int maxR){
        if (nodeIdx == preorder.length || preorder[nodeIdx] < minR || preorder[nodeIdx] > maxR){
            return null;
        }
        int val = preorder[nodeIdx++];
        TreeNode node = new TreeNode(val);
        node.left = helper(preorder, minR, val);
        node.right = helper(preorder, val, maxR);
        return node;
    }
}