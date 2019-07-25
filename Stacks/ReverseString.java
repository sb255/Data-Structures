//Reverse the order of words in a String using Stack!

import java.util.*;


public class ReverseString {
        
    public static void main(String[] args){
            
        String intro = "How are you doing today";
        
        Stack<String> st = new Stack<String>(); 
        
        for(String s : intro.split(" ")){
        
            st.push(s); 
            
        }
        
        int size = st.size(); 
        
        for(int i=0; i<size; i++){
        
            System.out.print(st.pop()+" ");
            
        }
    }
        
}


