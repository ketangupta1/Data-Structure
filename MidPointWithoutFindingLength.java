public class MidPointWithoutFindingLength {
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> slow,fast;
        slow=head;fast=head;
        while(fast!=null && fast.next!=null)
        {
            if(fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            else
                fast=fast.next;
            
        }
        return slow;
    }

}
