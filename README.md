# Data Structures using Java!

## *Data-Structure Topics:*

   * Arrays and Lists
   * Linked List
   * Stacks and Queues
   * Hash Tables and Hashing
   * Sets
   * Maps
   * Tree Data Structure
   * Trie Data Structure
   * Graph Data Structure

# *Arrays and Lists:* 

## Most Basic types of array declaration:

type var-name [10];

OR

type[10] var-name; 


(Generally second type of declaration is preffered)

------------------------------------------------------------------------------------------------------------------------------

## Initializing an array


int[] intArray = new int[10] 

OR

int[] intArray = {0,1,2,3,4,5,6,7,8,9}


------------------------------------------------------------------------------------------------------------------------------

## Most common methods to find the size or length of an array

arr.length -> for calculating the length of all types of array (int[], String[], char[]) 

arr.size() -> for calculating the size of an object array(Ex. List array as it stores only objects)

---------------------------------------------------------------------------------------------

## Point to remember

.length -> It is used for calculating the length of all types of array (int[], String[], char[])

.length() -> It is used for calculating the length of a String

------------------------------------------------------------------------------------------------------------------------------

## Arrays and Lists declarations:  

```java
/*---- General ways of creating int and String arrays ----*/
        
        
int[] intArray1 = new int[10];                /*-- Array size should be provided --*/                             
        
int[] intArray2 = {0,1,2,3,4,5,6,7,8,9};      /*-- Also a valid declaration --*/
        
int intArray3[] = new int[10];                /*-- Another valid declaration --*/
        
int intArray4[] = {0,1,2,3,4,5,6,7,8,9};      /*-- Another valid declaration --*/
        
String[] stringArray1 = new String[5];
        
String[] stringArray2 = {"Hello", "Hello", "Hello", "Hello", "Hello"};
        

        
        
/*---- Creating Lists for Integer objects ----*/

        
List<Integer> list1 = new ArrayList<Integer>();                 /*-- Empty List, List size not required --*/
        
List<Integer> list2 = new ArrayList<>();                        /*-- Valid declaration, List size not required --*/
        
List<Integer> list3 = new ArrayList<Integer>(new Integer(100)); /*-- Integer object 100 as first element --*/
        
List<Integer> list4 = new ArrayList<>(new Integer(120));        /*-- Integer object 120 as first element --*/
        
List<Integer> list5 = new ArrayList<Integer>(130);              /*-- Integer object 130 as first element --*/
        
        
        
        
/*---- Creating Lists for String objects ----*/
        
/*-- We use Arrays.asList(String[] s) and (listName).toArray(String[] s) for dealing with Lists and String arrays--*/

        
List<String> list6 = new ArrayList<String>(Arrays.asList(new String("Hello"))); /*-- Valid declaration for String --*/
        
List<String> list7 = new ArrayList<>(Arrays.asList(new String("Hello")));       /*-- Valid declaration for String --*/
        
List<String> list8 = new ArrayList<> (Arrays.asList("Hello", "Hi"));            /*-- Adding two elements in the list --*/
        
List<String> list9 = new ArrayList<> (Arrays.asList(stringArray2));             /*-- Passing a String array in the asList method --*/       
        
        
/*---- Referencing ----*/

        
int[] intArray5 = new int[10];     
         
int[] intArray6 = intArray5;             /*-- Such referencing can be seen inside methods --*/ 
        
List<String> list10 = new ArrayList<>();
        
List<String> list11 = list10;             /*-- Such referencing can be seen inside methods --*/

```

---------------------------------------------------------------------------------------------
</br>

## Converting List objects into int[] (until Java 7): 

```java
public class Test {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
    
        int[] intArray = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            
            intArray[i] = list.get(i); /* Auto-unboxing from Integer -> int */
  
        }

    }
    
}

/*---NOTE---*/: Just use (listName).get(int i) to get the elements from a list and then add it to int[]

```

</br>

## Converting List objects into int[] (Java 8):

