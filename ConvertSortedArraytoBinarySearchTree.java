
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
	public TreeNode rotateRight(TreeNode root) {
		TreeNode tmp = root.left;
		root.left = tmp.right;
		tmp.right = root;
		return tmp;
	}
	public TreeNode rotateLeft(TreeNode root) {
		TreeNode tmp = root.right;
		root.right = tmp.left;
		tmp.left = root;
		return tmp;
	}
	public int getHeight(TreeNode root) {
		int height = 0;
		if(root != null)
			height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
		return height;
	}
	public int getBalance(TreeNode root) {
		if(root == null) return 0;
		else 
			return getHeight(root.left)-getHeight(root.right);
	}
	public TreeNode createNode(int key) {
		TreeNode node = new TreeNode(key);
		return node;
	}
	public TreeNode insert(TreeNode node, int key) {
		if(node == null)
			return(createNode(key));
		if(key<node.val)
			node.left = insert(node.left, key);
		else if (key>node.val)
			node.right = insert(node.right, key);
		else
			return node;
		int balance = getBalance(node);
		if(balance > 1&& key< node.left.val)
			return rotateRight(node);
		if(balance < -1 && key>node.right.val)
			return rotateLeft(node);
		if(balance > 1&& key>node.left.val) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}
		if(balance <-1&& key<node.right.val) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}
		return node;
	}
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        for(int i=0;i<nums.length;i++) {
        	root = insert(root,nums[i]);
        }
        return root;
    }
}
public class ConvertSortedArraytoBinarySearchTree {

}
