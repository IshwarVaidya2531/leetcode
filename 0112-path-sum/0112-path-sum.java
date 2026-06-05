class Solution {
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return helper(root, 0);
    }

    public boolean helper(TreeNode root, int sum){
        if(root == null) return false;
        sum+= root.val;
        if(root.left == null && root.right == null) return sum == target;

        boolean lAns = helper(root.left, sum);
        boolean rAns = helper(root.right, sum);

        return lAns || rAns;
    }
}