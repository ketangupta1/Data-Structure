// Given a BST and an integer k. Find and return the path from the node with data k and root (if a node with data k is present in given BST) in a list. Return empty list otherwise.
// Note: Assume that BST contains all unique elements.

import java.util.ArrayList;

public class PathToNode {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        if(root==null)
            return null;
        if(root.data==data)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(root.data);
            return temp;
        }
        if(root.data>data)
        {
            ArrayList<Integer> leftOutput=getPath(root.left,data);
            if(leftOutput!=null)
            {
                leftOutput.add(root.data);
                return leftOutput;
            }
                
        }
        if(root.data<data)
        {
            ArrayList<Integer> rightOutput=getPath(root.right,data);
            if(rightOutput!=null)
            {
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
            return null;
	}
}
