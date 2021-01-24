
public class NodeHavingSumOfChildrenMax {

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

	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        if(root==null)
            return root;
        pair temp=maxSumNod(root);
        return temp.node;
	}
	public static pair maxSumNod(TreeNode<Integer> root)
    {
        pair temp=new pair();
        temp.node=root;
        int sum=root.data;
        for(int i=0;i<root.children.size();i++)
        {
            sum+=root.children.get(i).data;
        }
        temp.sum=sum;
        for(int i=0;i<root.children.size();i++)
        {
            //pair child=new pair();
            pair child=maxSumNod(root.children.get(i)); 
            if(child.sum>temp.sum)
            {
                temp=child;
            }
                
        }
        return temp;
    }
		
}
class pair{
    public TreeNode<Integer> node;
    public int sum;
}

