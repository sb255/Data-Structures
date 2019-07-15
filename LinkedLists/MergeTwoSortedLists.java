public class Test {
    Node mergeTwoSortedLists(Node A, Node B) {
        
        LinkedList<Integer> list = new LinkedList<>(); 
        
        while(A.next!=null){
            list.add(A.data); 
            A = A.next; 
        }
        
        list.add(A.data); 
        
        
        while(B.next!=null){
            list.add(B.data); 
            B = B.next; 
        }
        
        list.add(B.data); 
        
        Collections.sort(list); 
        
        Node llist = new Node(list.get(0)); 
        
        Node n = llist; 
        
        for(int i=1; i<list.size(); i++){
            n.next = new Node(list.get(i));
            n = n.next; 
        }
        
        
        return llist; 
        
    }
}
