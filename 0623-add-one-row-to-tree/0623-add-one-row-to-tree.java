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
    private TreeNode solve(TreeNode root, int val, int depth, int level){
        //when the root is null
        if(root == null)
            return null;
        //when the left and right child are null
        if(depth==1){
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        //when left and right child are present of root node, we create a new node, put the L child of root to L child of new node then make new node left child of root node, similar for root node 
        if(level==depth-1){
            TreeNode newNode = new TreeNode(val);
            newNode.left = root.left;
            root.left = newNode;
            
            newNode = new TreeNode(val);
            newNode.right = root.right;
            root.right = newNode;
        }
        else{
            solve(root.left,val,depth,level+1);
            solve(root.right,val,depth,level+1);
        }
        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return solve(root, val, depth, 1);
    }
}