public static LinkedListNode<Integer> insertNodeRec(LinkedListNode<Integer> head, int pos,int elem)
{
   if(pos==0)
   {
      LinkedListNode<Integer> newNode=new Node<>(elem);
      newNode.next=head;
      return newNode;
    }
    if(head==null)
       return head;
    head.next=insertNodeRec(head.next,--pos,elem);
    return head;
 }
