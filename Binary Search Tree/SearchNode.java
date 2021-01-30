public class SearchNode {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root==null)
            return false;
        
        boolean ans=false;
        if(root.data==k)
            return true;
        if(root.data>k)
           ans=searchInBST(root.left,k);
        else
           ans=searchInBST(root.right,k);
        return ans;
	}
}
