
public class binarySearchUseVerson {
	public TreeNode solve2(int nums[]) {
		if(nums.length==0) return null;
		TreeNode head = helper(nums,0,nums.length-1);
		return head;
	}
	public TreeNode helper(int nums[],int low,int height) {
		if(low>height) return null;
		int mid = (low+height)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums,low,mid-1);
		node.right = helper(nums,mid+1,height);
		return node;
	}
}
