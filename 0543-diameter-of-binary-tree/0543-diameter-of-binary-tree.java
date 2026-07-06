class Solution {
      int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
       longestPath(root);
       return diameter;
    }

    private int longestPath(TreeNode root){
        if(root == null) return 0;

       int longestLeftPath = longestPath(root.left);
       int longestRightPath = longestPath(root.right);
       diameter = Math.max(longestLeftPath + longestRightPath, diameter);
       return Math.max(longestLeftPath , longestRightPath) +1;
    }
}