```java
public class Test {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
        
        int[] intArray = list.stream().mapToInt(i->i).toArray(); 
           
    }
    
}
```

</br>

## Converting int[] into List objects:

```java
public class Test {

    public static void main(String[] args) {
        
        int[] intArray = {1,2,3,4,5,6,7}; 
        
        List<Integer> list = new ArrayList<Integer>(); 
        
        for(int i : intArray){
        
            list.add(i);   /* Auto-boxing from int -> Integer */
                
        }
           
    }
    
}

/*---NOTE---*/: Just use (listName).add(Integer i) to add elements to the list from int[]

```

</br>

## Converting List objects into String[]:

```java
public class Test {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>(); 
        list.add("Item 1"); 
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4"); 
        
        String[] stringArray = new String[list.size()];
        stringArray = list.toArray(stringArray);        /*------NOTICE------*/
         
        }
    
}

/*---Note 1---*/: Remember that we always use (listName).toArray(String[] s) for coverting a List into String[] </br>
/*---Note 2---*/: (listName).toArray(String[] s) will return a String[] so use: String[] s(or s') = (listName).toArray(String[] s)
```

</br>

## Converting String[] into List objects:

```java
Also notice how we are printing the elements from the list using loops

public class Test {

    public static void main(String[] args) {
        
        String[] stringArray = {"Hello", "Hi", "Whats up"};
        List<String> list = Arrays.asList(stringArray);    /*------NOTICE------*/ 
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)); 
        }
        
        /* Enhanced for loop can also be used for printing the elements of the list */
        for(String s : list){
            System.out.println(s);
        }
         
    }
    
}


/*---NOTE 1---*/: Remember we will use Arrays.asList(String[] s) for converting a String[] into a List objects </br>
/*---NOTE 2---*/: Arrays.asList(String[] s) will return a List of String objects, so use: List<String> list = Arrays.asList(String[] s)

```
</br>

## Overview of char[] and Charcacter list (Optional read): 

```java
public class Test {
    
    public static void main(String[] args){
        
        String name = "A Character String"; 
        /*---- Note: char is a data type and Character is the wrapper class ----*/
        char[] nameArray = name.toCharArray(); /*---- Character Array Declaration ----*/

        
        List<Character> list = new ArrayList<>(); /*---- List of Character objects ----*/
        list.add('a');
        list.add('b'); 
        
        StringBuilder sb = new StringBuilder(); 
        
        /*-- Now adding elements to String Builder from Character list--*/
        /*--- NOTE: This method for priting elements works for Integers, Strings and Character lists---*/
        for(char ch : list){
            sb.append(ch); 
        }
        
    }
 
}
```

```java

/*----NOTE: Method used for calculating the length of the array in the following: ----*/
    
    int[]                  -> array.length
    char[]                 -> array.length
    String[]               -> array.length
    List<Wrapper Class>    -> list.size() 
    
    
/*----NOTE: Method used for printing values from all types of list: Integer, Character or String----*/
    
    for(int i : IntegerList){}
    for(char c : CharacterList){}
    for(String s : StringList){}

```

</br>

## Two Dimensional (2D) Array declaration: 

```java
public class Test {

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

```

---------------------------------------------------------------------------------------------

# LinkedLists: 

### *LinkedList is a class in Java and also a Data Strucutre. It contains nodes.*

```java
class LinkedListNode{

    int data; 
    LinkedListNode head; 
    
    public LinkedListNode(int data){
        this.data = data; 
    }
    
}
```
### *Removing duplicates from a LinkedList*

```java
LinkedListNode removeDuplicateNodes(LinkedListNode head) {

LinkedListNode n = head; 
      
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
```
---------------------------------------------------------------------------------------------
# Stacks and Queues:

Stack is a class in Java while Queue is an Interface, so both will have different kinds of declaration. Stack will have a regular declaration of Java class initialization while Queue Interface can be implemented with a LinkedList.</br>

```
Stack<T> st = new Stack<T>();
Queue<T> qu = new LinkedList<T>();
```

---------------------------------------------------------------------------------------------
# Sets:

