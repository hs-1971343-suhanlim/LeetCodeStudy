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
	public void preorder(TreeNode root, List<Integer> list) {
		 if(root!=null) {
	        	list.add(root.val);
	        	preorder(root.left,list);
	        	preorder(root.right,list);
	        }
	}
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	preorder(root,list);
        return list;
    }
    /*
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	while(root!=null) {
    		list.add(root.val);
    		if(root.left!=null) {
    			list.addAll(preorderTraversal(root.left));
    		}
    		if(root.right!=null) {
    			list.addAll(preorderTraversal(root.right));
    		}
    	}
        return list;
    }*/
}
public class BinaryTreePreorderTraversal {

}
