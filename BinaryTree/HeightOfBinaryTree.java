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

public class HeightOfBinaryTree {

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null)
            return 0;
        int height=0,h1,h2;
        h1=height(root.left);
        h2=height(root.right);
        if(h1>h2)
            height=h1;
        else
            height=h2;
        return height+1;
	}

}
