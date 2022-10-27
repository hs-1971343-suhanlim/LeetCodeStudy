import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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
	/*
	private List<String> sol = new ArrayList<String>();
	private String tmp = new String("");
	private String tmp2;
	public void Settmp2(String s){
		tmp2 = new String(s);
	}
	public void dfsTree(TreeNode root) {
		//String rem = new String(tmp);
		if(root==null) {	
			return;
		}
		if(root.left!=null) {
			tmp+="->";
			tmp+=Integer.toString(root.left.val);
			dfsTree(root.left);
		}
		if(root.right!=null) { 		
			tmp+="->";
			tmp+=Integer.toString(root.right.val);
			dfsTree(root.right);
		}
		if(root.right==null&&root.left==null) {
			sol.add(tmp);
			tmp = new String(tmp2);
		}
	}
    public List<String> binaryTreePaths(TreeNode root) {
        tmp+=Integer.toString(root.val);
        Settmp2(tmp);
        dfsTree(root);
        return sol;
    }
    */ // dfs recursion
	 public List<String> binaryTreePaths(TreeNode root) {
		 	List<String> sol = new ArrayList<String>();
	        if(root==null) return sol;
	        if(root.left==null&&root.right==null) {
	        	sol.add(Integer.toString(root.val));
	        	return sol;
	        }
	        for(String s : binaryTreePaths(root.left)) {
	        	sol.add(Integer.toString(root.val)+"->"+s);
	        }
	        for(String s : binaryTreePaths(root.right)) {
	        	sol.add(Integer.toString(root.val)+"->"+s);
	        }
	        return sol;
	    }
	 // dfs Stack
	 public List<String> binaryTreePaths2(TreeNode root) {
		 	List<String> sol = new ArrayList<String>();
	        Stack<TreeNode> sNode = new Stack<TreeNode>();
	        Stack<String> sStr = new Stack<String>();
	        if(root==null) return sol;
	        sNode.push(root);
	        sStr.push("");
	        while(!sNode.isEmpty()) {
	        	TreeNode curNode = sNode.pop();
	        	String curStr=sStr.pop();
	        	
	        	if(curNode.left==null&&curNode.right==null) sol.add(curStr+curNode.val);
	        	if(curNode.left!=null) {
	        		sNode.push(curNode.left);
	        		sStr.push(curStr+curNode.val+"->");
	        	}
	        	if(curNode.right!=null) {
	        		sNode.push(curNode.right);
	        		sStr.push(curStr+curNode.val+"->");
	        	}
	        	
	        }
	        return sol;
	   	}
	 // bfs queue
	 public List<String> binaryTreePaths3(TreeNode root) {
		 	List<String> sol = new ArrayList<String>();
		 	Queue<TreeNode> qNode = new LinkedList<TreeNode>();
		 	Queue<String> qStr = new LinkedList<String>();
		 	
		 	if(root==null) return sol;
		 	qNode.add(root);
		 	qStr.add("");
		 	while(!qNode.isEmpty()) {
		 		TreeNode curNode = qNode.remove();
		 		String curStr = qStr.remove();
		 		
		 		if(curNode.left==null&&curNode.right==null) sol.add(curStr+curNode.val);
		 		if(curNode.left!=null) {
		 			qNode.add(curNode.left);
		 			qStr.add(curStr+curNode.val+"->");
		 		}
		 		if(curNode.right!=null) {
		 			qNode.add(curNode.right);
		 			qStr.add(curStr+curNode.val+"->");
		 		}
		 	}
	        return sol;
	    }
	 
}
public class BinaryTreePaths {
	public static void main(String args[]) {
		TreeNode tree = new TreeNode(1);
		TreeNode tree2 = new TreeNode(3);
		TreeNode tree3 = new TreeNode(2);
		TreeNode tree4 = new TreeNode(5);
		tree.left = tree3;
		tree.right = tree2;
		tree3.right = tree4;
		Solution a = new Solution();
		a.binaryTreePaths(tree);
	}
}
