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
        //~~~~~~~~~~~ Way 1 ~~~~~~~~~~~~~~
        
        
//         List<List<Integer>> list = new ArrayList<>();
//         levelHelper(list, root, 0);
//         return list;
//     }
//     public void levelHelper(List<List<Integer>> res, TreeNode root, int height){
//         if ( root == null)
//             return;
//         if ( height >= res.size()){
//             List<Integer> newLevel = new LinkedList<Integer>();
//             res.add(newLevel);
//         }
//         res.get(height).add(root.val);
//         levelHelper(res, root.left, height+1);
//         levelHelper(res, root.right, height+1);
        // ~~~~~~~~~~~~~~~~~~~~ WAY @ ~~~~~~~~~~~~~~
        
        List<List<Integer>> res = new ArrayList<>();
        if( root == null)
            return res;
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int cnt = queue.size();
            for ( int i =0; i<cnt ; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
     } 
}