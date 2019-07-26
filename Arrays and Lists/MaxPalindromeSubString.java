/*
 * Finding the PALINDROME Substring from a String of Max Length! 
 * 
 */

/*
 *
 * Time Efficiency: O(A*2), worst case. Need Optimization!  
 *
 */


public class MaxPalindromeSubString {
    
    public static String palindromicString(String A){
        
        
        String finalValue = "";
        int a=0; 
        
        String reverseOfA = new StringBuilder(A).reverse().toString();
        
        if(A.equals(reverseOfA))
            return A; 
        
        for(int i=0; i<A.length(); i++){
            for(int j=A.length(); j>i; j--){
                            
                String x = A.substring(i, j); 
            
                reverseOfA = new StringBuilder(x).reverse().toString();
            
                if(x.equals(reverseOfA)){
                    if(x.length()>a){
                        finalValue = x;
                        a = x.length(); 
                    }
                }
                                            
            }
        }
        
        return finalValue; 
    }

    public static void main(String[] args) {
        System.out.println(palindromicString("asasasasasasasasa"));
    }
    
}

