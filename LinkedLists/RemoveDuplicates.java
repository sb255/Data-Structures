
/*-- Removing duplicates from a LinkedList --*/

import java.util.*;

public class RemoveDuplicates {
    
    /*-- Method for removing duplicates from a LinkedList --*/
    
    static Node removeDuplicateNodes(Node head) {

    Node n = head;

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
    
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
        
        Node A = new Node(5);
        A.next = new Node(10);
        A.next.next = new Node(20);
        A.next.next.next = new Node(20);
        
        Node C = removeDuplicateNodes(A);
        
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


