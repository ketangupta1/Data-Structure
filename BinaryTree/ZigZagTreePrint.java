// Given a binary tree, print the zig zag order. In zigzag order, level 1 is printed from left to right, level 2 from right to left and so on.
// This means odd levels should get printed from left to right and even level right to left.



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
public class ZigZagTreePrint {

	public static void printZigZag(BinaryTreeNode<Integer> root){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null)
            return;
        Stack<BinaryTreeNode<Integer>> s1=new Stack<>();
        Stack<BinaryTreeNode<Integer>> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                BinaryTreeNode<Integer> cur=s1.pop();
                if(cur.left!=null)
                s2.push(cur.left);
                if(cur.right!=null)
                s2.push(cur.right);
                System.out.print(cur.data+" ");
                if(s1.size()==0)
                    System.out.println();
            }
            while(!s2.isEmpty())
            {
                BinaryTreeNode<Integer> cur=s2.pop();
                if(cur.right!=null)
                s1.push(cur.right);
                if(cur.left!=null)
                s1.push(cur.left);
                System.out.print(cur.data+" ");
                if(s2.size()==0)
                    System.out.println();
            }
        }
	}

}
