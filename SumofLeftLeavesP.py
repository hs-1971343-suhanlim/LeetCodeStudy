# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        if(root==None):
            return 0
        sol=0
        if(root.left!=None and root.left.left==None and root.left.right==None):
            sol+=root.left.val
        
        if(root!=None):
            sol+=self.sumOfLeftLeaves(root.left)
            sol+=self.sumOfLeftLeaves(root.right)
        
        
        return sol