HashSet, TreeSet and LinkedHashSet also uses concept of Hashing like Maps for storing the data but **It does not contains duplicate values!!**

* HashSet - Stores the added values in the random order without duplicates.
* TreeSet - Stores the added values in the naturally ordered way without duplicates.
* LinkedHashSet - Stores the added values in the order of insertion without duplicates.

Let's see the working of a HashSet, TreeSet and a LinkedHashSet: 

```
Input: ssssbbbeedddd
```

```
Desired Output: sbed
```

## Implementation of a HashSet: 

```java
public class Test {
	
    static String input = "ssssbbbeedddd";
	
	public static void main(String[] args) {
            
        Set<Character> hm = new HashSet<Character>();
            
            for(int i=0; i<input.length(); i++){
                
                hm.add(input.charAt(i));
                
            }
            
            Iterator<Character> it = hm.iterator();
            
            while(it.hasNext()){
                System.out.print(it.next());
            }
            
	}

}
```


```
Output: bsde
```

## Implementation of a TreeSet: 

```java
public class Test {
	
    static String input = "ssssbbbeedddd";
	
	public static void main(String[] args) {
            
        Set<Character> hm = new TreeSet<Character>();
            
            for(int i=0; i<input.length(); i++){
                
                hm.add(input.charAt(i));
                
            }
            
            Iterator<Character> it = hm.iterator();
            
            while(it.hasNext()){
                System.out.print(it.next());
            }
            
	}

}
```


```
Output: bdes
```

## Implementation of a LinkedHashSet: 

```java
public class Test {
	
    static String input = "ssssbbbeedddd";
	
	public static void main(String[] args) {
            
        Set<Character> hm = new LinkedHashSet<Character>();
            
            for(int i=0; i<input.length(); i++){
                
                hm.add(input.charAt(i));
                
            }
            
            Iterator<Character> it = hm.iterator();
            
            while(it.hasNext()){
                System.out.print(it.next());
            }
            
	}

}
```


```
Output: sbed
```

---------------------------------------------------------------------------------------------

# Maps:

HashMap, TreeMap and LinkedHashMap:

## Map is an Interface in Java while HashMap, TreeMap and LinkedhasMap are classes.

### HashMap, TreeMap and LinkedHashMap:

* HashMap - Stores keys and values in an unordered way and **contains only unique keys.** 
* TreeMap - Stores keys and values in a naturally ordered way and **contains only unique keys.** 
* LinkedHashMap - Stores keys and values in the order of keys insertions and **contains only unique keys.**

### HashMap, TreeMap and LinkedHashMap can be used for the following kind of problems:

* Find whether a substring is part of a String or not!
* How many times a letter is ocurring in a String?
* Arrange the words of a String in ASC order of their length!

```
Map<T, E> hm1 = new HashMap<T, E>(); 
Map<E, E> hm2 = new HashMap<E, E>(); 
```

Let's see the ouput of the code for a HashMap, TreeMap and a LinkedHashMap

```
Input: ssssbbbeedddd
```

```
Desired Output: s4b3e2d4
```
## Implementation of a HashMap: 

```java
public class Test {
	
    static String input = "ssssbbbeedddd";
	
    public static void main(String[] args) {
            
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            
        for(int i=0; i<input.length(); i++){
                
            Integer j = hm.get(input.charAt(i));
                
            if(j==null)
                hm.put(input.charAt(i),1);
                
            else
                hm.put(input.charAt(i),j+1); |--* Here it is overwriting the value of the same keys *--| 
                
        }
            
        for(Character c : hm.keySet())  
            System.out.print(c+""+hm.get(c));
            
    }

}
```

```
Output: b3s4d4e2
```

## Alternate Implementation of a HashMap: 

```java
/*----NOTE: Method containsKey can also be used to match the keys----*/

public class Test { 
    
    public static void main(String[] args) {
          
        String input = "ssssbbbeedddd";
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); ++i)
        {
                char charr = input.charAt(i);

            if (!charCounts.containsKey(charr))
            {
                charCounts.put(charr, 1);
            }
            
            else
            {
                charCounts.put(charr, charCounts.get(charr) + 1);
            }
        }

        System.out.println(charCounts);
    
    }

}
```

