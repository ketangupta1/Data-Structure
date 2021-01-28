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
public class PrintLevelWise {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null)
            return;
        Queue<BinaryTreeNode<Integer>> queue =new LinkedList<>();
        BinaryTreeNode<Integer> nullNode=new BinaryTreeNode<>(Integer.MIN_VALUE);
        queue.add(root);
        queue.add(nullNode);
        while(queue.size()!=1)
        {
            BinaryTreeNode<Integer>temp=queue.poll();
            if(temp==nullNode)
            {
                queue.add(nullNode);
                System.out.println();
                continue;
            }
            else
            {
                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
                if(temp.right!=null)
                    queue.add(temp.right);
                System.out.print(temp.data+" ");
            }
        }
        
	}
	
}
