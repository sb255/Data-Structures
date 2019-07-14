public class Test {
    public Node mergeTwoSortedLists(Node A, Node B) {
        
        LinkedList<Integer> list = new LinkedList<>(); 
        
        while(A.next!=null){
            list.add(A.val); 
            A = A.next; 
        }
        
        list.add(A.val); 
        
        
        while(B.next!=null){
            list.add(B.val); 
            B = B.next; 
        }
        
        list.add(B.val); 
        
        Collections.sort(list); 
        
        
        
        Stack<Node> stack = new Stack<>(); 
        Stack<Node> stackReverse = new Stack<>(); 
        
        
        for(int i=0; i<list.size(); i++){
            stack.push(new Node(list.get(i))); 
        }
        
        for(int i=0; i<list.size(); i++){
            stackReverse.push(stack.pop()); 
        }
        
        
        Node llist = stackReverse.pop(); 
        
        Node n = llist; 
        
        for(int i=1; i<list.size(); i++){
            n.next = stackReverse.pop();
            n = n.next; 
        }
        
        
        return llist; 
        
    }
}
