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
    public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<Integer>();
//         dfs(root,list);
//         return list;
//     }
    
//     private void dfs(TreeNode node, List<Integer> list){
//             if ( node == null)
//                 return;
//             dfs(node.left,list);
//             list.add(node.val);
//             dfs(node.right, list);
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;
        while(!stack.isEmpty() || root != null){
            if ( root != null){
                stack.push(root);
                root = root.left;
            }
            else{
                root = stack.pop();
                list.add(root.val);
                root= root.right;
            }
        }
        return list;
        }
}