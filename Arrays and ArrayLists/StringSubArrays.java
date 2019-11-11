//-- FINDING ALL POSSIBLE CONTIGUOUS SUBARRAYS OF AN ARRAY

public class StringSubArrays{
    
    static int count=0;
    
    public static void subArrays(int start, int end, String s){
        
        if(start>end){
            System.out.println("Total number of subarrays  "+count);
        }
        
        else if(start<end){
            
            StringBuilder sb = new StringBuilder(); 
            
            for(int i=start; i<end; i++){
                sb.append(s.charAt(i)); 
            }
            
            System.out.println(sb.toString());
           
            count++; 
            
            subArrays(start+1,end,s);
           
        }
        
        else{
            subArrays(0, end-1, s);
        }
        
    }
    
    public static void main(String[] args){
        
    String input = "abcd";
    subArrays(0, input.length(), input);
        
    }
    
}

