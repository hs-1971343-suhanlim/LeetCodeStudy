import java.util.*;
class Solution2 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;
        
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	res++;
        	for(int i=0;i<size;i++) {
        		TreeNode node = queue.poll();
        		if(node.left==null&node.right==null) return res;
        		if(node.left!=null) queue.offer(node.left);
        		if(node.right!=null) queue.offer(node.right);
        	}
        }
        return res;
}
public class MinimumDepthofBinaryTreeUseQueue {

}
