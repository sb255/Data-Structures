import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

//Checking whether a String is a Pangram or not. 

public class PangramCheck {
    
    public static void main(String args[]){
        
        HashSet<Character> hashset = new HashSet<>();
        
        String x = "We promptly judged antique ivory buckles for the next prize"; 
        x = x.replaceAll("\\s", "").trim().toLowerCase();
        
        for(int i=0; i<x.length(); i++){
            
            hashset.add(x.charAt(i)); 
            
        }
        
        if(hashset.size()==26)
            System.out.println("This is a Pangram");
        
        else
            System.out.println("This is not a Pangram");
        
        
    }
    
}

