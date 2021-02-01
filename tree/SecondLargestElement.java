

public class SecondLargestElement {

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
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		// Write your code here
        if(root==null)
            return root;
        Pair temp=findSecondLarger(root);
        return temp.smax;
	}
    public static Pair findSecondLarger(TreeNode<Integer> root)
    {
        if(root==null)
            return null;
        Pair ans=new Pair();
        ans.max=new TreeNode<>(root.data);
        ans.smax=null;
        TreeNode<Integer> x;
        for(int i=0;i<root.children.size();i++)
        {
            Pair temp=findSecondLarger(root.children.get(i));
            if(ans.smax==null && temp.smax==null)
            {
                if(ans.max.data<temp.max.data)
                {
                    x=ans.max;
                    ans.max=temp.max;
                    ans.smax=x;
                }
                else if(ans.max.data==temp.max.data);
                else
                {
                    ans.smax=temp.max;
                }
            }
            else if(ans.smax==null && temp.smax!=null)
            {
                if(ans.max.data<temp.max.data)
                {
                    x=ans.max;
                    ans.max=temp.max;
                    if(x.data>temp.smax.data)
                        ans.smax=x;
                    else
                        ans.smax=temp.smax;
                }
                else if(ans.max.data==temp.max.data)
                {
                    if(temp.smax.data!=ans.max.data)
                        ans.smax=temp.smax;
                }
                else
                {
                    ans.smax=temp.max;
                }
            }
            else if(ans.smax!=null && temp.smax==null)
            {
                if(ans.max.data<temp.max.data)
                {
                    x=ans.max;
                    ans.max=temp.max;
                    ans.smax=x;
                }
                else if(ans.max.data==temp.max.data);
                else
                {
                    if(ans.smax.data>temp.max.data);
                    else
                        ans.smax=temp.max;
                }
            }
            else
            {
                if(ans.max.data<temp.max.data)
                {
                    x=ans.max;
                    ans.max=temp.max;
                    if(x.data>temp.smax.data)
                        ans.smax=x;
                    else
                        ans.smax=temp.smax;
                }
                else if(ans.max.data==temp.max.data)
                {
                    if(temp.smax.data>ans.smax.data)
                        ans.smax=temp.smax;
                }
                else
                {
                    if(ans.smax.data<temp.max.data)
                    {
                        ans.smax=temp.smax;
                    }
                }
            }
        }
        return ans;
    }	
}
class Pair{
    TreeNode<Integer> max,smax;
    
}
