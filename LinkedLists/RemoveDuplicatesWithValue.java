
/*-- Remove all the appereances of the Node with values having duplicates --*/

import java.util.*;

public class RemoveDuplicatesWithValue {
    
    /*-- Method for removing duplicates including the original occurance from a LinkedList --*/
    
    static Node removeAllDuplicates(Node A) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        while(A!=null){

            Integer i = map.get(A.data);

            /*--- Getting all the node values ---*/

            if(i==null)
                map.put(A.data, 1);

            else
                map.put(A.data, i+1);

            A = A.next;
        }
        
        LinkedList<Node> list = new LinkedList<>();

        for(Integer n : map.keySet()){
            if(map.get(n)==1){
                list.add(new Node(n));
            }
        }

        if(list.size()==0)
            return null;


        Node llist = list.get(0);
        Node lllist = llist;

        for(int i=1; i<list.size(); i++){
            lllist.next = list.get(i);
            lllist = lllist.next;
        }

        return llist;
    }
    
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
        
        Node A = new Node(5);
        A.addNodeToTail(10);
        A.addNodeToTail(20);
        A.addNodeToTail(30);
        A.addNodeToTail(30);
        A.addNodeToTail(40);
        A.addNodeToTail(50);
        
        Node C = removeAllDuplicates(A);
        
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
    
    public void addNodeToTail(int addData){
        
        Node current = this;
        
        while(current.next!=null){
            current = current.next; 
        }
        
        current.next = new Node(addData); 
        
    }
    
}


