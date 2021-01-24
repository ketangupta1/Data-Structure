/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class FindNode {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
        {
            if(root.data==x)
                return true;
            else
                return false;
        }
        
        boolean findLeft=isNodePresent(root.left,x);
        boolean findRight=isNodePresent(root.right,x);
        boolean findRoot=false;
        if(root.data==x)
            findRoot=true;
        return (findLeft|findRight|findRoot);
	}

}
