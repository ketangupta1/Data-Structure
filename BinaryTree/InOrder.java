/*

	Following the structure used for Binary Tree

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

class InOrder{
  public static void inOrder(BinaryTreeNode<Integer> root)
  {
     if(root==null)
        return;
     inOrder(root.left);
     System.out.print(root.data+" ");
     inOrder(root.right);
  }
