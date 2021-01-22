public class PreOrderTraversal {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static void printPostOrder(TreeNode<Integer> root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++)
        {
           printPostOrder(root.children.get(i));
        }
        
	}

}
