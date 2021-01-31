public class BSTFromSortedArray {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return SortedArrayToBST(arr,n,0,n-1);
		}
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n,int si,int ei)
    {
        if(si>ei)
            return null;
        int mid=(si+ei)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(arr[mid]);
        BinaryTreeNode<Integer> leftChild=SortedArrayToBST(arr,n,si,mid-1);
        BinaryTreeNode<Integer> rightChild=SortedArrayToBST(arr,n,mid+1,ei);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
}
