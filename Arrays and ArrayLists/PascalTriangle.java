
import java.util.ArrayList;

/*
 * Program focusing on returning the Pascal triangle as an ArrayList!
 */

public class Test {
    
    static ArrayList<ArrayList<Integer>> pascalTriangle(int A){
        
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        int[][] arr = new int[A][A]; 
        
        for(int i=0; i<A; i++){
            for(int j=0; j<=i; j++){
                
                if(i==j || j==0)
                    arr[i][j] = 1; 
                else
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; 
            }
        }
        
        
        
        for(int i=0; i<A; i++){
            
            ArrayList<Integer> row = new ArrayList<>();
            
            for(int j=0; j<=i; j++){
                row.add(arr[i][j]);
            }
            
            rows.add(row);
            
        }
        
        return rows; 
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = pascalTriangle(8);
        
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<i+1; j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println("");
        }

    }

}
