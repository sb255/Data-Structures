
/*-- Merging two sorted Linked Lists --*/

import java.util.*;

public class Test {
    
    /*-- Merging two sorted Lists method --*/
    public static Node mergeTwoSortedLists(Node A, Node B) {
        
        LinkedList<Integer> list = new LinkedList<>(); 
        
        while(A!=null){
            list.add(A.data); 
            A = A.next; 
        }
        
        while(B!=null){
            list.add(B.data); 
            B = B.next; 
        }
 
        Collections.sort(list); 
        
        Node llist = new Node(list.get(0)); 
        
        Node n = llist; 
        
        for(int i=1; i<list.size(); i++){
            n.next = new Node(list.get(i));
            n = n.next; 
        }
        
        
        return llist; 
        
    }
    
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
        
        Node A = new Node(10);
        A.next = new Node(20);
        A.next.next = new Node(30);
        
        
        Node B = new Node(40);
        B.next = new Node(50);
        B.next.next = new Node(60);
        
        Node C = mergeTwoSortedLists(A,B);
        
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


