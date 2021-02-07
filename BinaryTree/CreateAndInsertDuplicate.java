//  For a given a Binary Tree of type integer, duplicate every node of the tree and attach it to the left of itself.
//  The root will remain the same. So you just need to insert nodes in the given Binary Tree.


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

public class CreateAndInsertDuplicate {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null)
            return;
        if(root.left==null)
        {
            BinaryTreeNode<Integer> temp=new BinaryTreeNode<>(root.data);
            root.left=temp;
            insertDuplicateNode(root.right);
        }
        else
        {
            BinaryTreeNode<Integer> temp1=root.left;
            BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>(root.data);
            root.left=temp;
            temp.left=temp1;
            insertDuplicateNode(temp1);
            insertDuplicateNode(root.right);
        }
        
	}
	
}
