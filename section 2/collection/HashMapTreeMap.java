
    //Write a java program to implement hashmap and treemap collection classes

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTreeMap {
  
  public static void main(String[] args) {
    
    // Creating a HashMap of strings
    HashMap<String, Integer> ages = new HashMap<String, Integer>();
    
    // Adding elements to the HashMap
    ages.put("Alice", 25);
    ages.put("Bob", 30);
    ages.put("Charlie", 35);
    ages.put("David", 40);
    
    // Removing an element from the HashMap
    ages.remove("Alice");
    
    // Printing the size of the HashMap
    System.out.println("Size of HashMap: " + ages.size());
    
    // Accessing an element in the HashMap
    int charlieAge = ages.get("Charlie");
    
    // Printing Charlie's age
    System.out.println("Charlie's age: " + charlieAge);
    
    // Iterating over the HashMap using a for-each loop
    System.out.print("HashMap: ");
    for (String name : ages.keySet()) {
      System.out.print(name + "=" + ages.get(name) + " ");
    }
    System.out.println();
    
    // Creating a TreeMap of strings
    TreeMap<String, Integer> heights = new TreeMap<String, Integer>();
    
    // Adding elements to the TreeMap
    heights.put("Alice", 170);
    heights.put("Bob", 175);
    heights.put("Charlie", 180);
    heights.put("David", 185);
    
    // Removing an element from the TreeMap
    heights.remove("Alice");
    
    // Printing the size of the TreeMap
    System.out.println("Size of TreeMap: " + heights.size());
    
    // Accessing an element in the TreeMap
    int charlieHeight = heights.get("Charlie");
    
    // Printing Charlie's height
    System.out.println("Charlie's height: " + charlieHeight);
    
    // Iterating over the TreeMap using a for-each loop
    System.out.print("TreeMap: ");
    for (String name : heights.keySet()) {
      System.out.print(name + "=" + heights.get(name) + " ");
    }
    System.out.println();
    
  }
  
}

