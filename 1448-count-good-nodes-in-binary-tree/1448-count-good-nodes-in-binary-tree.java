class Solution {
    public int goodNodes(TreeNode root) {
        return hepler(root, 0, Integer.MIN_VALUE);        
    }

    public int hepler(TreeNode root, int ans,int maxAns){
        if(root == null) return 0;
        int rootAns = 0;
        if(root.val >= maxAns){
            rootAns =1;
            maxAns = root.val;
        }

        int lAns = hepler(root.left, ans, maxAns);
        int rAns = hepler(root.right, ans , maxAns);

        return lAns + rAns + rootAns;
    }
}