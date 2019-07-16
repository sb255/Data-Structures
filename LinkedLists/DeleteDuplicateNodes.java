    LinkedListNode removeDuplicatesFromLinkedList(LinkedListNode head) {

        if(head==null)
            return null; 
        
        LinkedListNode n = head; 
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); 

        while(n.next!=null){
            lhs.add(n.data); 
            n = n.next; 
        }

        lhs.add(n.data);

        Iterator<Integer> it = lhs.iterator();

        LinkedListNode newHead = new LinkedListNode(it.next()); 

        LinkedListNode listNodes = newHead; 

        while(it.hasNext()){
            listNodes.next = new LinkedListNode(it.next()); 
            listNodes = listNodes.next; 

        }

        return newHead; 

    }

