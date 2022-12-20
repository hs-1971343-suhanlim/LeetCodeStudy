import java.util.Stack;

class TreeNode2 {
      int val;
      TreeNode2 left;
      TreeNode2 right;
      TreeNode2() {}
      TreeNode2(int val) { this.val = val; }
      TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
class SolutionOtimal {
    public boolean hasPathSum(TreeNode2 root, int targetSum) {
        return help(root, targetSum, 0);
    }

    boolean help(TreeNode2 root, int target, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && target == sum + root.val) return true;
        sum += root.val;
        return help(root.right, target, sum) || help(root.left, target, sum);
    }

}
class Solution {
    private boolean isRight = false;
    private int height;
    private Stack<Integer> sum = new Stack<Integer>();
    public int getSum(){
        int value=0;
        for(int i=0;i<sum.size();i++){
            value+=sum.get(i);
        }
        return value;
    }
    public void dfs(TreeNode2 root,int targetSum){
        if(root==null){
            return;
        }
        sum.add(root.val);
        if(getSum()==targetSum&&root.left==null&&root.right==null)
            isRight = true;
        // dfs
        if(root!=null) {
            dfs(root.left,targetSum);
            if(root.left!=null)
                sum.pop();
            dfs(root.right,targetSum);
            if(root.right!=null)
                sum.pop();
        }
    }
    public boolean hasPathSum(TreeNode2 root, int targetSum) {
        if(root==null) return false;
        dfs(root, targetSum);
        return isRight;
    }
}
public class PathSum {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}