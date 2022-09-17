import java.util.List;

class Solution {
	private List<Integer> result = new ArrayList<Integer>();
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			result.add(root.val);
			inorder(root.right);
		}
    	
	}
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer>();
    	inorder(root);
    	return result;
    }
}
public class BinaryTreeInorderTraversal {

}
