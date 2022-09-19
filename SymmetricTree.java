

class TreeNode101 {
    int val;
    TreeNode101 left;
    TreeNode101 right;
    TreeNode101() {}
    TreeNode101(int val) { this.val = val; }
    TreeNode101(int val, TreeNode101 left, TreeNode101 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
class Solution {
	public boolean symmetricSearch(TreeNode101 a, TreeNode101 b) {
		if(a==null&&b==null) return true;   		
    	else if(a==null||b==null) return false; // p==null||q==null
		if(a.val==b.val) 
			return (symmetricSearch(a.left,b.right)&&symmetricSearch(a.right,b.left)); 
		else 
			return false;
	}
    public boolean isSymmetric(TreeNode101 root) {
        return symmetricSearch(root,root);
    }
}
public class SymmetricTree {
	public static void main(String args[]) {
		Solution a = new Solution();
		TreeNode101 b = new TreeNode101(2);
		TreeNode101 c = new TreeNode101(2);
		TreeNode101 d = new TreeNode101(4);
		TreeNode101 e = new TreeNode101(4);
		b.left = d; c.right = e;
		TreeNode101 root = new TreeNode101(1,b,c);
		
		System.out.println(a.isSymmetric(root));
	}
}
