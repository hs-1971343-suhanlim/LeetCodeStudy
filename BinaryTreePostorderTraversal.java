import java.util.List;
import java.util.ArrayList;

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
	// 후위 순회
	private List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null) {
        	postorderTraversal(root.left);
        	postorderTraversal(root.right);
        	list.add(root.val);
        }
        
        return list;
    }
}
public class BinaryTreePostorderTraversal {

}
