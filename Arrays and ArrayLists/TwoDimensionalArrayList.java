import java.util.*;

public class TwoDimensionalArrayList {

    /*Create a 2D ArrayList and print its values*/
   
    /*    Both are valid declarations:
    
          ArrayList<ArrayList<Integer>> list = new ArrayList<>();
          ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();  
    
    */
    
    public static void main(String[] args){
    
            ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
            
            for(int i=0; i<5; i++){
                ArrayList<Integer> row = new ArrayList<>();
                for(int j=0; j<5; j++){
                    row.add(j*j); 
                }
                rows.add(row); 
            }
            
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    System.out.print(rows.get(i).get(j)+" ");
                }
                System.out.println("");
            }

    }
    
}

