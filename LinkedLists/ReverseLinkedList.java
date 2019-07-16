/*-- Reversing a LinkeList or a DoubleLinkedList using Stack  --*/

    LinkedListNode reverseLinkedList(LinkedListNode head) {

        Stack<Integer> stack = new Stack<>();

        LinkedListNode n = head; 

        while(n!=null){
            stack.push(n.data);
            n = n.next; 
        }

        LinkedListNode newList = new LinkedListNode(stack.pop());
        LinkedListNode nodesNewList = newList;  

        while(!stack.isEmpty()){
            nodesNewList.next = new LinkedListNode(stack.pop()); 
            nodesNewList = nodesNewList.next; 
        }

        return newList;  

    }

