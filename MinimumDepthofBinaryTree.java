
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
/* combine lowHeight+minDepth
  public int minDepth(TreeNode root) {
    	if (root==null) return 0;
    	else if(root.left==null&&root.right==null) return 1;
    	if(root.left==null) 
    		return 1+minDepth(root.right);
        else if(root.right==null) 
        	return 1+minDepth(root.left);
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
       return 1+ Math.min(leftDepth,rightDepth);
    }
 */
class Solution {
	public int lowHeight(TreeNode root) {
		if(root.left==null&&root.right==null) return 1;
		else if(root.left==null&&root.right!=null)
			return 1+lowHeight(root.right);
		else if(root.right==null&&root.left!=null)
			return 1+lowHeight(root.left);
		return 1+ Math.min(lowHeight(root.left),lowHeight(root.right));
	}
    public int minDepth(TreeNode root) {
    	if (root==null) return 0;
    	else if(root.left==null&&root.right==null) return 1;
    	if(root.left==null) 
    		return 1+lowHeight(root.right);
        else if(root.right==null) 
        	return 1+lowHeight(root.left);
        int leftDepth = 1+lowHeight(root.left);
        int rightDepth = 1+lowHeight(root.right);
        if(leftDepth>rightDepth)
        	return rightDepth;
        else
        	return leftDepth;
    }
}