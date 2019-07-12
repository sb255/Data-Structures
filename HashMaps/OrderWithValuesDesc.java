/*
STUDENT RATING PROGRAM

INPUT:
3
Student1 30
Student2 50
Student3 100

OUTPUT:
Student3 100
Student2 50
Student1 30
*/


import java.util.*;
import java.util.Map.Entry;

public class Test{
    
    public static  void orderWithRating(){
        
        Scanner sc = new Scanner(System.in);

        TreeMap<String, Integer> tm = new TreeMap<>(); 
       
        int total = sc.nextInt();
        
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=0; i<total; i++){

            String[] key = sc.nextLine().split(" "); 
            int value = Integer.parseInt(key[1]); 
            
            tm.put(key[0], value); 

        }

        sc.close();
        
        Stack<String> st = new Stack<>(); 
        
        tm.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue()) 
        .forEach(e->{
        st.push(e.getKey() + " " + e.getValue());  
        });
        
        
        Iterator<String> it = st.iterator(); 
        
        while(it.hasNext()){
            System.out.println(st.pop());
        }
        
    }

    
    public static void main(String[] args){
        
        orderWithRating(); 
        
    }
        
}


