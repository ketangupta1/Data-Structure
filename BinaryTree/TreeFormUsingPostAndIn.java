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

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> temp=buildTree(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
        return temp;
	}
    
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int postS,int postE,int inS,int inE)
    {
        if(postS>postE)
            return null;
        int rootData=postOrder[postE],rootIndex=-1;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        for(int i=inS;i<=inE;i++)
        {
            if(rootData==inOrder[i])
            {
                rootIndex=i;
                break;
            }
        }
        int leftInS=inS;
        int leftInE=rootIndex-1;
        int leftPostS=postS;
        int leftPostE=leftInE-leftInS+leftPostS;           //leftInE-leftInS=leftPostE-leftPostS;
        int rightInS=rootIndex+1;
        int rightInE=inE;
        int rightPostS=leftPostE+1;
        int rightPostE=postE-1;
        root.left=buildTree(postOrder,inOrder,leftPostS,leftPostE,leftInS,leftInE);
        root.right=buildTree(postOrder,inOrder,rightPostS,rightPostE,rightInS,rightInE);
        return root;
    }

}
