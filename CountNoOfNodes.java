public class CountNoOfNodes{
    public static int countNodes(Treenode<Integer> root)
    {
       if(root == null)       //It is not a base case.Base Case is is the case where we reach after smaller down the bigger problem but this is the case where we never reach by cutting down the bigger problem. This is edge case,When there is nothing in the tree.
          return 0;
       int count=1;
       for(int i=0;i<root.children.size();i++)
       {
          count+=countNodes(root.children.get(i));
       }
       return count;
    }
