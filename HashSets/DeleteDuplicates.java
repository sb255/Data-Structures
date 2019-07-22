import java.util.*;

public class Test {
    
    /*-- Removing duplicates from Linked List method using HashSet --*/
    static Node removeDuplicatesFromLinkedList(Node head) {

        if(head==null)
            return null;

        Node n = head;
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        while(n.next!=null){
            lhs.add(n.data);
            n = n.next;
        }

        lhs.add(n.data);

        Iterator<Integer> it = lhs.iterator();

        Node newHead = new Node(it.next());

        Node listNodes = newHead;
        
        while(it.hasNext()){
            listNodes.next = new Node(it.next());
            listNodes = listNodes.next;

        }

        return newHead;

    }

    
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
        
        Node A = new Node(10);
        A.next = new Node(10);
        A.next.next = new Node(20);
        A.next.next.next = new Node(20);
        
        Node C = removeDuplicatesFromLinkedList(A);
        
        while(C!=null){
            System.out.println(C.data);
            C = C.next; 
        }
    
    }
    
}

/*-- Node class Implementation --*/

class Node{
    
    int data;
    Node next; 
    
    public Node(int data){
    this.data = data;
    }
    
}

