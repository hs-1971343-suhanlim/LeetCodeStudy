class Solution { // 좀 더 단순하고 간단하게 생각하자
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null&&q==null) return true;   		
    	else if((p==null&&q!=null)||(p!=null&&q==null)) return false; // p==null||q==null
    	if(p.val==q.val)
    		return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    	else 
    		return false;
    }
}
public class SameTreeTRUE {

}
