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

public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null)
            return true;
        boolean ans1,ans2,ans3,ans4;
        ans1=ans2=ans3=ans4=false;
        ans1=isBST(root.left);
        ans2=isBST(root.right);
        if(root.left!=null)
        {
            if(root.left.data<root.data)
                ans3=true;
        }
        else
            ans3=true;
        if(root.right!=null)
        {
            if(root.right.data>root.data)
                ans4=true;
        }
        else
            ans4=true;
        return ans1&ans2&ans3&ans4;
	}

}
