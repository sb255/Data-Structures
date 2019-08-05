
![alt text](Vault_Images/Heading.png "Image added")

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


(Generally second type of declaration is preferred)

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

// /*---NOTE---*/: Just use (listName).get(int i) to get the elements from a list and then add it to int[]

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

// /*---NOTE---*/: Just use (listName).add(Integer i) to add elements to the list from int[]

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
        stringArray = list.toArray(stringArray);       

        }

}

// /*---Note 1---*/: Remember that we always use (listName).toArray(String[] s) for converting a List into String[] </br>
// /*---Note 2---*/: (listName).toArray(String[] s) will return a String[] so use: String[] s(or s') = (listName).toArray(String[] s)
```

</br>

## Converting String[] into List objects:

```java
//Also notice how we are printing the elements from the list using loops

public class Test {

    public static void main(String[] args) {

        String[] stringArray = {"Hello", "Hi", "Whats up"};
        List<String> list = Arrays.asList(stringArray);    

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        /* Enhanced for loop can also be used for printing the elements of the list */
        for(String s : list){
            System.out.println(s);
        }

    }

}


// /*---NOTE 1---*/: Remember we will use Arrays.asList(String[] s) for converting a String[] into a List objects </br>
// /*---NOTE 2---*/: Arrays.asList(String[] s) will return a List of String objects, so use: List<String> list = Arrays.asList(String[] s)

```
</br>

## Overview of char[] and Character list (Optional read):

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
        /*--- NOTE: This method for printing elements works for Integers, Strings and Character lists---*/
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
     *
     *    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
     *    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();  
     *
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

#### Common ArrayList Operations:

| SN | Operation | Function | Time Complexity |
| :---: | :---: | :---: | :---: |
| 01 | Adding an element to the ArrayList | add(T element) | O(1) |
| 02 | Return an element of the ArrayList using Index | T get(int index) | O(1) |
| 03 | Getting the size of the ArrayList | int size() | O(1) |
| 03 | Removing an element from a particular index in the ArrayList | remove(int index) | O(n) |
| 04 | Sorting an ArrayList | Collections.sort(List list) |  |


#### Array and ArrayList Programs:

| SN | Array/ArrayList Program | Java Program File to Demonstrate the Operation |
| :---: | :---: | :---: |
| 01 | General ArrayList Program | [Program File](Arrays%20and%20Lists/ArraysLists.java) |
| 02 | Forming subsets of an Array | [Program File](Arrays%20and%20Lists/ArraySubsets.java) |
| 03 | Calculating run-time of methods | [Program File](Arrays%20and%20Lists/CalculatingRunTime.java) |
| 04 | Finding the max length of Palindrome substring possible | [Program File](Arrays%20and%20Lists/MaxPalindromeSubString.java) |
| 05 | Program to Introduce two dimensional ArrayList | [Program File](Arrays%20and%20Lists/TwoDimensionalArrayList.java) |
| 06 | Pascal Triangle as an ArrayList | [Program File](Arrays%20and%20Lists/PascalTriangle.java) |
| 07 | Array rotation using loops | [Program File](Arrays%20and%20Lists/ArrayRotation.java) |
| 08 | Array rotation using loops 2 | [Program File](Arrays%20and%20Lists/ArrayRotation2.java) |

---------------------------------------------------------------------------------------------

# LinkedLists:

### *LinkedList is a class in Java and also a Data Structure. It contains nodes.*

```java
/*-- Node class Implementation --*/

class Node{

    int data;
    Node next;

    public Node(int data){
    this.data = data;
    }

/*-- Method to add a Node to the tail of a LinkedList --*/

    public void addNodeToTail(int addData){

        Node current = this;

        while(current!=null){

            if(current.next==null){
                current.next = new Node(addData);
                break;
            }

            current = current.next;
        }

    }

}
```
### *Removing duplicates from a LinkedList*

```java
public class RemoveDuplicates {

    /*-- Method for removing duplicates from a LinkedList --*/