```
Output: {b=3, s=4, d=4, e=2}
```


## Implementation of a TreeMap: 

```java
public class Test {
	
    static String input = "ssssbbbeedddd";
	
    public static void main(String[] args) {
            
    	TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
            
        for(int i=0; i<input.length(); i++){
                
            Integer j = hm.get(input.charAt(i));
                
            if(j==null)
                hm.put(input.charAt(i),1);
                
            else
                hm.put(input.charAt(i),j+1); 
                
        }
            
        for(Character c : hm.keySet())  
            System.out.print(c+""+hm.get(c));
            
    }

}
```

```
Output: b3d4e2s4
```

## Implementation of a LinkedHashMap: 

```java
public class Test {
	
    static String input = "ssssbbbeedddd";
	
    public static void main(String[] args) {
            
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
            
        for(int i=0; i<input.length(); i++){
                
            Integer j = hm.get(input.charAt(i));
                
            if(j==null)
                hm.put(input.charAt(i),1);
                
             else
                hm.put(input.charAt(i),j+1); 
                
         }
            
         for(Character c : hm.keySet())  
             System.out.print(c+""+hm.get(c));
            
    }

}
```

```
Output: s4b3e2d4
```
## Printing all the Keys and the Values from a HashMap:

```java
public class Test { 
    
    public static void main(String[] args) {
          
        String sentence = "I have some work for all of you guys.";
        
        String input = sentence.substring(0, sentence.length()-1); 
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
            
        for(String word : input.split(" ")){
                
            hm.put(word, word.length()); 
                
        }
            
        /*--- Printing the keys and values of a hashMap using Lambdas: ---*/
        
        hm.entrySet().forEach(e->{
        System.out.println(e.getKey() + " " + e.getValue());  
        });
        
        /*--- Printing the values of a HashMap using conventional for loop: ---*/
        
        for(Entry<String, Integer> e : hm.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
        }
                
    }

}
```
## Printing the Keys of a Map in the ASC order of its Values:

```
Input String: I have some work for all of you guys.
```

```
Output String: I of for all you have some work guys
```

```java
public class Test { 
    
    public static void main(String[] args) {
          
        String sentence = "I have some work for all of you guys.";
        
        String input = sentence.substring(0, sentence.length()-1); 
        
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
            
        for(String word : input.split(" ")){
                
            hm.put(word, word.length()); 
                
        }
            
        /*--- Printing the keys and values in the order of ASC order of the values: ---*/
               
        hm.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue()) 
        .forEach(e->{
         System.out.print(e.getKey() + " ");  
         });
                
    }

}
```

---------------------------------------------------------------------------------------------

# Trees:

### There are two types of Tree:
* Heap
* Binary Search Tree(BST)

### Heap: There are two types of Heap, one is MinHeap and other is MaxHeap.

* MinHeap: When root is the smallest element!
* MaxHeap: When root is the largest element!

### Binary Search Tree(BST): When the left child is less than the root and the right child is greater than the root!

### Tree-Algorithms:
* Level-Order Travelsal **(Breadth First Search)**
* Pre-Order Travelsal **(Depth First Search)**
* Post-Order Travelsal
* In-Order Travelsal

```java
class Node{
    Node left,right;
    int dValue;
    
    Node(int v){
        dValue = v;
        left = null;
        right = null;
    }
}
```

## *Getting the height of a Binary Tree:*

```java

   int getTreeHeight(Node root){
      
        int height1= 0, height2 = 0; 

        Node n = root; 

        if(root==null)
            return -1;
            
        if(root.right==null && root.left==null)
            return 0;  

        height1 = 1 + getTreeHeight(root.left);  
        height2 = 1 + getTreeHeight(root.right); 

        return height1>height2?height1:height2; 

    }
```

---------------------------------------------------------------------------------------------
