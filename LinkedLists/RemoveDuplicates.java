/* Removing duplicates from a LinkedList */

    LinkedListNode removeDuplicateNodes(LinkedListNode head) {

    LinkedListNode n = head; 
      
    if(n==null)    
        return null;
    
    if(n.next==null)
        return head; 

    while(n.next!=null){
        
        if(n.data==n.next.data){
            n.next=n.next.next;
            continue; 
        }
        
        n = n.next; 
    }

    return head;  

    }
