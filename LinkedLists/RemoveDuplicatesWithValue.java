/*--- Remove all the appereances of the values having duplicates ---*/ 
 
public class Test {
    Node removeAllDuplicates(Node A) {
        
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
}

