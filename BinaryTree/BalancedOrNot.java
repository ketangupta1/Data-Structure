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
import java.util.*;
public class BalancedOrNot {

	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null || (root.left==null &&root.right==null))
            return true;
        Pair temp=checkBalancing(root);
        return temp.ans;
	}
    public static Pair checkBalancing(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            Pair temp=new Pair();
            temp.height=0;
            temp.ans=true;
            return temp;
        }
        int height=0;
        Pair leftChild,rightChild;
        Pair temp=new Pair();
        leftChild=checkBalancing(root.left);
        rightChild=checkBalancing(root.right);
        height=Math.max(leftChild.height,rightChild.height)+1;
        temp.height=height;
        if(leftChild.ans && rightChild.ans)
        {
            if(Math.abs(leftChild.height-rightChild.height)<=1)
               temp.ans=true;
            else
                temp.ans=false;
        }
        else
        {
            temp.ans=false;
        }
        return temp;
    }
    
}

class Pair{
    int height;
    boolean ans;
}
