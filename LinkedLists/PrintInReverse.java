/*-- Printing a LinkedList in reverse order using Stack  --*/

   void printInReverse(Node head) {
        
        Node n = head; 
        Stack<Integer> stack = new Stack<>(); 

        if(head.next==null)
            System.out.println(n.data); 
        
        while(n.next!=null){
            stack.push(n.data); 
            n = n.next; 
        }

        stack.push(n.data); 

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
