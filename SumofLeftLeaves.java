
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

class Solution {
    public int sumOfLeftLeaves(TreeNode2 root) {
        if(root==null) return 0;
        int sol=0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null) sol+=root.left.val;

        if(root!=null){
            sol+=sumOfLeftLeaves(root.left);
            sol+=sumOfLeftLeaves(root.right);
        }


        return sol;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode2 root = new TreeNode2(3);
        TreeNode2 r1 = new TreeNode2(9);
        TreeNode2 r2 = new TreeNode2(20);
        TreeNode2 r3 = new TreeNode2(15);
        TreeNode2 r4 = new TreeNode2(7);
        root.left = r1;
        root.right = r2;
        r2.left = r3;
        r2.right = r4;
        s.sumOfLeftLeaves(root);
    }
}