    static Node removeDuplicateNodes(Node head) {

    Node n = head;

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

    /*-- Inputs from the main method --*/

    public static void main(String[] args){

        Node A = new Node(5);
        A.next = new Node(10);
        A.next.next = new Node(20);
        A.next.next.next = new Node(20);

        Node C = removeDuplicateNodes(A);

        while(C!=null){
            System.out.println(C.data);
            C = C.next;
        }

    }

}
```

#### Common LinkedList Operations:

| SN | Operation | Function | Time Complexity |
| :---: | :---: | :---: | :---: |
| 01 | Adding an element of the LinkedList | add(T element) | O(1) |
| 02 | Getting the size of the LinkedList | int size() | O(1) |
| 03 | Clearing the LinkedList | clear() | O(n) |
| 04 | Removing an element from a particular index and replacing it with another element | add(int index, T element) | O(n) |
| 05 | Converting the LinkedList to an Array | toArray() | |


#### LinkedList Programs:

| SN | LinkedList Operation | Java Program File to Demonstrate the Operation |
| :---: | :---: | :---: |
| 01 | Deleting duplicate values from the LinkedList | [Program File](LinkedLists/DeleteDuplicateNodes.java) |
| 02 | Merge two sorted LinkedList | [Program File](LinkedLists/MergeTwoSortedLists.java) |
| 03 | Print the LinkedList in reverse order | [Program File](LinkedLists/PrintInReverse.java) |
| 04 | Removing duplicates while keeping the real value | [Program File](LinkedLists/RemoveDuplicates.java) |
| 05 | Removing duplicates and removing the original Value | [Program File](LinkedLists/RemoveDuplicatesWithValue.java) |
| 06 | Removing Nth Node from the tail of the LinkedList | [Program File](LinkedLists/RemoveNthNodeFromLast.java) |
| 07 | Reversing the LinkedList and returning the Head Node | [Program File](LinkedLists/ReverseLinkedList.java) |

---------------------------------------------------------------------------------------------
# Stacks and Queues:

Stack is a class in Java while Queue is an Interface, so both will have different kinds of declaration. Stack will have a regular declaration of Java class initialization while Queue Interface can be implemented with a LinkedList.</br>

```
Stack<T> stack = new Stack<T>();
Queue<T> queue = new LinkedList<T>();
```

**Time Complexity**: Stack based operation such as pop(), push(), peek() takes **O(1)** time. Queue based operations such as add(), poll(), peek() also takes **O(1)** time. It means that the time taken for Stack operations and Queue operations is constant.

#### Stack Operations:

| SN | Operation | Function | Time Complexity |
| :---: | :---: | :---: | :---: |
| 01 | Adding an element to the Stack | push() | O(1) |
| 02 | Removing an element from the Stack | T pop() | O(1) |
| 03 | Viewing the element at top of the Stack | T peek() | O(1) |
| 04 | Checking if the Stack is empty or not | boolean isEmpty() | O(1) |

#### Queue Operations:

| SN | Operation | Terminology | Function | Time Complexity |
| :---: | :---: | :---: | :---: | :---: |
| 01 | Adding an element to the Queue | Enqueue | add(T element) | O(1) |
| 02 | Removing an element from the Queue | Dequeue | T poll() | O(1) |
| 03 | Viewing the element at top of the Queue | | T peek() | O(1) |

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

/*
 *
 * INPUT: ssssbbbeedddd
 * OUTPUT using HashSet: bsde
 * DESIRED OUTPUT: NO
 *
 */

public class Test {

    public static void main(String[] args) {

        String input = "ssssbbbeedddd";

        Set<Character> hashSet = new HashSet<Character>();

        for(int i=0; i<input.length(); i++){

            hashSet.add(input.charAt(i));

        }

        Iterator<Character> it = hashSet.iterator();

        while(it.hasNext()){
            System.out.print(it.next());
        }

    }

}

```


## Implementation of a TreeSet:

```java

/*
 * INPUT: ssssbbbeedddd
 * OUTPUT using TreeSet: bdes
 * DESIRED OUTPUT: NO
 *
 */

public class Test {

    public static void main(String[] args) {

        String input = "ssssbbbeedddd";

        Set<Character> treeSet = new TreeSet<Character>();

        for(int i=0; i<input.length(); i++){

            treeSet.add(input.charAt(i));

        }

        Iterator<Character> it = treeSet.iterator();

        while(it.hasNext()){
                System.out.print(it.next());
        }

    }

}

```

## Implementation of a LinkedHashSet:

```java

/*
 * INPUT: ssssbbbeedddd
 * OUTPUT using LinkedHashSet: sbed
 * DESIRED OUTPUT: YES
 *
 */

public class Test {

    public static void main(String[] args) {

        String input = "ssssbbbeedddd";    

        Set<Character> linkedHashSet = new LinkedHashSet<Character>();

        for(int i=0; i<input.length(); i++){

            linkedHashSet.add(input.charAt(i));

        }

        Iterator<Character> it = linkedHashSet.iterator();

        while(it.hasNext()){
            System.out.print(it.next());
        }

    }

}

```
#### Set Operations:

| SN | Operation | Function | Time Complexity |
| :---: | :---: | :---: | :---: |
| 01 | Adding an element to the Set | add() | O(1) |
| 02 | Get an Iterator object of the Set elements | Iterator iterator() |  |

---------------------------------------------------------------------------------------------

# Maps:

HashMap, TreeMap and LinkedHashMap:

## Map is an Interface in Java while HashMap, TreeMap and LinkedHashMap are classes.

### HashMap, TreeMap and LinkedHashMap:

* HashMap - Stores keys and values in an unordered way and **contains only unique keys.**
* TreeMap - Stores keys and values in a naturally ordered way and **contains only unique keys.**
* LinkedHashMap - Stores keys and values in the order of keys insertions and **contains only unique keys.**

### HashMap, TreeMap and LinkedHashMap can be used for the following kind of problems:

* Find whether a substring is part of a String or not!
* How many times a letter is occurring in a String?
* Arrange the words of a String in ASC order of their length!

```
Map<T, E> hm1 = new HashMap<T, E>();
Map<E, E> hm2 = new HashMap<E, E>();
```

Let's see the output of the code for a HashMap, TreeMap and a LinkedHashMap

```
Input: ssssbbbeedddd
```

```
Desired Output: s=4 b=3 e=2 d=4
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
                hm.put(input.charAt(i),j+1); /*-- Here it is overwriting the value of the same keys --*/

        }

        for(Character c : hm.keySet())  
            System.out.print(c+"="+hm.get(c)+" ");

    }

}
```

```
Output: b=3 s=4 d=4 e=2
```

## Alternate Implementation of a HashMap:

```java
/*----NOTE: Method containsKey can also be used to match the keys----*/

public class Test {

    public static void main(String[] args) {

        String input = "ssssbbbeedddd";
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); ++i){

                char charr = input.charAt(i);

            if (!charCounts.containsKey(charr))
                charCounts.put(charr, 1);

            else
                charCounts.put(charr, charCounts.get(charr) + 1);

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

    	TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        for(int i=0; i<input.length(); i++){

            Integer j = tm.get(input.charAt(i));

            if(j==null)
                tm.put(input.charAt(i),1);

            else
                tm.put(input.charAt(i),j+1);

        }

        for(Character c : tm.keySet())  
            System.out.print(c+"="+tm.get(c)+" ");

    }

}
```

```
Output: b=3 d=4 e=2 s=4
```

## Implementation of a LinkedHashMap:

```java
public class Test {

    static String input = "ssssbbbeedddd";

    public static void main(String[] args) {

        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

        for(int i=0; i<input.length(); i++){

            Integer j = lhm.get(input.charAt(i));

            if(j==null)
                lhm.put(input.charAt(i),1);

             else
                lhm.put(input.charAt(i),j+1);

         }

         for(Character c : lhm.keySet())  
             System.out.print(c+"="+lhm.get(c)+" ");

    }

}
```

```
Output: s=4 b=3 e=2 d=4
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

        /*--- Printing the keys and values of a HashMap using Lambdas: ---*/

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

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        for(String word : input.split(" ")){

            lhm.put(word, word.length());

        }

        /*--- Printing the keys and values in the order of ASC order of the values: ---*/

        lhm.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue())
        .forEach(e->{
         System.out.print(e.getKey() + " ");  
         });

    }

}
```
#### Common Map Operations:

| SN | Operation | Function | Time Complexity |
| :---: | :---: | :---: | :---: |
| 01 | Adding a key and a value to the Map | put(T key, T value) | O(1) |
| 02 | Getting the value of a key in a Map | T get(T key) | O(1) |
| 03 | Checking if a key exists in a Map | boolean containsKey(T key) | O(1) |
| 04 | Getting a set view of all the keys in a Map | Set keySet() | |
| 05 | Getting a set view of all the keys and the values in a Map | Set entrySet() | |


#### Map/Set Programs:

| SN | Program Function | Application | Java Program File to Demonstrate the Operation |
| :---: | :---: | :---: | :---: |
| 01 | Checking Substring | HashMap  | [Program File](HashMaps/CheckSubstring.java) |
| 02 | Ordering values using a TreeMap | TreeMap  | [Program File](HashMaps/OrderWithValuesDesc.java) |
| 03 | Deleting duplicates from a LinkedList | LinkedHashSet  | [Program File](HashSets/DeleteDuplicates.java) |
| 04 | Pangram check on a String | HashSet  | [Program File](HashSets/PangramCheck.java) |

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
* Level-Order Traversal **(Breadth First Search)**
* Pre-Order Traversal **(Depth First Search)**
* Post-Order Traversal
* In-Order Traversal

```java
class TreeNode{
    TreeNode left,right;
    int dValue;

    TreeNode(int v){
        dValue = v;
        left = null;
        right = null;
    }
}
```

## *Getting the height of a Tree:*

```java

public static int getTreeHeight(TreeNode root){

     int height1= 0, height2 = 0;

     TreeNode currentNode = root;

     if(currentNode==null)
         return 0;

     height1 = getTreeHeight(currentNode.left);  
     height2 = getTreeHeight(currentNode.right);

     //Adding 1 for height of the root node
     return height1>height2?(height1+1):(height2+1);

 }

```

#### Tree Programs:

| SN | Tree Program | Algo-Name | Java Program File to Demonstrate the Operation |
| :---: | :---: | :---: | :---: |
| 01 | Pre-Order Traversal in a Tree | Depth First Search | [Program File](Trees/PreOrderTraversal.java) |
| 02 | Post-Order Traversal in a Tree | | [Program File](Trees/PostOrderTraversal.java) |
| 03 | Calculating height of a Tree | | [Program File](Trees/TreeHeight.java) |

---------------------------------------------------------------------------------------------
