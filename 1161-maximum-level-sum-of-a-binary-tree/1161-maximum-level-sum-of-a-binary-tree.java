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
    public int maxLevelSum(TreeNode root) {
     if(root==null) return 0;
     Queue<TreeNode> qu=new LinkedList<>();
     qu.add(root);
     int level=0,minLevel=0,maxSum=Integer.MIN_VALUE;
     while(!qu.isEmpty()){
        int size=qu.size();
        level++;
        int levelSum=0;
        for(int i=0;i<size;i++){
           TreeNode node=qu.poll();
           levelSum+=node.val;
           if(node.left!=null) qu.add(node.left);
           if(node.right!=null) qu.add(node.right);
        }
       if(levelSum>maxSum){
         maxSum=levelSum;
         minLevel=level;  
       } 
     }
        return minLevel;
    }
}