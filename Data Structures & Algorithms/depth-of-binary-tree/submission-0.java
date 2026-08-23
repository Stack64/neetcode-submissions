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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> qq=new LinkedList<>();
        if(root!=null){
            qq.offer(root);
        }
        int level=0;
        while(!qq.isEmpty()){
            int size=qq.size();
            for(int i=0;i<size;i++){
                TreeNode node=qq.poll();
                if(node.left!=null){
                    qq.offer(node.left);
                }
                if(node.right!=null){
                    qq.offer(node.right);
                }
            }
            level++;
        }
        return level;
    }
}
