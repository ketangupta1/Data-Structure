//  For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.


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

public class PathSumRootToLeaf {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        if(root==null)
            return;
        String s="";
        rootToLeafPathsSumToK(root,k,s);
	}

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String str)
    {
        if(root==null)
            return;
        k-=root.data;
        str+=root.data+" ";
        rootToLeafPathsSumToK(root.left,k,str);
        rootToLeafPathsSumToK(root.right,k,str);
        if(k==0)
        {
            if(root.left==null && root.right==null)
                System.out.println(str);
        }
        return;
    }
}
