public class NodesHavingDepth_K{
  public static void depth(TreeNode<Integer> root,int k)
  {
     if(root==null)
        return;
     if(root.children.size()==0)
     {
        System.out.print(root.data+" ");
        return;
     }
     for(int i=0;i<root.children.size();i++)
     {
        depth(root.children.get(i),k-1);
     }
  }
}
