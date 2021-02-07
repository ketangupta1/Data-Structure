// Given a binary tree and data of two nodes, find 'LCA' (Lowest Common Ancestor) of the given two nodes in the binary tree.


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

public class LCAOfBst {

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null)
            return -1;
        int leftChild=getLCA(root.left,a,b);
        int rightChild=getLCA(root.right,a,b);
        if(root.data==a || root.data==b)
            return root.data;
        if(leftChild==-1 && rightChild==-1)
            return -1;
        else if(rightChild==-1 && leftChild!=-1)
            return leftChild;
        else if(rightChild!=-1 && leftChild==-1)
            return rightChild;
        else
            return root.data;
	}

}
