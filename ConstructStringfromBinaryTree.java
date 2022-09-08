class Solution {
	private String recursionSearch(TreeNode t) {
		if(t==null) {
			return "";
		}
		if(t.right!=null) {
			return t.val+"("+recursionSearch(t.left)+")("+recursionSearch(t.right)+")";
		}
		if(t.left!=null) {
			return t.val+"("+recursionSearch(t.left)+")";
		}
		return t.val+"";
	}
    public String tree2str(TreeNode root) {
    	return recursionSearch(root);
    }
}

public class ConstructStringfromBinaryTree {

}
