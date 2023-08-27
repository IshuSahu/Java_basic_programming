// Write a java program to implement linked list collection classes

import java.util.LinkedList;

public class LinkedListDemo {
  
  public static void main(String[] args) {
    
    // Creating a LinkedList of strings
    LinkedList<String> names = new LinkedList<String>();
    
    // Adding elements to the LinkedList
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    names.add("David");
    
    // Removing an element from the LinkedList
    names.remove(0);
    
    // Printing the size of the LinkedList
    System.out.println("Size of LinkedList: " + names.size());
    
    // Accessing an element in the LinkedList
    String first = names.get(0);
    
    // Printing the first element of the LinkedList
    System.out.println("First element: " + first);
    
    // Iterating over the LinkedList using a for-each loop
    System.out.print("LinkedList: ");
    for (String name : names) {
      System.out.print(name + " ");
    }
    System.out.println();
    
  }
  
}