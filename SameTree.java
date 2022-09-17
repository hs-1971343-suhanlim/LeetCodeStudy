import java.util.List;
import java.util.ArrayList;
class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode3() {}
    TreeNode3(int val) { this.val = val; }
    TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
       this.val = val;
       this.left = left;
       this.right = right;
    }
 }
class Solution {
	public void inorder(TreeNode3 root, List<Integer> tmp, int i) {
		if(root!=null) {
			inorder(root.left, tmp, i++);
			tmp.add(root.val);
			inorder(root.right, tmp, i+=2);
		}
		else 
			tmp.add(i);
		
	}
    public boolean isSameTree(TreeNode3 p, TreeNode3 q) {
    	List<Integer> a1 = new ArrayList<Integer>();
    	inorder(p, a1, 1);
    	List<Integer> b1 = new ArrayList<Integer>();
    	inorder(q, b1, 1);
    	if(a1.size()!=b1.size())
    		return false;
    	for(int i=0;i<a1.size();i++) {
    		if(a1.get(i)!=b1.get(i))
    			return false;
    	}
    	return true;
    }
}
public class SameTree {
	public static void main(String args[]) {
		TreeNode3 a = new TreeNode3(1);
		TreeNode3 b = new TreeNode3(2);
		TreeNode3 c = new TreeNode3(3,a,b);
		TreeNode3 d = new TreeNode3(1);
		TreeNode3 e = new TreeNode3(2);
		TreeNode3 f = new TreeNode3(3,d,e);
		Solution solve = new Solution();
		System.out.println(solve.isSameTree(c, f));
	}
}
