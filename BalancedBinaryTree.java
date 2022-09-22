

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
	public int height(TreeNode root) {
		if(root==null) return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
    public boolean isBalanced(TreeNode root) {
    	if(root==null) return true;
        int n = Math.abs(height(root.left)-height(root.right));
        if(n>1)
        	return false;
        // height-balanced Tree is need full binary tree 
        // so we need check left and right subTree is a balanced?
        return isBalanced(root.left)&& isBalanced(root.right);
    }
}