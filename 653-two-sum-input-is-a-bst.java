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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int size = arr.size();
        int l = 0;
        int r = size - 1;
        while(l<r){
            if(arr.get(l)+arr.get(r)==k){
                return true;
            }
            else if(arr.get(l)+arr.get(r)<k){
                l++;
            }
            else{
                r--;
            }
        }

        return false;
    }

    public void inorder(TreeNode node, List<Integer> arr){
        if(node!=null){
            inorder(node.left,arr);
            arr.add(node.val);
            inorder(node.right,arr);

        }
    }
}